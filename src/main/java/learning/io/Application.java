package learning.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
@ComponentScan(value = { "learning.io" })
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		log.info("| MaprDb OJAI Demo!!!");
	}
}
