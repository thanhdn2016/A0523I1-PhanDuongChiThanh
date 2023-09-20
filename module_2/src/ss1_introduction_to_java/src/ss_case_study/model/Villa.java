package ss_case_study.model;

public class Villa extends Facility{
    String roomStandard,poolArea;
    int floor;
    public Villa() {
    }

    public Villa(int serviceCode, int rentCost, int maxPeople, int useArea, String rentType, String serviceName, String roomStandard, String poolArea, int floor) {
        super(serviceCode, rentCost, maxPeople, useArea, rentType, serviceName);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floor = floor;
    }
}
