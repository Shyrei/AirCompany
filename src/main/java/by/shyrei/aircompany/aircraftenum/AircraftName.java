package by.shyrei.aircompany.aircraftenum;

/**
 * Project AirCompany
 * Created on 04.06.2017.
 * author Shyrei Uladzimir
 */
public enum AircraftName {
    Boing, TY, AN, AirBus, Aicraft;

    public static AircraftName stringToName(String name) {
        switch (name) {
            case "Boing":
                return Boing;
            case "TY":
                return TY;
            case "AN":
                return AN;
            case "AirBus":
                return AirBus;
            default:
                return Aicraft;
        }
    }
}
