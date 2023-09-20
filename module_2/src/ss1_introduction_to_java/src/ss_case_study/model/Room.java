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

    public Room(int serviceCode, int rentCost, int maxPeople, int useArea, String rentType, String serviceName, String freeService) {
        super(serviceCode, rentCost, maxPeople, useArea, rentType, serviceName);
        this.freeService = freeService;
    }
}
