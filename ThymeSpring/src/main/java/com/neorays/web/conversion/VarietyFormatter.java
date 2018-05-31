package com.neorays.web.conversion;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import com.neorays.business.entities.Variety;
import com.neorays.business.services.VarietyService;

public class VarietyFormatter implements Formatter<Variety> {
	
	 @Autowired
	    private VarietyService varietyService;


	    public VarietyFormatter() {
	    	System.out.println(this.getClass().getSimpleName());
	    }

	    public Variety parse(final String text, final Locale locale) throws ParseException {
	        final Integer varietyId = Integer.valueOf(text);
	        return this.varietyService.findById(varietyId);
	    }


	    public String print(final Variety object, final Locale locale) {
	        return (object != null ? object.getId().toString() : "");
	    }

}
