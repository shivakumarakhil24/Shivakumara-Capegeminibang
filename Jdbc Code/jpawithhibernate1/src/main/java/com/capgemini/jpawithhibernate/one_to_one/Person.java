package com.capgemini.jpawithhibernate.one_to_one;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {
	@Id
	@Column
	private int pid;
	@Column
	private String name;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="vid")//to perform foreign key operation
	private VoterCard voterCard;
	public VoterCard getVoterCard() {
		return voterCard;
	}
	public void setVoterCard(VoterCard voterCard) {
		this.voterCard = voterCard;
	}




}
