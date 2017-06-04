package by.shyrei.aircompany.reader;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Project AirCompany
 * Created on 04.06.2017.
 * author Shyrei Uladzimir
 */
public class LineFileReader {

    private static Logger logger = LogManager.getLogger(LineFileReader.class);

    public ArrayList<String> lineReader(String path) {
        ArrayList<String> lines = new ArrayList<>();
        try {
            //Files.readAllLines(Paths.get(path) , StandardCharsets.UTF_8).stream().filter((String line) ->VALIDATE.matcher(line).matches()).forEach(lines::add);
            lines.addAll(Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8));
        } catch (IOException e) {
            logger.log(Level.ERROR, "Ошибка с файлом: " + e.getMessage());
        }
        return lines;
    }
}
