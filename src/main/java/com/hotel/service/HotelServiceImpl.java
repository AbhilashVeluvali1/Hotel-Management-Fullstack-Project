package com.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.pojo.Hotels;
import com.hotel.pojo.Users;
import com.hotel.repository.HotelRepo;

@Service
@Transactional
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	private HotelRepo hotelRepo;
	
	@Override
	public List<Hotels> findAllHotels() {
		// TODO Auto-generated method stub
		return hotelRepo.findAll();
	}

	@Override
	public Hotels findByHotelName(String name) {
		// TODO Auto-generated method stub
		return hotelRepo.findByHotelName(name);
	}

	@Override
	public List<Hotels> findByLocation(String city) {
		// TODO Auto-generated method stub
		return hotelRepo.findByCity(city);
	}

	@Override
	public List<Hotels> findByRating(double rating) {
		// TODO Auto-generated method stub
		return hotelRepo.findByRatingGreaterThan(rating);
	}

	@Override
	public List<Hotels> findByPrice(double price1, double price2) {
		// TODO Auto-generated method stub
		return hotelRepo.findByPriceBetween(price1,price2);
	}

	@Override
	public Hotels findByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		return hotelRepo.findByHotelId(hotelId);
	}

	@Override
	public int getAvailability(String hotelId) {
		// TODO Auto-generated method stub
		Hotels h = hotelRepo.findByHotelId(hotelId);
		int availablity = h.getTotalRooms()- h.getRoomsOccupied();
		return availablity;
	}

	@Override
	public String deleteCustomer(String hotelId) {
		Hotels h = new Hotels();
		h = hotelRepo.findByHotelId(hotelId);
		if(h.getIsDeleted()==0)
		{
			h.setIsDeleted(1);
			Hotels h1 = hotelRepo.save(h);
			if(h1!=null) {
				return "Deleted sucessfully";
		}	
		}
		return "Please try again!";
	}
	
	


}
