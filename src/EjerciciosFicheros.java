import cmd.MenuEjercicios;

public class EjerciciosFicheros {
    public static void main(String[] args) {
        //creo un objeto menu para trabajar con él
        //el objeto menú es único y se crea al ser requerido, por eso es non-static
        MenuEjercicios menuEjercicios = new MenuEjercicios();
        menuEjercicios.muestraMenu();
    }
}
