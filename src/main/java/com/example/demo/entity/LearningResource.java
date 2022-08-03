package com.example.demo.entity;

import java.time.LocalDate;

public class LearningResource {
	private int id;
	private String name;
	private int costPrice;
	private int sellingPrice;
	private LearningResourceStatus productStatus;
	private LocalDate createdDate;
	private LocalDate publishedDate;
	private LocalDate retiredDate;
	
	public LearningResource(int id, String name, int costPrice, int sellingPrice, LearningResourceStatus productStatus,
			LocalDate createdDate, LocalDate publishedDate, LocalDate retiredDate) {
		super();
		this.id = id;
		this.name = name;
		this.costPrice = costPrice;
		this.sellingPrice = sellingPrice;
		this.productStatus = productStatus;
		this.createdDate = createdDate;
		this.publishedDate = publishedDate;
		this.retiredDate = retiredDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(int costPrice) {
		this.costPrice = costPrice;
	}

	public int getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(int sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public LearningResourceStatus getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(LearningResourceStatus productStatus) {
		this.productStatus = productStatus;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}

	public LocalDate getRetiredDate() {
		return retiredDate;
	}

	public void setRetiredDate(LocalDate retiredDate) {
		this.retiredDate = retiredDate;
	}
	
}
