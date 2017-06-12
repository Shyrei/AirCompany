package by.shyrei.aircompany.manager;

import by.shyrei.aircompany.entity.AbstractAircraft;
import by.shyrei.aircompany.entity.AirLine;
import java.util.ArrayList;
import java.util.Optional;


/**
 * Project AirCompany
 * Created on 05.06.2017.
 * author Shyrei Uladzimir
 */
public class AirLineFinder {

    public Optional<AbstractAircraft> findByWieght(int weight, AirLine company) {
        return company.getAllAircraft().stream().filter(o -> o.getAircraftWeight() == weight).findFirst();
    }

    public ArrayList<AbstractAircraft> findByFuel(int minFuel, int maxFuel, AirLine company) {
        ArrayList<AbstractAircraft> aircrafts = new ArrayList<>();
        company.getAllAircraft().stream().filter(o -> minFuel <= o.getFuelPerHour() & o.getFuelPerHour() <= maxFuel).forEach(aircrafts::add);
        return aircrafts;
    }
}
