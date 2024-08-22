package hum.imm_hum.dbmanager.config;

import hum.imm_hum.dbmanager.cervice.MessagesService;
import hum.imm_hum.dbmanager.repository.MessagesRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackageClasses = MessagesRepository.class)
public class MessagesConfiguration {


}
