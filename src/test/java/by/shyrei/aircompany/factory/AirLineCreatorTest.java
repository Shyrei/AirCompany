package by.shyrei.aircompany.factory;

import by.shyrei.aircompany.entity.AirLine;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


/**
 * Project AirCompany
 * Created on 12.06.2017.
 * author Shyrei Uladzimir
 */
@RunWith(Parameterized.class)
public class AirLineCreatorTest {

    private ArrayList<String> inputAircraft;
    private AirLineCreator airLineCreator = new AirLineCreator();

    public AirLineCreatorTest(ArrayList<String> inputAircraft) {
        this.inputAircraft = inputAircraft;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new ArrayList<>(Arrays.asList("cargo Boing 747 500 40 1000 200", "pass TY 154 300 30 900 150", "cargo AN 200 400 50 800 100"))},
                {new ArrayList<>(Arrays.asList("pass TY 144 200 25 700 100", "cargo Airbus 500 400 70 800 400", "pass Boing 737 400 45 950 180"))},
                {new ArrayList<>(Arrays.asList("cargo Airbus 400 300 65 780 350", "cargo Airbus 450 350 67 790 370", "pass AN 100 200 20 700 100"))},
        });
    }

    @Test
    public void createAirline() throws Exception {
        AirLine airLine = airLineCreator.createAirline(inputAircraft);
        Assert.assertFalse(airLine.getAllAircraft().isEmpty());
    }
}