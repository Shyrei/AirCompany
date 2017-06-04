package by.shyrei.aircompany.factory;

import by.shyrei.aircompany.entity.Aircraft;

/**
 * Project AirCompany
 * Created on 02.06.2017.
 * author Shyrei Uladzimir
 */
public abstract class AbstractAircraftFactory<T extends Aircraft> {

    public abstract T createAircaft(String line);
}
