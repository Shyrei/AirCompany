package by.shyrei.aircompany.factory;

import by.shyrei.aircompany.service.AircraftName;
import by.shyrei.aircompany.entity.PassengerAircraft;
import by.shyrei.aircompany.service.IdGenerator;

/**
 * Project AirCompany
 * Created on 02.06.2017.
 * author Shyrei Uladzimir
 */
public class PassengerAircraftFactory extends AbstractAircraftFactory<PassengerAircraft> {

    private static PassengerAircraftFactory passengerFactory = new PassengerAircraftFactory();

    private PassengerAircraftFactory(){}


    public static PassengerAircraftFactory getInstance() {
        return passengerFactory;
    }

    @Override
    public PassengerAircraft createAircaft(String line) {
        String[] aircraft = line.split("\\s");
        AircraftName name = AircraftName.stringToName(aircraft[0]);
        String model = aircraft[1];
        int weight = Integer.parseInt(aircraft[2]);
        int fuel = Integer.parseInt(aircraft[3]);
        int speed = Integer.parseInt(aircraft[4]);
        int exitLimit = Integer.parseInt(aircraft[5]);
        return new PassengerAircraft(IdGenerator.generateId(), name, model,weight, fuel,speed,exitLimit);
    }
}
