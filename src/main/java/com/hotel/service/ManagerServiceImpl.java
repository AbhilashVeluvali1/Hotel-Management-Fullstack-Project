package com.hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.pojo.Hotels;
import com.hotel.repository.HotelRepo;

@Transactional
@Service
public class ManagerServiceImpl implements ManagerService {
	
	@Autowired
	HotelRepo hotel;

	@Override
	public Hotels getHotel(String mgrId) {
		Hotels hotelName = hotel.findByMgrId(mgrId);
		return hotelName;
	}

	@Override
	public Hotels updateHotelById(Hotels h) {
		return hotel.save(h);	
	}

}
