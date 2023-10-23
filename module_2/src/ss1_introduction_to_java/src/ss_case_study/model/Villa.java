package ss_case_study.model;

public class Villa extends Facility{
    String roomStandard;
    float poolArea;
    int floor;
    public Villa() {
    }

    public Villa(String serviceCode, int rentCost, int maxPeople, float useArea, String rentType, String serviceName,
                 String roomStandard, float poolArea, int floor) {
        super(serviceCode, rentCost, maxPeople, useArea, rentType, serviceName);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa {" +
                "serviceCode = '" + getServiceCode() + '\''+
                ", rentCost = " + getRentCost() +
                ", maxPeople = " + getMaxPeople() +
                ", useArea = " + getUseArea() + "m²" +
                ", rentType = '" + getRentType() + '\'' +
                ", serviceName = '" + getServiceName() + '\'' +
                "roomStandard = '" + roomStandard + '\'' +
                ", poolArea = " + poolArea +
                ", floor = " + floor +
                '}';
    }
}
