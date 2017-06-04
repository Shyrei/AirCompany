package by.shyrei.aircompany.factory;

import by.shyrei.aircompany.service.AircraftName;
import by.shyrei.aircompany.entity.CargoAircraft;
import by.shyrei.aircompany.service.IdGenerator;

/**
 * Project AirCompany
 * Created on 02.06.2017.
 * author Shyrei Uladzimir
 */
public class CargoAircraftFactory extends AbstractAircraftFactory<CargoAircraft> {

    private static CargoAircraftFactory cargoFactory = new CargoAircraftFactory();

    private CargoAircraftFactory(){}

    public static CargoAircraftFactory getInstance() {
        return cargoFactory;
    }

    @Override
    public CargoAircraft createAircaft(String line) {
        String[] aircraft = line.split("\\s");
        AircraftName name = AircraftName.stringToName(aircraft[0]);
        String model = aircraft[1];
        int weight = Integer.parseInt(aircraft[2]);
        int fuel = Integer.parseInt(aircraft[3]);
        int speed = Integer.parseInt(aircraft[4]);
        int exitLimit = Integer.parseInt(aircraft[5]);
        return new CargoAircraft(IdGenerator.generateId(), name, model,weight, fuel,speed,exitLimit);
    }
}
