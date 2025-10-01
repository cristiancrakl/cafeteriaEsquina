import Interfaz.*;
import Logica.crudCliente_Logica;

public class Run {

    public static void main(String[] args) {

        // crear el objeto crud para manejar la logica
        crudCliente_Logica crud = new crudCliente_Logica();

        // abrir la ventana de registrar cliente y le mandarle el objeto crud para que
        // sea el mismo
        logicaNegocio ventana = new logicaNegocio(crud);
        ventana.setVisible(true);

    }

}
