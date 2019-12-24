package com.capgemini.one_to_many;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pencilBox")

public class Pencil {
	@Id
	@Column
	private int p_id;
	
	@Column
	private String color;
	
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="box_id",nullable=false)
	
	private PencilBox penBox;
	
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public PencilBox getPenBox() {
		return penBox;
	}
	public void setPenBox(PencilBox penBox) {
		this.penBox = penBox;
	}
	
	
	

}
