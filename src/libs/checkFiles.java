package libs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class checkFiles {
    static void mostrarEnPantalla(String mensaje) {
        System.out.println(mensaje);
    }

    public static boolean exist(String ruta){
        return Files.exists(Path.of(ruta));
    }

    public static Path pedirRuta(final String mensaje) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String rutaString = "";
        Path ruta = Path.of(rutaString);
        boolean error = true;
        while (error) {
            try {
                mostrarEnPantalla(mensaje);
                rutaString = dataIn.readLine();
                ruta = Path.of(rutaString);
            } catch (IOException e) {
                mostrarEnPantalla("Vuelve a introducir el dato, por favor");
            } catch (InvalidPathException e) {
                mostrarEnPantalla("La ruta contiene caracteres ilegales");
            }
        }
        return ruta;
    }


}
