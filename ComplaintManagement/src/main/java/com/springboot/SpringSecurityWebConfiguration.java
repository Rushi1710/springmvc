package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
@EnableWebSecurity
public class SpringSecurityWebConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private  UserDetailsService detailsService;  

	@Autowired
	CustomerAuthenticationHandler authenticationHandler;
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(detailsService);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		
		http.authorizeRequests()
			.antMatchers("/admindashbord").hasRole("ADMIN")
			.antMatchers("/dashboard","/complaint").hasAnyRole("CUSTOMER","ADMIN")
			.antMatchers("/","/register").permitAll()
			.and()
			.formLogin()
			.successHandler(authenticationHandler)
			.loginPage("/loginuser")
			.and()
			.logout()
			.permitAll();
			
	}
	


}
