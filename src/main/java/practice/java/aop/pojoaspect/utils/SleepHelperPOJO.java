package practice.java.aop.pojoaspect.utils;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by patrick on 2016/2/23.
 */
public class SleepHelperPOJO {
    public SleepHelperPOJO(){

    }


    public void afterSleep() throws Throwable {
        System.out.println("起床后要先穿衣服！");
    }


    public void beforeSleep() throws Throwable {
        System.out.println("睡觉之前要洗澡换衣服！");
    }
}
