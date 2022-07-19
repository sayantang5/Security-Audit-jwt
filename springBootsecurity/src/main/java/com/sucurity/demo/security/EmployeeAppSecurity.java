package com.sucurity.demo.security;

import javax.servlet.Filter;




import com.sucurity.demo.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;





@EnableWebSecurity(debug=true)
public class EmployeeAppSecurity extends WebSecurityConfigurerAdapter {
	
	@Autowired
	EmployeeService service;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.userDetailsService(service);
		
	}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		

		http.authorizeRequests()
		.antMatchers(HttpMethod.POST, "/register")
		.permitAll()
		.anyRequest()
		.authenticated()
		.and().formLogin().and().csrf()
		.disable().addFilterBefore(mycustomauthenticationFilter(), UsernamePasswordAuthenticationFilter.class)
		.addFilterBefore( new MyAuthorizationFilter(authenticationManager()), BasicAuthenticationFilter.class)
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		;
	}


	private mycustomauthenticationFilter mycustomauthenticationFilter() throws Exception {
		
		mycustomauthenticationFilter filter = new mycustomauthenticationFilter(authenticationManager());
		
		return filter;
	}

}
