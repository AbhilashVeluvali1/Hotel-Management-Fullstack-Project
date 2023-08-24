package com.hotel.pojo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Bookings")
public class Bookings {
	@Id
	private String id;
	private String custId;
	private String bookingId;
	private String hotelId;
	private String invoiceId;
	private String bookingDate;
	private String checkinDate;
	private String checkoutDate;
	private int cancelled;
	public int getCanclled() {
		return cancelled;
	}
	public void setCanclled(int canclled) {
		this.cancelled = canclled;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getCheckinDate() {
		return checkinDate;
	}
	public void setCheckinDate(String checkinDate) {
		this.checkinDate = checkinDate;
	}
	public String getCheckoutDate() {
		return checkoutDate;
	}
	public void setCheckoutDate(String checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
	@Override
	public String toString() {
		return "Bookings [custId=" + custId + ", bookingId=" + bookingId + ", hotelId=" + hotelId + ", invoiceId="
				+ invoiceId + ", bookingDate=" + bookingDate + ", checkinDate=" + checkinDate + ", checkoutDate="
				+ checkoutDate + ", canclled=" + cancelled + "]";
	}
	
	
	
	
	
}
