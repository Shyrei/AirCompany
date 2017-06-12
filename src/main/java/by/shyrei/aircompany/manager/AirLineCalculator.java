package by.shyrei.aircompany.manager;

import by.shyrei.aircompany.entity.*;

/**
 * Project AirCompany
 * Created on 04.06.2017.
 * author Shyrei Uladzimir
 */

public class AirLineCalculator {

    public int exitLimitCalculator(AirLine company) {
        return company.getAllAircraft().stream().filter((AbstractAircraft o) -> o instanceof PassengerAircraft).mapToInt(o -> ((PassengerAircraft) o).getExitLimit()).sum();
    }

    public int payLoadCalculator(AirLine company) {
        return company.getAllAircraft().stream().filter((AbstractAircraft o) -> o instanceof CargoAircraft).mapToInt(o -> ((CargoAircraft) o).getPayload()).sum();
    }
}
