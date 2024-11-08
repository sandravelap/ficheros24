package cmd;

import servicio.ServicioComprobarRuta;

import java.nio.file.Path;
import java.util.Scanner;

import static libs.checkFiles.pedirRuta;

public class MenuComprobaciones {
    private Scanner scanner = new Scanner(System.in);
    private ServicioComprobarRuta servicioComprobarRuta = new ServicioComprobarRuta();
    private boolean salir = false;

    public void muestraMenuComprobaciones() {
        String opcion;
        do {
            System.out.println("Elige una opcion:");
            System.out.println("1. Comprobar si existe");
            System.out.println("2. Comprobar si se puede leer.");
            System.out.println("3. Comprobar si se tienen permisos de escritura.");
            System.out.println("4. Comprobar el tamaño.");
            System.out.println("0. Salir");
            opcion = this.pideOpcion();
            this.procesaOpcion(opcion);
        } while (!salir);
    }

    private String pideOpcion() {
        return this.scanner.nextLine();
    }

    private void procesaOpcion(String opcion) {
        switch (opcion) {
            case "0" -> salir = true;
            case "1" -> this.comprobarExistencia();
            case "2" -> this.existeFichero();
            default -> System.out.println("Opcion invalida");
        }
    }

    private void existeFichero() {

    }

    private void comprobarExistencia() {
        //como necesitamos más datos nos quedamos en la capa menú
        //utilizamos nuestra librería para pedir una ruta con la sintaxis correcta
        Path ruta = pedirRuta("Introduce la ruta a comprobar: ");
        //llamamos al servicio que comprueba con toda la información neesaria
        this.servicioComprobarRuta.existeRuta(ruta);
    }

}
