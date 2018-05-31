package com.neorays.business.entities;

public class Comment {
	private Integer id;
	private String text;

	public Comment() {
		// TODO Auto-generated constructor stub
	}

	public Comment(final Integer id, final String text) {
        this.id = id;
        this.text = text;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
