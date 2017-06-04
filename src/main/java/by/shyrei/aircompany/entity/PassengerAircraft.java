package by.shyrei.aircompany.entity;

import by.shyrei.aircompany.service.AircraftName;

/**
 * Project AirCompany
 * Created on 02.06.2017.
 * author Shyrei Uladzimir
 */
public class PassengerAircraft extends Aircraft {

    private int exitLimit;

    public PassengerAircraft() {
    }

    public PassengerAircraft(int aircraftId, AircraftName aircraftName, String aircraftModel, int aircraftWeight, int fuelPerHour, int speed, int exitLimit) {
        super(aircraftId, aircraftName, aircraftModel, aircraftWeight, fuelPerHour, speed);
        this.exitLimit = exitLimit;
    }

    public int getExitLimit() {
        return exitLimit;
    }

    public void setExitLimit(int exitLimit) {
        this.exitLimit = exitLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassengerAircraft)) return false;
        if (!super.equals(o)) return false;

        PassengerAircraft that = (PassengerAircraft) o;

        return getExitLimit() == that.getExitLimit();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getExitLimit();
        return result;
    }

    @Override
    public String toString() {
        return "PassengerAircraft{" +
                "exitLimit=" + exitLimit +
                '}'+ super.toString();
    }
}
