package com.neorays;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.neorays.business.SpringBusinessConfig;
import com.neorays.web.SpringWebConfig;

public class SpringWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	 public static final String CHARACTER_ENCODING = "UTF-8";


	    public SpringWebApplicationInitializer() {
	    	System.out.println(this.getClass().getSimpleName());
	    }



	    @Override
	    protected Class<?>[] getServletConfigClasses() {
	        return new Class<?>[] { SpringWebConfig.class };
	    }

	    @Override
	    protected Class<?>[] getRootConfigClasses() {
	        return new Class<?>[] { SpringBusinessConfig.class };
	    }

	    @Override
	    protected String[] getServletMappings() {
	        return new String[] { "/" };
	    }

	    @Override
	    protected Filter[] getServletFilters() {
	        final CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
	        encodingFilter.setEncoding(CHARACTER_ENCODING);
	        encodingFilter.setForceEncoding(true);
	        return new Filter[] { encodingFilter };
	    }

}
