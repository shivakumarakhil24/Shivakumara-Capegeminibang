package com.ustglobal.stockmanagementsystem.dto;

import java.util.List;

import lombok.Data;

@Data
public class UserResponse {
	private int statusCode;
	private String message;
	private String description;
	private Products_Info info;
	private List<Products_Info> productInfo;
	private List<Order_info> order_info;
}
