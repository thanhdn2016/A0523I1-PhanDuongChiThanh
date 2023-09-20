package ss_case_study.model;

abstract class Facility {
    private int serviceCode, rentCost, maxPeople, useArea;
    private String rentType, serviceName;

    public Facility() {
    }

    public int getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(int serviceCode) {
        this.serviceCode = serviceCode;
    }

    public int getRentCost() {
        return rentCost;
    }

    public void setRentCost(int rentCost) {
        this.rentCost = rentCost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public int getUseArea() {
        return useArea;
    }

    public void setUseArea(int useArea) {
        this.useArea = useArea;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Facility(int serviceCode, int rentCost, int maxPeople, int useArea, String rentType, String serviceName) {
        this.serviceCode = serviceCode;
        this.rentCost = rentCost;
        this.maxPeople = maxPeople;
        this.useArea = useArea;
        this.rentType = rentType;
        this.serviceName = serviceName;
    }
}
