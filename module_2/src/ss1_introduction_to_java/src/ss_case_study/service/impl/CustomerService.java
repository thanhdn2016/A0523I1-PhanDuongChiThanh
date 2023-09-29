package ss_case_study.service.impl;

import ss_case_study.model.Booking;
import ss_case_study.service.ICustomerService;

import java.util.Date;
import java.util.List;

public class CustomerService implements ICustomerService {
    @Override
    public boolean isPreferredCustomer() {
        return false;
    }

    @Override
    public void makeBooking(String serviceCode, Date startDate, Date endDate) {

    }

    @Override
    public List<Booking> getCustomerBookings() {
        return null;
    }

    @Override
    public double calculateTotalCost() {
        return 0;
    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public boolean isSuitableForGuests() {
        return false;
    }

    @Override
    public void updateServiceInfo() {

    }
}
