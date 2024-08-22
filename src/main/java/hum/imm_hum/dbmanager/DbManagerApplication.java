package hum.imm_hum.dbmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "hum.imm_hum.dbmanager.repository")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DbManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbManagerApplication.class, args);
    }

}
