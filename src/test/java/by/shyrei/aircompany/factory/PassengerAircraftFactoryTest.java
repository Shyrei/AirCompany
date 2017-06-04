package by.shyrei.aircompany.factory;
import by.shyrei.aircompany.service.AircraftName;
import by.shyrei.aircompany.entity.PassengerAircraft;
import org.junit.Assert;
import org.junit.Test;

/**
 * Project AirCompany
 * Created on 04.06.2017.
 * author Shyrei Uladzimir
 */
public class PassengerAircraftFactoryTest {

    private PassengerAircraft actual = new PassengerAircraft(1000, AircraftName.Boing, "747", 500, 40, 1000, 200);
    private PassengerAircraftFactory passengerFactory = PassengerAircraftFactory.getInstance();

    @Test
    public void createAircaft() throws Exception {
        String line = "Boing 747 500 40 1000 200";
        PassengerAircraft expected = passengerFactory.createAircaft(line);
        Assert.assertEquals(expected, actual);
        System.out.println(expected.toString());
        System.out.println(actual.toString());
    }
}