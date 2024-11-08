package servicio;

import java.nio.file.Files;
import java.nio.file.Path;

public class ServicioComprobarRuta {
    //el método es non-static porque sólo tiene sentido para una instancia
    //la instancia será creada desde el menú correspondiente
    public boolean existeRuta(Path p){
        Boolean existe = false;
        if (Files.exists(p)){
            existe = true;
        }else{
            existe = false;
        }
        return existe;
    }
    public boolean esArchivo(Path p){
        if (existeRuta(p) && !Files.isDirectory(p)){}
    }
}
