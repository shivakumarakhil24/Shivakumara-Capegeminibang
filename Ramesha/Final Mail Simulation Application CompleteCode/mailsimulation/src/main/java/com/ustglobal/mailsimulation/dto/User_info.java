package com.ustglobal.mailsimulation.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name = "user_info")
public class User_info {
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private String user_name;
	@Column(unique = true)
	private String email;
	@Column
	private String password;
	@JsonIgnore
	@Exclude
	@OneToMany(mappedBy = "user")
	private List<Mail_info> mail;

	@JsonIgnore
	@Exclude
	@OneToMany(mappedBy = "user_info")
	private List<Mail_info> mail_info;

}
