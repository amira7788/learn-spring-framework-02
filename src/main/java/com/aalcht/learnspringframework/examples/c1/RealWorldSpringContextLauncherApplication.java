package com.aalcht.learnspringframework.examples.c1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class RealWorldSpringContextLauncherApplication {

    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext
                             (RealWorldSpringContextLauncherApplication.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(" find max  = "+context.getBean(BusinessCalculationService.class).findMax());
            System.out.println(" find max mysql = "+new BusinessCalculationService(new MysqlDataDbDataService()).findMax());
            System.out.println(" find max mango = "+new BusinessCalculationService(new MongoDbDataService()).findMax());
        }
    }
}
