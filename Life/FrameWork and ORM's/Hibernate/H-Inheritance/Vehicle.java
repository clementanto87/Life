package com.hibernate.sivareddy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE) // Table per herichey
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS) // table per concreate
@Inheritance(strategy=InheritanceType.JOINED) // table per sub - class 
/*@DiscriminatorColumn(
		name="VehicleType",
		discriminatorType=DiscriminatorType.STRING
		)*/
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String name;
	private String licenseNumber;
	
	Vehicle(){
		
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	

}
