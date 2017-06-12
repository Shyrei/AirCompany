package by.shyrei.aircompany.manager;

import by.shyrei.aircompany.entity.*;
import by.shyrei.aircompany.entity.AbstractAircraft;
import by.shyrei.aircompany.entity.CargoAircraft;
import by.shyrei.aircompany.entity.AircraftName;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;


/**
 * Project AirCompany
 * Created on 05.06.2017.
 * author Shyrei Uladzimir
 */
public class AirLineFinderTest {

    private AirLine airLine = new AirLine();
    private AirLineFinder finder = new AirLineFinder();

    @Before
    public void init() {
        AbstractAircraft cargo1 = new CargoAircraft(1, AircraftName.BOING, "747", 1, 3, 4, 5);
        AbstractAircraft passenger1 = new PassengerAircraft(2, AircraftName.TY, "154", 2, 7, 88, 9);
        AbstractAircraft cargo2 = new CargoAircraft(3, AircraftName.BOING, "747", 3, 10, 4, 5);
        AbstractAircraft passenger2 = new PassengerAircraft(4, AircraftName.TY, "154", 4, 15, 88, 9);
        airLine.addAircraft(cargo1);
        airLine.addAircraft(passenger1);
        airLine.addAircraft(passenger2);
        airLine.addAircraft(cargo2);
    }

    @Test
    public void findByWieght() throws Exception {
        Optional<AbstractAircraft> actual = finder.findByWieght(1, airLine);
        Assert.assertTrue(actual.isPresent());
    }

    @Test
    public void findByWieghtEmpty() throws Exception {
        Optional<AbstractAircraft> actual = finder.findByWieght(5, airLine);
        Assert.assertEquals(Optional.empty(), actual);
    }

    @Test
    public void findByFuel() throws Exception {
        int minFuel = 7;
        int maxFuel = 10;
        Assert.assertFalse(finder.findByFuel(minFuel, maxFuel, airLine).isEmpty());
    }
}