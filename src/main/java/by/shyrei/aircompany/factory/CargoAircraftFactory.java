package by.shyrei.aircompany.factory;

import by.shyrei.aircompany.entity.CargoAircraft;

/**
 * Project AirCompany
 * Created on 02.06.2017.
 * author Shyrei Uladzimir
 */
public class CargoAircraftFactory extends AbstractAircraftFactory<CargoAircraft> {

    public CargoAircraft getInstance() {
        return new CargoAircraft();
    }

    @Override
    public CargoAircraft createAircaft(String line) {
        return null;
    }
}
