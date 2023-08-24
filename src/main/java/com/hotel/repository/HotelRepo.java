package com.hotel.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hotel.pojo.Hotels;


@Repository
public interface HotelRepo extends MongoRepository<Hotels, String> {
	List<Hotels> findAll();
	Hotels findByHotelName(String hotelName);
	List<Hotels> findByCity(String city);
	List<Hotels> findByRatingGreaterThan(double rating);
	List<Hotels> findByPriceBetween(double p1 , double p2);
	Hotels findByMgrId(String mgrId);
	Hotels findByHotelId(String id);
}
