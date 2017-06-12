package by.shyrei.aircompany.factory;

import by.shyrei.aircompany.entity.AbstractAircraft;

/**
 * Project AirCompany
 * Created on 02.06.2017.
 * author Shyrei Uladzimir
 */
public abstract class AircraftFactory<T extends AbstractAircraft> {

    public abstract T createAircaft(String line);
}
