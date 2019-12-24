package com.capgemini.jpawithhibernatetest.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vegetable")

public class Vegetable {
	
@Id
@Column	
private int vid;
@Column
private String name;
@Column
private int cost;
public int getVid() {
	return vid;
}
public void setVid(int vid) {
	this.vid = vid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}


}
