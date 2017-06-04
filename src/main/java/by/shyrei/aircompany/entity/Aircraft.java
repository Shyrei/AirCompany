package by.shyrei.aircompany.entity;

import by.shyrei.aircompany.service.AircraftName;

/**
 * Project AirCompany
 * Created on 02.06.2017.
 * author Shyrei Uladzimir
 */
public abstract class Aircraft {

    private int aircraftId;
    private AircraftName aircraftName;
    private String aircraftModel;
    private int aircraftWeight;
    private int fuelPerHour;
    private int speed;

    public Aircraft() {
    }

    public Aircraft(int aircraftId, AircraftName aircraftName, String aircraftModel, int aircraftWeight, int fuelPerHour, int speed) {
        this.aircraftId = aircraftId;
        this.aircraftName = aircraftName;
        this.aircraftModel = aircraftModel;
        this.aircraftWeight = aircraftWeight;
        this.fuelPerHour = fuelPerHour;
        this.speed = speed;
    }

    public int getAircraftId() {
        return aircraftId;
    }

    public void setAircraftId(int aircraftId) {
        this.aircraftId = aircraftId;
    }

    public AircraftName getAircraftName() {
        return aircraftName;
    }

    public void setAircraftName(AircraftName aircraftName) {
        this.aircraftName = aircraftName;
    }

    public String getAircraftModel() {
        return aircraftModel;
    }

    public void setAircraftModel(String aircraftModel) {
        this.aircraftModel = aircraftModel;
    }

    public int getAircraftWeight() {
        return aircraftWeight;
    }

    public void setAircraftWeight(int aircraftWeight) {
        this.aircraftWeight = aircraftWeight;
    }

    public int getFuelPerHour() {
        return fuelPerHour;
    }

    public void setFuelPerHour(int fuelPerHour) {
        this.fuelPerHour = fuelPerHour;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aircraft)) return false;

        Aircraft aircraft = (Aircraft) o;

        if (getAircraftId() != aircraft.getAircraftId()) return false;
        if (getAircraftWeight() != aircraft.getAircraftWeight()) return false;
        if (getFuelPerHour() != aircraft.getFuelPerHour()) return false;
        if (getSpeed() != aircraft.getSpeed()) return false;
        if (getAircraftName() != aircraft.getAircraftName()) return false;
        return getAircraftModel() != null ? getAircraftModel().equals(aircraft.getAircraftModel()) : aircraft.getAircraftModel() == null;
    }

    @Override
    public int hashCode() {
        int result = getAircraftId();
        result = 31 * result + (getAircraftName() != null ? getAircraftName().hashCode() : 0);
        result = 31 * result + (getAircraftModel() != null ? getAircraftModel().hashCode() : 0);
        result = 31 * result + getAircraftWeight();
        result = 31 * result + getFuelPerHour();
        result = 31 * result + getSpeed();
        return result;
    }

    @Override
    public String toString() {
        return  "aircraftId=" + aircraftId +
                ", aircraftName='" + aircraftName + '\'' +
                ", aircraftModel='" + aircraftModel + '\'' +
                ", aircraftWeight=" + aircraftWeight +
                ", fuelPerHour=" + fuelPerHour +
                ", speed=" + speed;
    }
}
