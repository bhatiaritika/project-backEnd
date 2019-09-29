package com.niit.backend;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
@Configuration
@ComponentScan(basePackages = "com.niit")
@EnableTransactionManagement
public class AppContxt {
	
	@Bean(name="dataSource")
	@Autowired
	public DataSource dataSource() 
	{
		System.out.println("dataSource created");
		
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		System.out.println("dataSource passed");
		
		return dataSource;
	}
public Properties getHibernateProperties() 
{
	System.out.println("properties created");
	Properties properties=new Properties();
	properties.setProperty("hibernate.dialect","org.hibernate.dialect.H2Dialect" );
    properties.setProperty("hibernate.show_sql","true");
    properties.setProperty ("hibernate.hbm2ddl.auto", "update");
    System.out.println("properties passed");
    
    return properties;
}
@Bean(name="sessionFactory")
@Autowired
public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {
	System.out.println("localfactory session created");
	LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();
	sessionFactory.setDataSource(dataSource);
	sessionFactory.setHibernateProperties(getHibernateProperties());
	sessionFactory.setPackagesToScan("com.niit");
	System.out.println("localfactory session passed");
	
	return sessionFactory;
}
@Bean(name="transactionManager")
@Autowired
public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) 
{
	System.out.println("transactionManager created");
	HibernateTransactionManager transactionManager=new HibernateTransactionManager();
	transactionManager.setSessionFactory(sessionFactory);

	System.out.println("transactionManager passed");
	
	return transactionManager ;

}
}





	

