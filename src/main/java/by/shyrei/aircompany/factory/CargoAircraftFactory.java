package by.shyrei.aircompany.factory;

import by.shyrei.aircompany.entity.CargoAircraft;
import by.shyrei.aircompany.entity.AircraftName;
import by.shyrei.aircompany.service.IdGenerator;

/**
 * Project AirCompany
 * Created on 02.06.2017.
 * author Shyrei Uladzimir
 */
public class CargoAircraftFactory extends AircraftFactory<CargoAircraft> {

    private static CargoAircraftFactory cargoFactory = new CargoAircraftFactory();
    private CargoAircraftFactory(){}

    public static CargoAircraftFactory getInstance() {
        return cargoFactory;
    }

    @Override
    public CargoAircraft createAircaft(String line) {
        String[] aircraft = line.split("\\s");
        AircraftName name = AircraftName.stringToName(aircraft[1]);
        String model = aircraft[2];
        int weight = Integer.parseInt(aircraft[3]);
        int fuel = Integer.parseInt(aircraft[4]);
        int speed = Integer.parseInt(aircraft[5]);
        int exitLimit = Integer.parseInt(aircraft[6]);
        return new CargoAircraft(IdGenerator.generateId(), name, model, weight, fuel, speed, exitLimit);
    }
}
