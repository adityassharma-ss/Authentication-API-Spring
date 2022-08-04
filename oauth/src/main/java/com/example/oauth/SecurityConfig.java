package com.example.oauth;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configurers.oauth2.client.OAuth2LoginConfigurer;

@Configuration
public class SecurityConfig extends WebSecurityConfiguration {

    @Override
    public void configure(HttpSecurity httpSecurity){
        try {
            OAuth2LoginConfigurer<HttpSecurity> httpSecurityOAuth2LoginConfigurer = httpSecurity
                    .antMatcher("/**").authorizeRequests()
                    .antMatchers("/").permitAll()
                    .anyRequest().authenticated()
                    .and()
                    .oauth2Login();
        } 
    }
}
