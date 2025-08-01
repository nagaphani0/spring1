package com.example.management.DTO;

public class ProductDTO {

    private String name;
    private String description;
    private Double price;
    private Double quanityInStock;
    private Double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getQuanityInStock() {
        return quanityInStock;
    }

    public void setQuanityInStock(Double quanityInStock) {
        this.quanityInStock = quanityInStock;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
