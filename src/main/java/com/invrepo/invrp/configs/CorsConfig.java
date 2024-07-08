package com.invrepo.invrp.configs;


import jakarta.ws.rs.HttpMethod;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.http.HttpHeaders;



@Configuration
public class CorsConfig  {

   @Bean
    public WebMvcConfigurer webConfig(){
       return new WebMvcConfigurer() {
           @Override
           public void addCorsMappings(CorsRegistry registry) {
               registry.addMapping("/**")
                       .allowedOrigins("http://localhost:4200")
                       .allowedMethods(HttpMethod.GET  ,HttpMethod.POST,HttpMethod.DELETE, HttpMethod.PUT)
                       .allowedHeaders(HttpHeaders.CONTENT_TYPE,HttpHeaders.AUTHORIZATION);

           }
       };
   }
}

