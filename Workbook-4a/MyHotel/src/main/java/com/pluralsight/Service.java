package com.pluralsight;

public class Service {
    private int serviceId;
    private int idNumber;
    private String serviceType;
    private String status;

    public Service(int serviceId, int idNumber, String serviceType, String status) {
        this.serviceId = serviceId;
        this.idNumber = idNumber;
        this.serviceType = serviceType;
        this.status = status;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }





    public void markCompleted() {
        this.status = "Completed";
    }

    public void markNotCompleted() {
        this.status = "Not Completed"; // or "Pending" or "In Progress"
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceId=" + serviceId +
                ", guestId=" + idNumber +
                ", serviceType='" + serviceType + '\'' +
                ", status='" + status + '\'' +
                '}';
    }


}
