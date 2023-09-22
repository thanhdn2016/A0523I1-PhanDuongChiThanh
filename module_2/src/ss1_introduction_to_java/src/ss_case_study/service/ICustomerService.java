package ss_case_study.service;

import ss_case_study.model.Booking;

import java.util.Date;
import java.util.List;

public interface ICustomerService extends IService{
    boolean isPreferredCustomer();
    void makeBooking(String serviceCode, Date startDate, Date endDate);
    List<Booking> getCustomerBookings();
}
