package com.coh.config;

import com.coh.annotation.MyBean;
import com.coh.pojo.Doll;

public class JavaConfigForDoll {
    @MyBean("myAnnotation")
    public Doll MyDoll(){
        return new Doll();
    }
    public  Object getBean(String BeanName){
        return null;
    }
}
