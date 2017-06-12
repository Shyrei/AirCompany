package by.shyrei.aircompany.factory;

import by.shyrei.aircompany.entity.AbstractAircraft;
import by.shyrei.aircompany.entity.AirLine;


import java.util.ArrayList;

/**
 * Project AirCompany
 * Created on 05.06.2017.
 * author Shyrei Uladzimir
 */
public class AirLineCreator {

    public AirLine createAirline(ArrayList<String> inputAircrafts){
        AirLine airLine = new AirLine();
        for (String aircraft: inputAircrafts) {
            if (aircraft.substring(0, aircraft.indexOf(" ")).equals("cargo")) {
                AbstractAircraft cargoAircraft = CargoAircraftFactory.getInstance().createAircaft(aircraft);
                airLine.addAircraft(cargoAircraft);
            } else {
                AbstractAircraft passengerAircraft = PassengerAircraftFactory.getInstance().createAircaft(aircraft);
                airLine.addAircraft(passengerAircraft);
            }
        }
        return airLine;
    }
}
