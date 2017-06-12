package by.shyrei.aircompany.manager;

import by.shyrei.aircompany.entity.AbstractAircraft;
import by.shyrei.aircompany.entity.AirLine;
import by.shyrei.aircompany.entity.CargoAircraft;
import by.shyrei.aircompany.entity.PassengerAircraft;
import by.shyrei.aircompany.entity.AircraftName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Project AirCompany
 * Created on 04.06.2017.
 * author Shyrei Uladzimir
 */
public class AirLineCalculatorTest {

    private AirLine airLine = new AirLine();
    private AirLineCalculator calculator = new AirLineCalculator();

    @Before
    public void init() {
        AbstractAircraft cargo1 = new CargoAircraft(1, AircraftName.BOING, "747", 2, 3, 4, 250);
        AbstractAircraft passenger1 = new PassengerAircraft(2, AircraftName.TY, "154", 6, 7, 8, 150);
        AbstractAircraft passenger2 = new PassengerAircraft(3, AircraftName.TY, "154", 6, 7, 8, 200);
        AbstractAircraft cargo2 = new CargoAircraft(4, AircraftName.BOING, "730", 22, 33, 44, 300);
        airLine.addAircraft(cargo1);
        airLine.addAircraft(passenger1);
        airLine.addAircraft(passenger2);
        airLine.addAircraft(cargo2);
    }

    @After
    public void clearData() {
        airLine.getAllAircraft().clear();
    }

    @Test
    public void exitLimitCalculator() throws Exception {
        int expected = 350;
        int actual = calculator.exitLimitCalculator(airLine);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void payLoadCalculator() throws Exception {
        int expected = 550;
        int actual = calculator.payLoadCalculator(airLine);
        Assert.assertEquals(expected,actual);
    }
}