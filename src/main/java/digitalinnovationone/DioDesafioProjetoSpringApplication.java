package digitalinnovationone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DioDesafioProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioDesafioProjetoSpringApplication.class, args);
	}

}
