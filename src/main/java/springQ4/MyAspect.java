package springQ4;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {


    @Before("@annotation(Deprecated)")
    void displayBeforeInvoked() {
        System.out.println("Invoke method called before deprecated method");
    }
}
