package by.shyrei.aircompany.factory;

import by.shyrei.aircompany.service.AircraftName;
import by.shyrei.aircompany.entity.CargoAircraft;
import org.junit.Assert;
import org.junit.Test;

/**
 * Project AirCompany
 * Created on 04.06.2017.
 * author Shyrei Uladzimir
 */
public class CargoAircraftFactoryTest {

    private CargoAircraft actual = new CargoAircraft(1000,AircraftName.AirBus, "300", 500, 40, 1000, 200);
    private CargoAircraftFactory cargoFactory = CargoAircraftFactory.getInstance();

    @Test
    public void createAircaft() throws Exception {
        String line = "AirBus 300 500 40 1000 200";
        CargoAircraft expected = cargoFactory.createAircaft(line);
        Assert.assertEquals(expected, actual);
        System.out.println(expected.toString());
        System.out.println(actual.toString());
    }
}