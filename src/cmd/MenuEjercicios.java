package cmd;

import java.util.Scanner;

public class MenuEjercicios {

    private Scanner scanner = new Scanner(System.in);
    private MenuComprobaciones menuComprobaciones = new MenuComprobaciones();
    private MenuAccesos menuAccesos = new MenuAccesos();
    private boolean salir = false;

    public void muestraMenu(){
        String opcion;
        do {
            System.out.println("Elige una opcion:");
            System.out.println("1. Comprobaciones de ficheros");
            System.out.println("2. Acceso a ficheros");
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
            case "1" -> this.menuComprobaciones.muestraMenuComprobaciones();
            case "2" -> this.menuAccesos.muestraMenuAccesos();
            default -> System.out.println("Opcion no valida");
        }
    }
}
