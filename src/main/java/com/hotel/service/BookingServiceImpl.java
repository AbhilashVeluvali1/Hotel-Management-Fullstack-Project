package com.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.pojo.Bookings;
import com.hotel.pojo.Hotels;
import com.hotel.pojo.Invoice;
import com.hotel.repository.BookingRepo;
import com.hotel.repository.HotelRepo;
import com.hotel.repository.InvoiceRepo;

@Service
@Transactional
public class BookingServiceImpl implements BookingService {
	
	@Autowired
	private BookingRepo bookings;
	@Autowired
	private HotelRepo hotels;
	@Autowired
	private InvoiceRepo invoice;

	@Override
	public List<Bookings> getBookingHistory(String custId) {
		return bookings.findByCustId(custId);
	}

	@Override
	public List<Bookings> getBookingByDate(String date) {
		return bookings.findByBookingDate(date);
	}

	@Override
	public Bookings updateBookingById(Bookings b) {
		return bookings.save(b);
	}

	@Override
	public Bookings getBookingByid(String bookingId) {
		return bookings.getBookingById(bookingId);
	}

	@Override
	public String cancelBookingById(String bookingId, int status) {
		Bookings b = new Bookings();
		 b = bookings.getBookingById(bookingId);
		if(status==1) {
			b.setCanclled(status);
			b= updateBookingById(b);
			return "Booking Cancelled";
		}
		else if(b==null) {
			return "Booking not Cancelled";
		}
		else {
			return "Booking not Cancelled";
		}
	}

	@Override
	public List<Bookings> getAllBookingsByHotel(String hotelId) {
		
		return bookings.findByHotelId(hotelId);
	}

	@Override
	public Bookings getAllBookingById(String mgrId) {
		Hotels h = hotels.findByMgrId(mgrId);
		String hotelId = h.getHotelId();
		return bookings.findAllByHotelId(hotelId);
	}

	@Override
	public Invoice getInvoiceById(String bookingId) {
		// TODO Auto-generated method stub
		return invoice.findByBookingId(bookingId);
		
	}

	
}
