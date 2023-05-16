package com.infosys.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private Integer price;
	
	@Column(nullable = false)
	private String description;
	
	@Column(nullable = false)
	private String brand;

	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	@JsonManagedReference
	private Category category;

	@ManyToOne
	@JoinColumn(name = "cart_id")
	@JsonManagedReference
	private Cart cart;
}