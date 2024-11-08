package servicio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class servicioAccesos {
    public ArrayList<String> leerFichero(Path p) {
        ArrayList<String> contenidoFichero = new ArrayList<>();
        try {
            contenidoFichero = (ArrayList<String>) Files.readAllLines(p);
        } catch (IOException e) {
            contenidoFichero.add("Error al leer el fichero");
        }
        return contenidoFichero;
    }
}
