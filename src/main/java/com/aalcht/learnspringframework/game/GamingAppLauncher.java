package com.aalcht.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.aalcht.learnspringframework.game")
public class GamingAppLauncher {

    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext
                             (GamingAppLauncher.class)) {

            context.getBean(GamingConsol.class).up();
            context.getBean(GameRunner.class).run();
            context.getBean(MarioGame.class).right();
        }
    }
}
