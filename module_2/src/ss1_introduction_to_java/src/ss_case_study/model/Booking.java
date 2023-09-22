package ss_case_study.model;

import java.util.Date;

public class Booking {
    private int bookingCode, customerCode, serviceCode;
    private Date bookingDay, startRent, endRent;

    public Booking() {
    }

    public Booking(int bookingCode, int customerCode, int serviceCode, Date bookingDay, Date startRent, Date endRent) {
        this.bookingCode = bookingCode;
        this.customerCode = customerCode;
        this.serviceCode = serviceCode;
        this.bookingDay = bookingDay;
        this.startRent = startRent;
        this.endRent = endRent;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public int getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(int serviceCode) {
        this.serviceCode = serviceCode;
    }

    public Date getBookingDay() {
        return bookingDay;
    }

    public void setBookingDay(Date bookingDay) {
        this.bookingDay = bookingDay;
    }

    public Date getStarRent() {
        return startRent;
    }

    public void setStarRent(Date starRent) {
        this.startRent = starRent;
    }

    public Date getEndRent() {
        return endRent;
    }

    public void setEndRent(Date endRent) {
        this.endRent = endRent;
    }
}
