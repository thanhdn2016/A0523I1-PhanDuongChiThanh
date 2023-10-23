package ss_case_study.model;

public class House extends Facility {
    String roomStandard;
    int floor;

    public House(String roomStandard, int floor) {
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House { " +
                "serviceCode = '" + getServiceCode() + '\''+
                ", rentCost = " + getRentCost() +
                ", maxPeople = " + getMaxPeople() +
                ", useArea = " + getUseArea() + "m²" +
                ", rentType = '" + getRentType() + '\'' +
                ", serviceName = '" + getServiceName() + '\'' +
                "roomStandard = '" + roomStandard + '\'' +
                ", floor = " + floor +
                '}';
    }

    public House(String serviceCode, int rentCost, int maxPeople, float useArea, String rentType, String serviceName, String roomStandard, int floor) {
        super(serviceCode, rentCost, maxPeople, useArea, rentType, serviceName);
        this.roomStandard = roomStandard;
        this.floor = floor;
    }
}
