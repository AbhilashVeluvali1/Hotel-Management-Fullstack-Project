package com.hotel.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Hotels")
public class Hotels {
	@Id
	private String id;
	private String mgrId;
	private String hotelId;
	private String hotelName;
	private String state;
	private String city;
	private String zip;
	private String street;
	private int totalRooms;
	private int roomsOccupied;
	private int price;
	private double rating;
	private String review;
	private String status;
	private int isDeleted;
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	public String getMgrId() {
		return mgrId;
	}
	public void setMgrId(String mgrId) {
		this.mgrId = mgrId;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getTotalRooms() {
		return totalRooms;
	}
	public void setTotalRooms(int totalRooms) {
		this.totalRooms = totalRooms;
	}
	public int getRoomsOccupied() {
		return roomsOccupied;
	}
	public void setRoomsOccupied(int roomsOccupied) {
		this.roomsOccupied = roomsOccupied;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Hotels [id=" + id + ", mgrId=" + mgrId + ", hotelId=" + hotelId + ", hotelName=" + hotelName
				+ ", state=" + state + ", city=" + city + ", zip=" + zip + ", street=" + street + ", totalRooms="
				+ totalRooms + ", roomsOccupied=" + roomsOccupied + ", price=" + price + ", rating=" + rating
				+ ", review=" + review + ", status=" + status + ", isDeleted=" + isDeleted + "]";
	}
	
	
	
}
