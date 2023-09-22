package ss_case_study.service;

import java.util.Date;

public interface IBookingService extends IService{
        String getBookingCode();
        Date getBookingDate();
        Date getStartDate();
        Date getEndDate();
        String getCustomerCode();
        String getServiceCode();
        double getTotalCost();
        void cancelBooking();
}
