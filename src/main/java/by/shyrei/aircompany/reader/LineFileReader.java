package by.shyrei.aircompany.reader;

import by.shyrei.aircompany.exception.InitializationException;
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

    public ArrayList<String> lineReader(String path) throws InitializationException {
        ArrayList<String> lines = new ArrayList<>();
        try {
            lines.addAll(Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new InitializationException("Ошибка с файлом, " + e.getMessage());
        }
        return lines;
    }
}
