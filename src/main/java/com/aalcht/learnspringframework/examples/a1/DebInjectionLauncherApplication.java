package com.aalcht.learnspringframework.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
//setter injection and constructor injection
//YourBusinessClass have 2 Dependacy 1 and 2
@Component
class YourBusinessClass{
//field injection with Autowired

    Dependency1 dependency1;

    Dependency2 dependency2;

    //constractor injection we don't need a @Autowired it is recommended
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println("Constructor Injection - YourBusinesClass ");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public String toString() {
        return "Using "+dependency1+" and "+dependency2;
    }


//  setter injection
//    @Autowired
//    public void setDependency1(Dependency1 dependency1) {
//        System.out.println("Setter injection dependency1");
//        this.dependency1 = dependency1;
//    }
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        System.out.println("Setter injection dependency1");
//        this.dependency2 = dependency2;
//    }
}
@Component
class Dependency1{


}
@Component
class Dependency2{

}

@Configuration
@ComponentScan
public class DebInjectionLauncherApplication {

    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext
                             (DebInjectionLauncherApplication.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(YourBusinessClass.class));
        }
    }
}
