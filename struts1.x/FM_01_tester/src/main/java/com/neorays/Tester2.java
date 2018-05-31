package com.neorays;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

public class Tester2 
{
	@Test
	public void main() throws IOException, TemplateException{
		
		Configuration cfg = new Configuration(Configuration.VERSION_2_3_28);
		cfg.setDirectoryForTemplateLoading(new File("/where/you/store/templates"));
		cfg.setDefaultEncoding("UTF-8");
		cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		cfg.setLogTemplateExceptions(false);
		cfg.setWrapUncheckedExceptions(true);
		
		
		Map<String, Object> root = new HashMap<String, Object>();
		root.put("user", "Big Joe");
		//root.put("latestProduct", latest);
		
		Template temp = cfg.getTemplate("test.ftlh");
		Writer out = new OutputStreamWriter(System.out);
		temp.process(root, out);


		
	}

}
