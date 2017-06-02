package com.maven.springboot;

import com.maven.springboot.beans.Auto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.maven.springboot.beans");
        Auto servicio = applicationContext.getBean("auto", Auto.class);
        System.out.println("El valor es " + servicio.getMarca().getDescripcion());

        SpringApplication.run(App.class, args);

    }
}
