package org.employee.api.configuartion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfiguration
{
    @Bean
    public RestTemplate getRestTemplate()
    {
        RestTemplate restTemplate=new RestTemplate();
        return restTemplate;
    }
}
