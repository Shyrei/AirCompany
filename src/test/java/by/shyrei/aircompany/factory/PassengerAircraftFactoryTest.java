package by.shyrei.aircompany.factory;

import by.shyrei.aircompany.entity.AbstractAircraft;
import by.shyrei.aircompany.entity.PassengerAircraft;
import by.shyrei.aircompany.entity.AircraftName;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Project AirCompany
 * Created on 04.06.2017.
 * author Shyrei Uladzimir
 */
@RunWith(Parameterized.class)
public class PassengerAircraftFactoryTest {

    private AircraftFactory factory = PassengerAircraftFactory.getInstance();
    private String line;
    private PassengerAircraft passengerAircraft;

    public PassengerAircraftFactoryTest(String line, PassengerAircraft passengerAircraft) {
        this.line = line;
        this.passengerAircraft = passengerAircraft;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"pass Boing 747 500 40 1000 200", new PassengerAircraft(1000, AircraftName.BOING, "747", 500, 40, 1000, 200)},
                {"pass Airbus 154 300 30 900 150", new PassengerAircraft(1000, AircraftName.AIRBUS, "154", 300, 30, 900, 150)},
                {"pass AN 200 400 50 800 100", new PassengerAircraft(1000, AircraftName.AN, "200", 400, 50, 800, 100)}
        });
    }

    @Test
    public void createAircaft() throws Exception {
        AbstractAircraft actual = factory.createAircaft(line);
        actual.setAircraftId(1000);
        Assert.assertEquals(passengerAircraft, actual);
    }
}