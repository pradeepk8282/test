package com.neorays.form;

import org.hibernate.validator.NotEmpty;

public class JasperInputForm {
	private String noofYears;
	private String rptFmt = "Html";

	public JasperInputForm() {
		System.out.println(this.getClass().getCanonicalName());
	}

	public String getRptFmt() {
		return rptFmt;
	}

	public void setRptFmt(String rptFmt) {
		this.rptFmt = rptFmt;
	}

	public String getNoofYears() {
		return noofYears;
	}

	public void setNoofYears(String noofYears) {
		this.noofYears = noofYears;
	}
}
