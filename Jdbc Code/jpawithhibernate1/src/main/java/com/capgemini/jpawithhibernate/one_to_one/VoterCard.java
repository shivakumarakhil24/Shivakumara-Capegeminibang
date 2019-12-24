package com.capgemini.jpawithhibernate.one_to_one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="voterCard")
public class VoterCard {
	@Id
	@Column
	private int vid;

	@Column
	private String adress;

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
@OneToOne(mappedBy ="voterCard")	
private	Person per;

public Person getPer() {
	return per;
}

public void setPer(Person per) {
	this.per = per;
}

	
	
	

}
