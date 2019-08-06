package com.aop;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

/**
 * @ClassName DynaProxyHello
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/7/2 21:19
 * @Version 1.0
 */
public class DynaProxyHello implements InvocationHandler {


    private Object target;//目标对象


    /**
     * 通过反射来实例化目标对象
     * @param object
     * @return
     */
    public Object bind(Object object) {


        this.target = object;
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(), this);
    }


    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object result = null;
        Logger.start();//添加额外的方法
        //通过反射机制来运行目标对象的方法
        result = method.invoke(this.target, objects);
        Logger.end();
        return result;
    }
}
