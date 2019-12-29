package com.ustglobal.librarymanagementsystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "book")
public class BookBean {
	@Id
	@Column
	private int bookId;
	@Column(length = 20)
	private String bookName;
	@Column(length = 20)
	private String author;
	@Column
	private int noOfCopies;

}
