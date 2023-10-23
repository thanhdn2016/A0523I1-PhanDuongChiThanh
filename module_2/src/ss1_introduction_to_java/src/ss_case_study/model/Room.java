package ss_case_study.model;

public class Room extends Facility {
    private String freeService;

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceCode, int rentCost, int maxPeople, float useArea, String rentType, String serviceName, String freeService) {
        super(serviceCode, rentCost, maxPeople, useArea, rentType, serviceName);
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room { " +
                "serviceCode = '" + getServiceCode() + '\''+
                ", rentCost = " + getRentCost() +
                ", maxPeople = " + getMaxPeople() +
                ", useArea = " + getUseArea() + "m²" +
                ", rentType = '" + getRentType() + '\'' +
                ", serviceName = '" + getServiceName() + '\'' +
                "freeService = '" + freeService + '\'' +
                '}';
    }
}
