package cmd;

import servicio.servicioAccesos;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import static libs.checkFiles.pedirRuta;

public class MenuAccesos {
    private boolean salir = false;
    private Scanner sc = new Scanner(System.in);
    //private ServicioComprobaciones servicio = new ServicioComprobaciones();
    private servicioAccesos servicioAcceso = new servicioAccesos();

    public void muestraMenuAccesos() {
        String opcion;
        do {
            System.out.println("Elige una opcion:");
            System.out.println("1. Leer fichero");
            System.out.println("2. Escribir fichero");
            System.out.println("0. Salir");
            opcion = this.pideOpcion();
            this.procesaOpcion(opcion);
        } while (!salir);
    }

    private String pideOpcion() {
        return this.sc.nextLine();
    }

    private void procesaOpcion(String opcion) {
        switch (opcion) {
            case "0" -> salir = true;
            default -> System.out.println("Opción incorrecta");
            case "1" -> {
                Path p = pedirRuta("Introduce la ruta del fichero: ");
                if ( Files.isReadable(p)){
                    servicioAcceso.leerFichero(p);
                }
            }
        }
    }
}
