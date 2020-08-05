package com.boom.kaka.model;

import java.util.Date;

/*

 * */
public class Patient_msg {
	private Patient patient;
	private String blood_pressure;
	private Integer heart_rate;
	private Double weight;
	private Double temperature;
	private Double room_temperature;
	private String humidity;
	private Integer SaO2;
	private String date;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public String getBlood_pressure() {
		return blood_pressure;
	}
	public void setBlood_pressure(String blood_pressure) {
		this.blood_pressure = blood_pressure;
	}
	public Integer getHeart_rate() {
		return heart_rate;
	}
	public void setHeart_rate(Integer heart_rate) {
		this.heart_rate = heart_rate;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Double getTemperature() {
		return temperature;
	}
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}
	public Double getRoom_temperature() {
		return room_temperature;
	}
	public void setRoom_temperature(Double room_temperature) {
		this.room_temperature = room_temperature;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	public Integer getSaO2() {
		return SaO2;
	}

	public void setSaO2(Integer saO2) {
		SaO2 = saO2;
	}

	@Override
	public String toString() {
		return "Patient_msg{" +
				"patient=" + patient +
				", blood_pressure='" + blood_pressure + '\'' +
				", heart_rate=" + heart_rate +
				", weight=" + weight +
				", temperature=" + temperature +
				", room_temperature=" + room_temperature +
				", humidity='" + humidity + '\'' +
				", SaO2=" + SaO2 +
				", date='" + date + '\'' +
				'}';
	}
}
