package com.online.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;

import com.online.app.service.LoginService;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Autowired
	LoginService service;
	
	@Autowired
	UserAuthSuccessHandler successHandler;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(service);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/user").hasRole("USER")
		.antMatchers("/user/*").hasRole("USER")
		.antMatchers("/seller").hasRole("SELLER")
		.antMatchers("/seller/*").hasRole("SELLER")
		.antMatchers("/").permitAll()
		.and().formLogin()
		.successHandler(successHandler);
		
		http.logout(logout -> logout
				.logoutUrl("/logout")
				.addLogoutHandler(new SecurityContextLogoutHandler())
				);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() { 
	    //return new BCryptPasswordEncoder(); 
		return NoOpPasswordEncoder.getInstance(); // using this for the test purpose only
	}

}
