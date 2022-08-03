package com.example.demo.entity;

import java.io.Serializable;
import java.time.LocalDate;

public class LearningResource implements Serializable {
	private Integer learningResourceId;
    private String productName;
    private String learningResourceName;
	private Double sellingPrice;
	private LearningResourceStatus learningResourceStatus;
	private LocalDate createdDate;
	private LocalDate publishedDate;
	private LocalDate retiredDate;
	private Double costPrice;
	
	public LearningResource() {
    }
	
	public LearningResource(int id, String name, Double costPrice, Double sellingPrice, LearningResourceStatus productStatus,
			LocalDate createdDate, LocalDate publishedDate, LocalDate retiredDate) {
		super();
		this.learningResourceId = id;
		this.learningResourceName = name;
		this.costPrice = costPrice;
		this.sellingPrice = sellingPrice;
		this.learningResourceStatus = productStatus;
		this.createdDate = createdDate;
		this.publishedDate = publishedDate;
		this.retiredDate = retiredDate;
	}

	public int getLearningResourceId() {
		return learningResourceId;
	}

	public void setLearningResourceId(int id) {
		this.learningResourceId = id;
	}

	public String getLearningResourceName() {
		return learningResourceName;
	}

	public void setLearningResourceName(String name) {
		this.learningResourceName = name;
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
