package by.shyrei.aircompany.factory;

import by.shyrei.aircompany.entity.AbstractAircraft;
import by.shyrei.aircompany.entity.CargoAircraft;
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
public class CargoAircraftFactoryTest {

    private AircraftFactory factory = CargoAircraftFactory.getInstance();
    private String line;
    private CargoAircraft cargoAircraft;

    public CargoAircraftFactoryTest(String line, CargoAircraft cargoAircraft) {
        this.line = line;
        this.cargoAircraft = cargoAircraft;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"cargo Boing 747 500 40 1000 200", new CargoAircraft(1000, AircraftName.BOING, "747", 500, 40, 1000, 200)},
                {"cargo TY 154 300 30 900 150", new CargoAircraft(1000, AircraftName.TY, "154", 300, 30, 900, 150)},
                {"cargo AN 200 400 50 800 100", new CargoAircraft(1000, AircraftName.AN, "200", 400, 50, 800, 100)}
        });
    }

    @Test
    public void createAircaft() throws Exception {
        AbstractAircraft actual = factory.createAircraft(line);
        actual.setAircraftId(1000);
        Assert.assertEquals(cargoAircraft, actual);
    }
}