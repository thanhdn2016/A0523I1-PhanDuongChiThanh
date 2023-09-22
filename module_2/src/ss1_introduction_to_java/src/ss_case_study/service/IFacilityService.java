package ss_case_study.service;

import java.util.Date;

public interface IFacilityService extends IService{
    boolean isAvailable(Date startDate, Date endDate);
    boolean isSuitableForGuests(int numGuests);
    void updateFacilityInfo(int rentCost, int maxPeople, int useArea, String rentType, String serviceName);
}
