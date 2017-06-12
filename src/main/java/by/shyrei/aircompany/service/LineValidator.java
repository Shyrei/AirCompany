package by.shyrei.aircompany.service;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

import java.util.regex.Pattern;

/**
 * Project AirCompany
 * Created on 12.06.2017.
 * author Shyrei Uladzimir
 */
public class LineValidator {

    private static Logger logger = LogManager.getLogger(LineValidator.class);
    private static final Pattern VALIDATE = Pattern.compile("(cargo|pass)\\s([a-zA-Z]{2,5})\\s(([1-9]\\d+\\s){4})([1-9]\\d+)");

    public boolean validator(String line) {
        if (VALIDATE.matcher(line).matches()) {
            return true;
        } else {
            logger.log(Level.WARN, "Строка: " + line + " не корректна.");
        }
        return false;
    }
}
