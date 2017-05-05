package com.hellokoding.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="new")
public class NewTable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String noidung;
	
	public NewTable() {
	}


	public NewTable(String noidung) {
		super();
		this.noidung = noidung;
	}
	
	
	public NewTable(int id, String noidung) {
		super();
		this.id = id;
		this.noidung = noidung;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNoidung() {
		return noidung;
	}
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}


	@Override
	public String toString() {
		return "NewTable [id=" + id + ", noidung=" + noidung + "]";
	}
	
	
}
