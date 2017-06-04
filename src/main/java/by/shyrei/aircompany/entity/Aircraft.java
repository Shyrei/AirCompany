package by.shyrei.aircompany.entity;

import by.shyrei.aircompany.aircraftenum.AircraftName;

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
    public String toString() {
        return "Aircraft{" +
                "aircraftId=" + aircraftId +
                ", aircraftName='" + aircraftName + '\'' +
                ", aircraftModel='" + aircraftModel + '\'' +
                ", aircraftWeight=" + aircraftWeight +
                ", fuelPerHour=" + fuelPerHour +
                ", speed=" + speed +
                '}';
    }
}
