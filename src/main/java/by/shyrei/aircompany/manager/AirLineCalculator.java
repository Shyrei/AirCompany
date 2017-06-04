package by.shyrei.aircompany.manager;

import by.shyrei.aircompany.entity.AirLine;
import by.shyrei.aircompany.entity.Aircraft;
import by.shyrei.aircompany.entity.CargoAircraft;
import by.shyrei.aircompany.entity.PassengerAircraft;

/**
 * Project AirCompany
 * Created on 04.06.2017.
 * author Shyrei Uladzimir
 */

public class AirLineCalculator {

    public int exitLimitCalculator(AirLine company){

        return company.getAircraft().stream().filter((Aircraft aircraft) -> aircraft instanceof PassengerAircraft).mapToInt(aircraft -> ((PassengerAircraft) aircraft).getExitLimit()).sum();
        /*int exitLimitSum = 0;
        for (Aircraft aircraft : company.getAircraft()) {
            if (aircraft instanceof PassengerAircraft) {
                PassengerAircraft passengerAircraft = (PassengerAircraft) aircraft;
                exitLimitSum += passengerAircraft.getExitLimit();
            }
        }
        return exitLimitSum;*/
    }

    public int payLoadCalculator(AirLine company){
        return company.getAircraft().stream().filter((Aircraft aircraft) -> aircraft instanceof CargoAircraft).mapToInt(aircraft -> ((CargoAircraft) aircraft).getPayload()).sum();
    }
}
