package edu.gatech.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

//Reflect, run any object by revise pro files.
public class ReflectTest {

    public static void main(String[] args) throws Exception {

        // step 1, create and load pro file
        Properties pro = new Properties();
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        //step 2 get data from pro file
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //step 3, load data into memory
        Class cls= Class.forName(className);

        //step 4, get instance of object and method
        Object o = cls.newInstance();
        Method method = cls.getMethod(methodName);

        // run method
        method.invoke(o);



    }
}
