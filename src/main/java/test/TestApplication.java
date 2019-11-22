package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDbFactory;

@SpringBootApplication
public class TestApplication {
    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(new SimpleMongoClientDbFactory("mongodb://localhost:1234/test"));
    }

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
