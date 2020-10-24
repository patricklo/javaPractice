package practice.java.aop.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by patrick on 2016/2/23.
 */
public class TestMainAJ {
    public static void main(String[] args){
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("springmvc-servlet.xml");
        SleepableAJ human = (SleepableAJ)appCtx.getBean("human");
        human.sleep();
    }
}
