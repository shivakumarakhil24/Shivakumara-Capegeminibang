package com.ustglobal.librarymanagementsystem.dto;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "issuedbookdetails")
public class IssuedBookDetails {
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate issuedDate;
	@Column
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate returnDate;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId", nullable = false)
	private UserBean user;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bookId", nullable = false)
	private BookBean book;

}
