package com.hotel.service;

import java.util.List;

import com.hotel.pojo.Bookings;
import com.hotel.pojo.Invoice;

public interface BookingService {
	public List<Bookings> getBookingHistory(String custId);
	public List<Bookings> getBookingByDate(String date);
	public Bookings updateBookingById(Bookings b);
	public Bookings getBookingByid(String bookingId);
	public String cancelBookingById(String bookingId, int status);
	public List<Bookings>getAllBookingsByHotel(String hotelId);
	public Bookings getAllBookingById(String mgrId);
	public Invoice getInvoiceById(String bookingId);
	
	

}
