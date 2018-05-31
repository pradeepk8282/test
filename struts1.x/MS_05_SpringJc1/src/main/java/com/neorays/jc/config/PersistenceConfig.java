package com.neorays.jc.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@PropertySource({ "classpath:db.properties" })
@ComponentScan({ "com.neorays.jc" })
public class PersistenceConfig {

	@Autowired
	private Environment env;

	@Bean
	public LocalSessionFactoryBean sessionFactory() throws InterruptedException {
		System.out.println("LSF1");
	
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(restDataSource());
		sessionFactory.setPackagesToScan(new String[] { "com.neorays.jc.dto" });
		sessionFactory.setHibernateProperties(hibernateProperties());
		System.out.println("LSF2");
		return sessionFactory;
	}

	@Bean
	public DataSource restDataSource() {
		System.out.println("DS1");
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(env.getProperty("db.driver"));
		dataSource.setUrl(env.getProperty("db.url"));
		dataSource.setUsername(env.getProperty("db.username"));
		dataSource.setPassword(env.getProperty("db.password"));
		System.out.println("DS2");
		return dataSource;
	}

	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
System.out.println("TC1");
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory);
System.out.println("TX2");
		return txManager;
	}

	/*@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() 
	{
		System.out.println("EX1");
		System.out.println("Ex2");
		return new PersistenceExceptionTranslationPostProcessor();
		
	}*/

	Properties hibernateProperties() 
	{
		System.out.println("HP1");
		return new Properties() {
			{
				setProperty("hibernate.hbm2ddl.auto",
						env.getProperty("hibernate.hbm2ddl.auto"));
				// setProperty("hibernate.dialect",
				// env.getProperty("hibernate.dialect"));
				setProperty("hibernate.globally_quoted_identifiers", "true");
				System.out.println("HP2");
			}
		};
	}
}
