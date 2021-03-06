package com.example.springjpamysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")

public class Person {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column
    private Integer id;
	
	@Column
	private String first;
	
	@Column
	private String last;
	
	

	public Person() {
		
	}
	
	

	public Integer getId() {
		return id;
	}

	


	public String getFirst() {
		return first;
	}



	public String getLast() {
		return last;
	}



	public void setFirst(String first) {
		this.first = first;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
}
