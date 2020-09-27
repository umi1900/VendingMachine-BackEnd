package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "soda")

public class Soda {

	private Long id;

     private String name ;//nmae of soda
     private int qty;//Quantity
	public Soda() {
		
	}
	public Soda(String name, int qty) {
		
		this.name = name;
		this.qty = qty;
	}
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	 @Column(name = "name", nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 @Column(name = "qty", nullable = false)
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Soda [id=" + id + ", name=" + name + ", qty=" + qty + "]";
	}
	
          
}
