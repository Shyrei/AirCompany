package by.shyrei.aircompany.reader;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Project AirCompany
 * Created on 04.06.2017.
 * author Shyrei Uladzimir
 */
public class LineFileReaderTest {

    private static final String FILES_PATH = "files//line.txt";
    private LineFileReader lineFileReader = new LineFileReader();

    @Test
    public void readerTest() throws Exception {
        List<String> testLines = lineFileReader.lineReader(FILES_PATH);
        for (String line: testLines) {
            System.out.println(line);
        }
        Assert.assertTrue("Не удалось прочитать файл", testLines.size() > 0);
    }

}