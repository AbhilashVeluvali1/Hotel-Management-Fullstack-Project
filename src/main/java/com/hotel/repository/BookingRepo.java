package com.hotel.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.hotel.pojo.Bookings;

@Repository
public interface BookingRepo extends MongoRepository<Bookings, String> {
	List<Bookings> findByCustId(String custId);
	List<Bookings> findByBookingDate(String date);
	List<Bookings> findByBookingId(String bookingId);
	@Query("{'cancelled' : 0 , 'bookingId' : ?0 }")
	Bookings getBookingById(String bookingId);
	@Query("{'cancelled' : 0 , 'hotelId' : ?0 }")
	List<Bookings> findByHotelId(String hotelId);
	@Query("{'hotelId': ?0}")
	Bookings findAllByHotelId(String hotelId);
}
