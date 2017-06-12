package by.shyrei.aircompany.manager;

import by.shyrei.aircompany.entity.AbstractAircraft;
import by.shyrei.aircompany.entity.AirLine;

import java.util.Optional;



/**
 * Project AirCompany
 * Created on 05.06.2017.
 * author Shyrei Uladzimir
 */
public class AirLineFinder {

    public Optional<AbstractAircraft> findByWieght(int weight, AirLine company) {
       return company.getAllAircraft().stream().filter(o -> o.getAircraftWeight()==weight).findFirst();
    }
}
