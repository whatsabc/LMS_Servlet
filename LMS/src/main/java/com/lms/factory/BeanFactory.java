package com.lms.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 创建Bean对象的工厂进行解耦
 * 1.需要配置文件配置我们的service和dao
 *  配置内容：（key=value）
 * 2.读取配置文件中的配置内容，反射创建对象
 *  配置文件可以是xml也可以是properties
 *
 * 如果我们想要单例对象，我们定义一个容器用于存放我们创建的对象，防止产生的单例对象被垃圾回收
 *
 */
public class BeanFactory {
    //定义一个properties对象
    private static Properties properties;

    //定义一个Map，用于存放我们要创建的对象，我们把他成为容器
    private static Map<String,Object> beans;

    //使用静态代码块为properties对象赋值
    static{
        //实例化对象
        properties=new Properties();
        //获取properties文件的对象流
        InputStream inputStream=BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            properties.load(inputStream);
            //实例化容器
            beans=new HashMap<>();
            //取出配置文件中所有的Key
            Enumeration keys=properties.keys();
            //遍历每局
            while(keys.hasMoreElements()){
                String key=keys.nextElement().toString();
                String beanPath=properties.getProperty(key);
                Object value=Class.forName(beanPath).newInstance();
                beans.put(key,value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据bean的名称获取bean对象
     * 现在这个对象已经是单例的
     * @return
     */
    public static Object getBean(String beanName){
        return beans.get(beanName);
    }

    /**
     * 根据bean的名称获取bean对象
     * **不使用map的时候这样获取对象，使用map后根据上面的方法获取对象**
     * @return
     */
    public static Object getBean_(String beanName){
        Object bean=null;
        String beanPath=properties.getProperty(beanName);//每次都会默认构造函数创建对象，所以每次都是新对象
        try {
            bean=Class.forName(beanPath).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return bean;
    }
}
