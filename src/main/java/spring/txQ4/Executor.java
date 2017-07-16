package spring.txQ4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executor {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-tx-config.xml");
        TransactionServices transactionServices = applicationContext.getBean(TransactionServices.class);
        transactionServices.transactAmount("Ram", "Leela", 10000);
    }
}
