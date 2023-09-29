package ss_case_study.service.impl;

import ss_case_study.service.IFacilityService;

import java.util.Date;

public class FacilityService implements IFacilityService {
    @Override
    public boolean isAvailable(Date startDate, Date endDate) {
        return false;
    }

    @Override
    public boolean isSuitableForGuests(int numGuests) {
        return false;
    }

    @Override
    public void updateFacilityInfo(int rentCost, int maxPeople, int useArea, String rentType, String serviceName) {

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
