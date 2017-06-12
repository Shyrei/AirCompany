package by.shyrei.aircompany.manager;

import by.shyrei.aircompany.entity.AbstractAircraft;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Project AirCompany
 * Created on 04.06.2017.
 * author Shyrei Uladzimir
 */
public class AirLineSorter {

    public ArrayList<AbstractAircraft> sortByWeight(ArrayList<AbstractAircraft> airLineData) {
        airLineData.sort(Comparator.comparing(AbstractAircraft::getAircraftWeight));
        return airLineData;
    }

    public ArrayList<AbstractAircraft> sortByWeightAndSpeed(ArrayList<AbstractAircraft> airLineData) {
        airLineData.sort(Comparator.comparing(AbstractAircraft::getAircraftWeight).thenComparing(AbstractAircraft::getSpeed));
        return airLineData;
    }
}
