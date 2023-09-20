package ss_case_study.model;

public class Booking {
    private int bookingCode, customerCode, serviceCode;
    private String bookingDay, starRent, endRent;

    public Booking() {
    }

    public Booking(int bookingCode, int customerCode, int serviceCode, String bookingDay, String starRent, String endRent) {
        this.bookingCode = bookingCode;
        this.customerCode = customerCode;
        this.serviceCode = serviceCode;
        this.bookingDay = bookingDay;
        this.starRent = starRent;
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

    public String getBookingDay() {
        return bookingDay;
    }

    public void setBookingDay(String bookingDay) {
        this.bookingDay = bookingDay;
    }

    public String getStarRent() {
        return starRent;
    }

    public void setStarRent(String starRent) {
        this.starRent = starRent;
    }

    public String getEndRent() {
        return endRent;
    }

    public void setEndRent(String endRent) {
        this.endRent = endRent;
    }
}
