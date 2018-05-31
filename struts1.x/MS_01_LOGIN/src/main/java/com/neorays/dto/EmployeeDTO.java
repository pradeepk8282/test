package com.neorays.dto;

import java.io.Serializable;
import java.net.URL;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NotFound;

@Entity
@Table(name = "Employee")

public class EmployeeDTO implements Serializable {
	@Id
	@GenericGenerator(name = "emp", strategy = "increment")
	@GeneratedValue(generator = "emp")
	@Column(name = "e_id")
	private int eid;
	@Column(name = "e_name")
	private String eName;
	@Column(name = "e_sal")
	
	private double esal;
	

	/* Default constructors */
	
	public EmployeeDTO() {
		System.out.println(this.getClass().getCanonicalName());
	}

	/* SETTERS AND GETTERS */

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

}
