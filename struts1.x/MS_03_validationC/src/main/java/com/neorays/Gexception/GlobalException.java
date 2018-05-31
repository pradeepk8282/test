package com.neorays.Gexception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


public class GlobalException extends ResponseEntityExceptionHandler
{
	public static final String DEFAULT_ERROR_VIEW = "error";
	@ExceptionHandler(value=Exception.class)
	public ModelAndView defaultErrorhandler(HttpServletRequest request,Exception exception) throws Exception
	{
		ModelAndView andView=new ModelAndView();
		if (AnnotationUtils.findAnnotation(exception.getClass(), ResponseStatus.class) != null)
			throw exception;
		andView.addObject("exception" ,exception);
		andView.addObject("url", request.getRequestURL());
		andView.setViewName(DEFAULT_ERROR_VIEW);
		return andView;
	}

}
