package by.shyrei.aircompany.service;

/**
 * Project AirCompany
 * Created on 04.06.2017.
 * author Shyrei Uladzimir
 */
public class IdGenerator {

    private static int counter = 1000;

    public static int generateId(){
        return counter++;
    }
}
