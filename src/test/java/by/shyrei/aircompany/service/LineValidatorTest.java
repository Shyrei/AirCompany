package by.shyrei.aircompany.service;

import org.junit.Assert;
import org.junit.Test;


/**
 * Project AirCompany
 * Created on 12.06.2017.
 * author Shyrei Uladzimir
 */
public class LineValidatorTest {

    private LineValidator lineValidator = new LineValidator();

    @Test
    public void correctLine() throws Exception {
        String line = "pass Boing 747 500 40 1000 200";
        Assert.assertTrue(lineValidator.validator(line));
    }

    @Test
    public void inCorrectLine() throws Exception {
        String line = "pass AN 500 40 900 150";
        Assert.assertFalse(lineValidator.validator(line));
    }
}