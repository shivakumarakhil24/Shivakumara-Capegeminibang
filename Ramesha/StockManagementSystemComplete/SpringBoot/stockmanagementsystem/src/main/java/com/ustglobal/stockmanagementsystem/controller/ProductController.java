package com.ustglobal.stockmanagementsystem.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.stockmanagementsystem.dto.Order_info;
import com.ustglobal.stockmanagementsystem.dto.Products_Info;
import com.ustglobal.stockmanagementsystem.dto.UserResponse;
import com.ustglobal.stockmanagementsystem.service.ProductService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
public class ProductController {
	@Autowired
	private ProductService service;

	@PostMapping(path = "/addProduct", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse add_Product(@RequestBody Products_Info product) {
		UserResponse response = new UserResponse();
		if (service.addProduct(product)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product added to the database Successfully");

		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product is not added to the database");
		}
		return response;
	}// End of addProduct

	@PutMapping(path = "/updateProduct", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse update_Product(@RequestBody Products_Info product) {
		UserResponse response = new UserResponse();
		if (service.updateProduct(product)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product data Updated Successfully");

		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product data is not Updated");
		}
		return response;

	}// End of Update Product

	@DeleteMapping(path = "/deleteProduct/{id}")
	public UserResponse delete_Product(@PathVariable("id") int id) {
		UserResponse response = new UserResponse();
		boolean bean = service.deleteProductById(id);
		if (bean != false) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product data deleted Successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product data is not deleted");
		}
		return response;
	}// end of delete Product

	@GetMapping(path = "/getproduct_byname/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse getProduct_ByName(@PathVariable("name") String name) {
		UserResponse response = new UserResponse();
		Products_Info bean = service.getProductByName(name);
		if (bean != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product is Avaliable in Store");
			response.setInfo(bean);

		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product data is not Avalialbe in Store");
		}
		return response;
	}

	@GetMapping(path = "/getproduct_bycategory/{category}", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse getProduct_ByCategory(@PathVariable("category") String category) {
		UserResponse response = new UserResponse();
		List<Products_Info> bean = service.getProductByCategory(category);
		if (!bean.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product of this Category is Avaliable in Store");
			response.setProductInfo(bean);

		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product of this Category is not Avalialbe in Store");
		}
		return response;
	}

	@GetMapping(path = "/getproduct_bycompany/{company}", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse getProduct_ByCompany(@PathVariable("company") String company) {
		UserResponse response = new UserResponse();
		List<Products_Info> bean = service.getProductByCompany(company);
		if (!bean.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product of this Company is Avaliable in Store");
			response.setProductInfo(bean);

		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product of this Company is not Avalialbe in Store");
		}
		return response;
	}

	@GetMapping(path = "/showallproducts", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse showAll_Products() {
		UserResponse response = new UserResponse();
		List<Products_Info> bean = service.showAllProducts();
		if (!bean.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Products Are Found in the Store");
			response.setProductInfo(bean);

		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Products are  Not Found in the DataBase");
		}

		return response;
	}

	@PostMapping(path = "/generate/{total}/{total_gst}", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse generateBill(@RequestBody List<Products_Info> beans, @PathVariable("total") double total,
			@PathVariable("total_gst") double total_gst) {
		UserResponse response = new UserResponse();
		List<Products_Info> list = service.showAllProducts();
		if (service.generateBill(beans, total, total_gst)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product Order Successfully");
			response.setProductInfo(list);
			return response;
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product is not ordered");
			return response;
		}
	}

}
