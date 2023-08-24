package com.hotel.pojo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Invoice")
public class Invoice {
	@Id
	private String id;
	private String invoiceId;
	private String bookingId;
	private String date;
	private int price;
	private String paymentId;
	public String getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", bookingId=" + bookingId + ", date=" + date + ", price=" + price
				+ ", paymentId=" + paymentId + "]";
	}
}
