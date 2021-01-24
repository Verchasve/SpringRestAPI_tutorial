package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
public class Book_Table implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1985816713161166460L;
	
	
	@Column(name = "book_id")
	private int book_id;
	
	@Column(name = "book_name")
	private String book_name;

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

}
