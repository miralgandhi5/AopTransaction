package springQ3;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

import java.io.IOException;

@Aspect
public class MyAspect {


    @AfterThrowing(pointcut = "execution(void springQ3.MyDemoClass3.display()) throws )", throwing = "ex")
    void displayAfterInvoked(IOException ex) {
        System.out.println("Invoke method called after exception thrown");
    }
}
