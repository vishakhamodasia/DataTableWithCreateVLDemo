package com.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomBattery {
	
	private String batteryId;
	private String manufacturer;
	
	public String getBatteryId() {
		return batteryId;
	}
	public void setBatteryId(String batteryId) {
		this.batteryId = batteryId;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	@Override
	public String toString() {
		return "BatteryIdList [batteryId=" + batteryId + ", manufacturer=" + manufacturer + "]";
	}
	
	
	
}
