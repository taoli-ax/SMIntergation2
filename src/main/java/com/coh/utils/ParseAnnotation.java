package com.coh.utils;

import com.coh.annotation.MyBean;
import com.coh.config.JavaConfigForDoll;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ParseAnnotation {

    Map<String,Object> map=new HashMap<>();
    public  static void  main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        ParseAnnotation parseAnnotation=new ParseAnnotation();
        parseAnnotation.parseMethodAnnotation();
        Object doll=parseAnnotation.getBean("MyAnnotation");
        System.out.println(doll);
    }
    public Object getBean(String bean){
       return map.get(bean);
    }
    //解析方法注解
    public void parseMethodAnnotation() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
            // 方法反射
            Class<JavaConfigForDoll> javaConfigForDollClass=JavaConfigForDoll.class;
            Method myDoll= javaConfigForDollClass.getMethod("MyDoll");
            // 获取MyBean注解对象
            MyBean annotation=myDoll.getAnnotation(MyBean.class);
            String value= annotation.value();
            Object invoke=myDoll.invoke(javaConfigForDollClass.newInstance());
        System.out.println("value: "+value+" ==== "+"invoke:"+invoke);
            map.put(value,invoke);

    }
}
