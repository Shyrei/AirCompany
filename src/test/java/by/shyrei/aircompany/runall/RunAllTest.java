package by.shyrei.aircompany.runall;
import by.shyrei.aircompany.factory.CargoAircraftFactoryTest;
import by.shyrei.aircompany.factory.PassengerAircraftFactoryTest;
import by.shyrei.aircompany.manager.AirLineCalculatorTest;
import by.shyrei.aircompany.manager.AirLineSorterTest;
import by.shyrei.aircompany.manager.AirLineFinderTest;
import by.shyrei.aircompany.reader.LineFileReaderTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Project AirCompany
 * Created on 06.06.2017.
 * author Shyrei Uladzimir
 */

@RunWith(Suite.class)
@Suite.SuiteClasses ({
        CargoAircraftFactoryTest.class,
        PassengerAircraftFactoryTest.class,
        AirLineCalculatorTest.class,
        AirLineSorterTest.class,
        AirLineFinderTest.class,
        LineFileReaderTest.class
})
public class RunAllTest {
}
