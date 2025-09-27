import Interfaz.*;
import Logica.crudCliente_Logica;

public class Run {

    public static void main(String[] args) {

        crudCliente_Logica crud = new crudCliente_Logica();

        registrarCliente_Interfaz ventana = new registrarCliente_Interfaz(crud);
        ventana.setVisible(true);

    }

}
