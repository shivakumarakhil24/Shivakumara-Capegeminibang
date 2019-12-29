package com.ustglobal.stockmanagementsystem.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name = "order_info")
public class Order_info {
	@Id
	@Column
	@GeneratedValue
	private int oid;
	@Column
	private double total_price;
	@Column
	private double total_price_with_gst;
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Order_History_info", joinColumns = @JoinColumn(name = "id"), inverseJoinColumns = @JoinColumn(name = "oid"))
	private List<Products_Info> product;
}
