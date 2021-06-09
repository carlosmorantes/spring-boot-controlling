package com.cc.controlling.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.cc.controlling.validator.Currency;

/**
 * @TODO: add base class with attributes to be inheritated
 * @author MyName
 *
 */
@Entity
@Table(name = "EXPENSE")
public class ExpenseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Name must must not be null.")
    @Size(min = 2, max = 50, message = "Name must have at least 2 characters and maximum 50.")
    private String name;

    private String description;

    @DateTimeFormat(iso = ISO.DATE)
    private Date buyDate;

    @Currency
    private BigDecimal buyPrice;

    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }

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

    public Date getBuyDate() {
	return buyDate;
    }

    public void setBuyDate(Date buyDate) {
	this.buyDate = buyDate;
    }

    public BigDecimal getBuyPrice() {
	return buyPrice;
    }

    public void setBuyPrice(BigDecimal buyPrice) {
	this.buyPrice = buyPrice;
    }

}
