package com.hotel.service;

import java.util.List;

import com.hotel.pojo.Bookings;
import com.hotel.pojo.Hotels;

public interface ManagerService {
	public Hotels getHotel(String mgrId);
	public Hotels updateHotelById(Hotels h);

}
