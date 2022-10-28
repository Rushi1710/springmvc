package com.speringmvc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
//@EnableWebMvc
@ComponentScan
@PropertySource("classpath:db.properties")
public class WebConfig  implements WebMvcConfigurer {
	
	
	public WebConfig() {
		System.out.println("web config started");
	}
	
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr =new InternalResourceViewResolver();
		vr.setPrefix("/");
		vr.setSuffix(".jsp");
		return vr;
	}
	
  	@Value("${driver}")
   	private String driver;
   	@Value("${url}")
   	private String url;
   	@Value("${user}")
   	private String user;

   	@Value("${password}")
   	private String password;
   	
   	@Bean
   	public DataSource dataSource() {
   		DriverManagerDataSource ds = new DriverManagerDataSource();
   		
   		ds.setDriverClassName(driver);
		ds.setUrl(url);
		ds.setUsername(user);	
		ds.setPassword(password);
		return ds;
   	}

    @Bean
    	public JdbcTemplate template(DataSource ds) {
    		System.out.println("template creating....");
    		return new JdbcTemplate(ds);
    	}
}
