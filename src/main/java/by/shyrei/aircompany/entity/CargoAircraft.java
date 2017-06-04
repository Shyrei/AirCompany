package by.shyrei.aircompany.entity;

import by.shyrei.aircompany.service.AircraftName;

/**
 * Project AirCompany
 * Created on 02.06.2017.
 * author Shyrei Uladzimir
 */
public class CargoAircraft extends Aircraft {

    private int payload;

    public CargoAircraft() {
    }

    public CargoAircraft(int aircraftId, AircraftName aircraftName, String aircraftModel, int aircraftWeight, int fuelPerHour, int speed, int payload) {
        super(aircraftId, aircraftName, aircraftModel, aircraftWeight, fuelPerHour, speed);
        this.payload = payload;
    }

    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CargoAircraft)) return false;
        if (!super.equals(o)) return false;

        CargoAircraft that = (CargoAircraft) o;

        return getPayload() == that.getPayload();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getPayload();
        return result;
    }

    @Override
    public String toString() {
        return "CargoAircraft{" +
                "payload=" + payload +
                "} " + super.toString();
    }
}
