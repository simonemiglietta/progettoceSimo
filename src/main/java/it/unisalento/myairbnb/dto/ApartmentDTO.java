package it.unisalento.myairbnb.dto;

import java.util.Date;

public class ApartmentDTO {




int idapartment;
String name;
String description;
double price;
float lat;
float lon;
int state; 
int idseller;
int idadmin;



public int getIdapartment() {
	return idapartment;
}
public void setIdapartment(int idapartment) {
	this.idapartment = idapartment;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public float getLat() {
	return lat;
}
public void setLat(float lat) {
	this.lat = lat;
}
public float getLon() {
	return lon;
}
public void setLon(float lon) {
	this.lon = lon;
}
public int getState() {
	return state;
}
public void setState(int state) {
	this.state = state;
}
public int getIdseller() {
	return idseller;
}
public void setIdseller(int idseller) {
	this.idseller = idseller;
}
public int getIdadmin() {
	return idadmin;
}
public void setIdadmin(int idadmin) {
	this.idadmin = idadmin;
}





















}