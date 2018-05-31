package com.cluster.configuration;

import java.util.Locale;

import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.FileTemplateResolver;

@Configuration
@ComponentScan(basePackages ={"com.cluster.controller"})
@EnableWebMvc
public class AppConfiguration extends WebMvcConfigurerAdapter {
	 @Autowired
	   private ApplicationContext applicationContext;
public AppConfiguration() {
System.out.println("AppConfiGuration file");
}
	 @Bean
	   public SpringResourceTemplateResolver templateResolver() {
		 System.out.println("SpringResourceTemplateResolver");
	      SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
	      templateResolver.setApplicationContext(applicationContext);
	      templateResolver.setPrefix("/WEB-INF/views/");
	      templateResolver.setSuffix(".html");
	      return templateResolver;
	   }
/*	@Bean(name = "templateResolver")
	public FileTemplateResolver getTemplateResolver() {
		//this class is for reading local system hardisk
		FileTemplateResolver templateResolver = new FileTemplateResolver();
		//templateResolver.setPrefix("D:/External/templates/");
		templateResolver.setPrefix("/WEB-INF/views/");
		templateResolver.setSuffix(".html");
		templateResolver.setCharacterEncoding("UTF-8");
		templateResolver.setTemplateMode("HTML5");
		templateResolver.setCacheable(false);
		// templateResolver.setCacheTTLMs(20000L);
		return templateResolver;
	}*/

	@Bean(name = "templateEngine")
	public SpringTemplateEngine getTemplateEngine() {
		SpringTemplateEngine templateEngine = new SpringTemplateEngine();
		templateEngine.setTemplateResolver(templateResolver());
		return templateEngine;
	}

	@Bean(name = "viewResolver")
	public ThymeleafViewResolver getViewResolver() {
		ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
		viewResolver.setTemplateEngine(getTemplateEngine());
		viewResolver.setCharacterEncoding("UTF-8");
		return viewResolver;
	}

	// end Thymeleaf specific configuration
	
	/*@Bean(name = "messageSource")
	public MessageSource getMessageSource() {
	//this class is for reading local system hardisk
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
	//	messageSource.setBasename("file:D:/External/Properties/msg");
		messageSource.setBasename("/com/neorays/commons/msg");
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}*/
	@Bean(name = "messageSource")
	public MessageSource getMessageSource() {
	ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
	//	messageSource.setBasename("file:D:/External/Properties/msg");
		messageSource.setBasename("/com/cluster/commons/msg");
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}
	
	@Bean(name = "localValidatorFactoryBean")
	public LocalValidatorFactoryBean getLocalValidatorFactoryBean() {
		LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
		localValidatorFactoryBean.setValidationMessageSource(getMessageSource());
		return localValidatorFactoryBean;
	}
	@Override
	public Validator getValidator() {
	    return getLocalValidatorFactoryBean();
	}

	@Bean
	public LocaleResolver localeResolver() {
		CookieLocaleResolver resolver = new CookieLocaleResolver();
		resolver.setDefaultLocale(new Locale("en"));
		resolver.setCookieName("lang");
		resolver.setCookieMaxAge(4800);
		return resolver;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
		interceptor.setParamName("lang");
		registry.addInterceptor(interceptor);
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("forward:/home.html");
	}
}
