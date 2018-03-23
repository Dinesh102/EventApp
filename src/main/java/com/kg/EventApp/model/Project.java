
package com.kg.EventApp.model;

import javax.persistence.*;

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;

	@Column
	private String Sensor1;

	@Column
	private String Sensor2;

	@Column
	private String Sensor3;	

	public Long getId() {
		return ID;
	}

	public void setId(Long ID) {
		this.ID = ID;
	}

	public String getSensor1() {
		return Sensor1;
	}

	public void setSensor1(String Sensor1) {
		this.Sensor1 = Sensor1;
	}

	public String getSensor2() {
		return Sensor2;
	}

		public void setSensor2(String Sensor2) {
		this.Sensor2 = Sensor2;
	}

		public String getSensor3() {
		return Sensor3;
	}
	public void setSensor3(String Sensor3) {
		this.Sensor3 = Sensor3;
	}


	}
