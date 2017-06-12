package by.shyrei.aircompany.entity;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Project AirCompany
 * Created on 04.06.2017.
 * author Shyrei Uladzimir
 */
public enum AircraftName {
    BOING, TY, AN, AIRBUS, AIRCRAFT;

    private static Logger logger = LogManager.getLogger(AircraftName.class);

    public static AircraftName stringToName(String name) {
        try {
            return AircraftName.valueOf(name.toUpperCase());
        } catch (IllegalArgumentException e) {
            logger.log(Level.WARN, "Некоректное название самолета :" + name + ". Название самолета установлено по умолчанию.");
            return AircraftName.AIRCRAFT;
        }
    }
}
