package com.capgemini.one_to_many;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pencil")

public class PencilBox {
	@Id
	@Column
	private int box_id;

	
	@Column
	private String name;
	
	//@OneToMany(mappedBy="pencilBox")
	//private List<Pencil> pencil;
	
	public int getBox_id() {
		return box_id;
	}
	public void setBox_id(int box_id) {
		this.box_id = box_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * public List<Pencil> getPencil() { return pencil; } public void
	 * setPencil(List<Pencil> pencil) { this.pencil = pencil; }
	 */
	
	
}
