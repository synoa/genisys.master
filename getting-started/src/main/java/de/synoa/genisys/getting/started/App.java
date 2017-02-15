package de.synoa.genisys.getting.started;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({ "classpath:META-INF/spring/mongodb.xml", "classpath:META-INF/spring/activemq.xml" })
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
