package MAPPING.mapping.ENTITY;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String location;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="aadhar_id", referencedColumnName="id")
	AadharDetails aadharDetails;
	
	public Student() {
		
	}

	public Student(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public AadharDetails getAadharDetails() {
		return aadharDetails;
	}

	public void setAadharDetails(AadharDetails aadharDetails) {
		this.aadharDetails = aadharDetails;
	}	
}
