package recipes;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Scanner;


@SpringBootApplication
public class RecipesApplication {
    public static void main(String[] args) {
       SpringApplication.run(RecipesApplication.class, args);
    }
}
