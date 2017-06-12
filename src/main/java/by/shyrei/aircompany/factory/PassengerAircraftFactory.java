package by.shyrei.aircompany.factory;

import by.shyrei.aircompany.entity.PassengerAircraft;
import by.shyrei.aircompany.entity.AircraftName;
import by.shyrei.aircompany.service.IdGenerator;

/**
 * Project AirCompany
 * Created on 02.06.2017.
 * author Shyrei Uladzimir
 */
public class PassengerAircraftFactory extends AircraftFactory<PassengerAircraft> {

    private static PassengerAircraftFactory passengerFactory = new PassengerAircraftFactory();

    private PassengerAircraftFactory() {
    }

    public static PassengerAircraftFactory getInstance() {
        return passengerFactory;
    }

    @Override
    public PassengerAircraft createAircaft(String line) {
        String[] aircraft = line.split("\\s");
        AircraftName name = AircraftName.stringToName(aircraft[1]);
        String model = aircraft[2];
        int weight = Integer.parseInt(aircraft[3]);
        int fuel = Integer.parseInt(aircraft[4]);
        int speed = Integer.parseInt(aircraft[5]);
        int exitLimit = Integer.parseInt(aircraft[6]);
        return new PassengerAircraft(IdGenerator.generateId(), name, model, weight, fuel, speed, exitLimit);
    }
}
