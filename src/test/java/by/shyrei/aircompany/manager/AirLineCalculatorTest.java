package by.shyrei.aircompany.manager;

import by.shyrei.aircompany.entity.AirLine;
import by.shyrei.aircompany.entity.Aircraft;
import by.shyrei.aircompany.entity.CargoAircraft;
import by.shyrei.aircompany.entity.PassengerAircraft;
import by.shyrei.aircompany.service.AircraftName;
import org.junit.Assert;
import org.junit.Test;

/**
 * Project AirCompany
 * Created on 04.06.2017.
 * author Shyrei Uladzimir
 */
public class AirLineCalculatorTest {

    private Aircraft cargo1 = new CargoAircraft(1, AircraftName.Boing, "747", 2, 3, 4, 250);
    private Aircraft passenger1 = new PassengerAircraft(2, AircraftName.TY, "154", 6, 7, 8 , 150);
    private Aircraft passenger2 = new PassengerAircraft(3, AircraftName.TY, "154", 6, 7, 8 , 200);
    private Aircraft cargo2 = new CargoAircraft(4, AircraftName.Boing, "730", 22, 33, 44,300);
    private AirLineCalculator calculator = new AirLineCalculator();
    private AirLine company = new AirLine();


    @Test
    public void exitLimitCalculator() throws Exception {
        company.add(cargo1);
        company.add(passenger1);
        company.add(passenger2);
        company.add(cargo2);
        int actual = 350;
        int expected = calculator.exitLimitCalculator(company);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void payLoadCalculator() throws Exception {
        company.add(cargo1);
        company.add(passenger1);
        company.add(passenger2);
        company.add(cargo2);
        int actual = 550;
        int expected = calculator.payLoadCalculator(company);
        Assert.assertEquals(expected,actual);
    }
}