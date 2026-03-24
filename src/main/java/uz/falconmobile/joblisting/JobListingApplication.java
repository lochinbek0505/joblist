package uz.falconmobile.joblisting;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Logosmart API", version = "1.0", description = "Speech Therapy App Backend"))
public class JobListingApplication {


    public static void main(String[] args) {
        SpringApplication.run(JobListingApplication.class, args);
    }

}
