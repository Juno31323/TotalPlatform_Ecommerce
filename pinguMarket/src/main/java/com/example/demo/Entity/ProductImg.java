package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "product_img")
public class ProductImg {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productImgId;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	
	private String originalFilename;
	
	private String renamedFilename;
	
	private String imgType;

}