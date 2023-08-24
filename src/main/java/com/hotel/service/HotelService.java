package com.hotel.service;

import java.util.List;

import com.hotel.pojo.Hotels;

public interface HotelService {
	public List<Hotels> findAllHotels();
	public Hotels findByHotelName(String name);
	public List<Hotels> findByLocation(String city);
	public List<Hotels> findByRating(double rating);
	public List<Hotels> findByPrice(double price1, double price2);
	public Hotels findByHotelId(String hotelId);
	public int getAvailability(String hotelId);
	public String deleteCustomer(String hotelId);

}
