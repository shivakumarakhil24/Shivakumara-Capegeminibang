package com.ustglobal.librarymanagementsystem.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "bookregistration")
public class BooksRegistration {

	@Id
	@Column
	@GeneratedValue
	private int registrationId;

	@Column
	private int bookId;

	@Column
	private int studentId;

	@Column
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date registrationDate;

}
