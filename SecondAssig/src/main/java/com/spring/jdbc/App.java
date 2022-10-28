package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.databases.Studentdatabases;
import com.spring.jdbc.entity.Address;
import com.spring.jdbc.entity.Student;

/**
 * Hello world!
 *
 */

@Configuration
@ComponentScan
@PropertySource("classpath:db.properties")
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext con = new AnnotationConfigApplicationContext(App.class) ;
    		//insert
    	Studentdatabases bean = con.getBean(Studentdatabases.class);
     Address address=new Address();
//       address.setCity("kamothe");
//       address.setPincode(210);
//       
      Student s1=new Student();
//       s1.setAddress(address);
//       s1.setId(110);
//       s1.setName("tushar");
//       
//       System.out.println(bean.insert(s1));
//       System.out.println("done");
    	
      
      // update 
//    	s1.setName("devda");
//    	s1.setId(103);
//    	 
//    	int  result = bean.chang(s1);
//    	System.out.println(result);
    	
    	
    	// delete
//    	s1.setId(101);
//        int result1 =bean.delete(s1);
//        System.out.println("delete") ;
//    	
    	
     
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
   		System.out.println("data source creating....");

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
