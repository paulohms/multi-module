package br.com.paulo.app;

import br.com.paulo.app.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                Main.class.getPackage().getName());

        UserService userService = applicationContext.getBean(UserService.class);
        userService.notifySystem();

        applicationContext.close();

    }

}
