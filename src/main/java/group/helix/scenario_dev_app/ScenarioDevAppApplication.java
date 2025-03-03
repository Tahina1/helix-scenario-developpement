package group.helix.scenario_dev_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ScenarioDevAppApplication {

	public static void main(String[] args) {
		System.out.println("README: password is encoded as: ");
		System.out.println(new BCryptPasswordEncoder().encode("password"));
		SpringApplication.run(ScenarioDevAppApplication.class, args);
	}

}
