package com.neorays.business.entities;

public class User
{
	 private String firstName ;
	    private String lastName ;
	    private String nationality ;
	    private Integer age;
	    
	    public User() {
			// TODO Auto-generated constructor stub
		}
	    public User(final String firstName, final String lastName, 
	            final String nationality, final Integer age) {
	        super();
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.nationality = nationality;
	        this.age = age;
	    }

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getNationality() {
			return nationality;
		}

		public void setNationality(String nationality) {
			this.nationality = nationality;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}
	    
	    

}
