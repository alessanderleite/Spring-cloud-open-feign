package br.com.alessanderleite.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

import br.com.alessanderleite.TodoClient;

@Configuration
@EnableFeignClients(clients = TodoClient.class)
public class FeignConfig {

}
