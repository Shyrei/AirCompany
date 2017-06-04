package by.shyrei.aircompany.entity;

import by.shyrei.aircompany.aircraftenum.AircraftName;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.core.IsInstanceOf.instanceOf;

/**
 * Project AirCompany
 * Created on 02.06.2017.
 * author Shyrei Uladzimir
 */
public class AirLineTest {

    private Aircraft cargo = new CargoAircraft(1, AircraftName.Boing, "747", 2, 3, 4, 5);
    private Aircraft pass = new PassengerAircraft(2, AircraftName.TY, "154", 6, 7, 8 , 9);
    private Aircraft pass1 = new PassengerAircraft(3, AircraftName.TY, "154", 6, 7, 8 , 9);
    private Aircraft cargo1 = new CargoAircraft(4, AircraftName.Boing, "730", 22, 33, 44,66);
    private AirLine line = new AirLine();

    @Test
    public void rub1() throws Exception {
        line.add(cargo);
        line.add(pass);
        line.add(pass1);
        line.add(cargo1);
        int i = 0;
        for (Aircraft plane : line.getAircraft()) {
            if (plane instanceof CargoAircraft) {
                CargoAircraft te = (CargoAircraft) plane;
                i += ((CargoAircraft) plane).getPayload();
            }
        }

        ArrayList<Aircraft> test1 = line.getAircraft();
        //int summ = test1.stream().filter(aircraft -> aircraft.getClass().equals(CargoAircraft.class)).forEach((CargoAircraft)cargo. -> );
        //int sum2 = test.stream().map(CargoAircraft::getPayload).filter(p instanceof CargoAircraft)
      //  System.out.println(summ);

    }
    }
