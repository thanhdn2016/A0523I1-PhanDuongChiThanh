package ss_case_study.model;

public class House extends Facility {
    String roomStandard;
    int floor;

    public House(String roomStandard, int floor) {
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public House(int serviceCode, int rentCost, int maxPeople, int useArea, String rentType, String serviceName, String roomStandard, int floor) {
        super(serviceCode, rentCost, maxPeople, useArea, rentType, serviceName);
        this.roomStandard = roomStandard;
        this.floor = floor;
    }
}
