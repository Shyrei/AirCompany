package by.shyrei.aircompany.manager;

import by.shyrei.aircompany.entity.*;
import by.shyrei.aircompany.entity.AbstractAircraft;
import by.shyrei.aircompany.entity.CargoAircraft;
import by.shyrei.aircompany.entity.AircraftName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Project AirCompany
 * Created on 04.06.2017.
 * author Shyrei Uladzimir
 */
public class AirLineSorterTest {

    private AirLine airLine = new AirLine();
    private AirLineSorter comparator = new AirLineSorter();

    @Before
    public void init() {
        AbstractAircraft cargo1 = new CargoAircraft(1, AircraftName.BOING, "747", 2, 3, 4, 5);
        AbstractAircraft passenger1 = new PassengerAircraft(2, AircraftName.TY, "154", 6, 7, 88, 9);
        AbstractAircraft passenger2 = new PassengerAircraft(3, AircraftName.TY, "154", 6, 7, 510, 9);
        AbstractAircraft cargo2 = new CargoAircraft(4, AircraftName.BOING, "730", 1, 33, 44, 70);
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
    public void sortByWeight() throws Exception {
        System.out.println(airLine.getAllAircraft());
        ArrayList<AbstractAircraft> test = comparator.sortByWeight(airLine.getAllAircraft());
        System.out.println(test);
    }

    @Test
    public void sortByWeightAndSpeed() throws Exception {
        System.out.println(airLine.getAllAircraft());
        ArrayList<AbstractAircraft> test = comparator.sortByWeightAndSpeed(airLine.getAllAircraft());
        System.out.println(test);
    }
}