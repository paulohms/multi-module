package br.com.paulo.app.config;

import br.com.paulo.model.Notificador;
import br.com.paulo.model.Sms;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public Notificador notificador() {
        return new Sms();
    }

}
