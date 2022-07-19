package com.audit.demo.audit;

import javax.servlet.Filter;

import com.audit.demo.service.studentRegisterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@EnableWebSecurity(debug =true)
public class EnquiryAppSecurity  extends  WebSecurityConfigurerAdapter{
	
	
	@Autowired
	studentRegisterService RegisterService ;
	
	
	
protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.userDetailsService(RegisterService);
		
}

@Override
	protected void configure(HttpSecurity http) throws Exception {
		
	
	
	http.authorizeRequests()
	.antMatchers(HttpMethod.POST, "/register")
	.permitAll()
	.anyRequest()
	.authenticated()
	.and().httpBasic().and().csrf().disable();
	
}
}
	


