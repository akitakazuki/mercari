package com.example.mercari.domain;

public class Items {
    private Integer id;
    private String name;
    private Integer conditionId;
    private String category; 
    private String brand;
    private Integer price;
    private Integer shipping;
    private String description;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getConditionId() {
		return conditionId;
	}
	public void setConditionId(Integer conditionId) {
		this.conditionId = conditionId;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getShipping() {
		return shipping;
	}
	public void setShipping(Integer shipping) {
		this.shipping = shipping;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Original [id=" + id + ", name=" + name + ", conditionId=" + conditionId + ", categoryName="
				+ category + ", brand=" + brand + ", price=" + price + ", shipping=" + shipping + ", description="
				+ description + "]";
	}
	public Items(Integer id, String name, Integer conditionId, String category, String brand, Integer price,
			Integer shipping, String description) {
		super();
		this.id = id;
		this.name = name;
		this.conditionId = conditionId;
		this.category = category;
		this.brand = brand;
		this.price = price;
		this.shipping = shipping;
		this.description = description;
	}
	public Items() {
		super();
	}
    
	
    
}

