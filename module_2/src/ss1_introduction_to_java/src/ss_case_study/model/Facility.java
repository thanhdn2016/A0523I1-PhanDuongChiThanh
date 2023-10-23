package ss_case_study.model;

abstract class Facility {
    private int rentCost, maxPeople ;
    private float useArea;
    private String rentType, serviceName, serviceCode;

    public Facility() {
    }

    @Override
    public String toString() {
        return "Facility {" +
                "serviceCode = '" + serviceCode + '\''+
                ", rentCost = " + rentCost +
                ", maxPeople = " + maxPeople +
                ", useArea = " + useArea + "m²" +
                ", rentType = '" + rentType + '\'' +
                ", serviceName = '" + serviceName + '\'' +
                '}';
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
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

    public float getUseArea() {
        return useArea;
    }

    public void setUseArea(float useArea) {
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

    public Facility(String serviceCode, int rentCost, int maxPeople, float useArea, String rentType, String serviceName) {
        this.serviceCode = serviceCode;
        this.rentCost = rentCost;
        this.maxPeople = maxPeople;
        this.useArea = useArea;
        this.rentType = rentType;
        this.serviceName = serviceName;
    }
}
