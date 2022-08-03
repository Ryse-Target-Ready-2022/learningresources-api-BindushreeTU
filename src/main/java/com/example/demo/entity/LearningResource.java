package com.example.demo.entity;

import java.time.LocalDate;

public class LearningResource {
	private int id;
	private String name;
	private Double costPrice;
	private Double sellingPrice;
	private LearningResourceStatus learningResourceStatus;
	private LocalDate createdDate;
	private LocalDate publishedDate;
	private LocalDate retiredDate;
	
	public LearningResource() {
    }
	
	public LearningResource(int id, String name, Double costPrice, Double sellingPrice, LearningResourceStatus productStatus,
			LocalDate createdDate, LocalDate publishedDate, LocalDate retiredDate) {
		super();
		this.id = id;
		this.name = name;
		this.costPrice = costPrice;
		this.sellingPrice = sellingPrice;
		this.learningResourceStatus = productStatus;
		this.createdDate = createdDate;
		this.publishedDate = publishedDate;
		this.retiredDate = retiredDate;
	}

	public int getLearningResourceId() {
		return id;
	}

	public void setLearningResourceId(int id) {
		this.id = id;
	}

	public String getLearningResourceName() {
		return name;
	}

	public void setLearningResourceName(String name) {
		this.name = name;
	}

	public Double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(Double costPrice2) {
		this.costPrice = costPrice2;
	}

	public Double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(Double sellingPrice2) {
		this.sellingPrice = sellingPrice2;
	}

	public LearningResourceStatus getLearningResourceStatus() {
		return learningResourceStatus;
	}

	public void setLearningResourceStatus(LearningResourceStatus productStatus) {
		this.learningResourceStatus = productStatus;
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
