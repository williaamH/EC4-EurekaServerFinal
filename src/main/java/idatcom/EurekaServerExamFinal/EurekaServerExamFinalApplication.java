package idatcom.EurekaServerExamFinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerExamFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerExamFinalApplication.class, args);
	}

}
