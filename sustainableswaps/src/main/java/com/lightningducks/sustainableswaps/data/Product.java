package com.lightningducks.sustainableswaps.data;

// The basic product object (DAO - data access object)

import javax.persistence.*;

// @Entity tells Hibernate to make a table out of this class

@Entity
@Table(name = "products")
public class Product {

    // unique product ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "product_type")
    private String productType;

    @Column(name = "product_link")
    private String productLink;
    // private String productImage;

    @Column(name = "product_description")
    private String productDescription;

    @Column(name = "keywords")
    private String keywords;

    public Product() {

    }

    public Product(Integer productId, String productName, String companyName, String productType, String productLink, String productDescription, String keywords) {
        super();
        this.productId = productId;
        this.productName = productName;
        this.companyName = companyName;
        this.productType = productType;
        this.productLink = productLink;
        this.productDescription = productDescription;
        this.keywords = keywords;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductLink() {
        return productLink;
    }

    public void setProductLink(String productLink) {
        this.productLink = productLink;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
}
