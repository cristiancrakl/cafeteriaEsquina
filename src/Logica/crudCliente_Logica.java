package Logica;

import javax.swing.JOptionPane;

public class crudCliente_Logica {

    Nodo primero;
    Persona cliente;

    public crudCliente_Logica(){
        primero=null;
    }

    public void ingresarCliente(Persona cliente) {

        System.out.println("entro aqui");

        Nodo nuevo = new Nodo(null, cliente);
        if (primero == null) {
            primero = nuevo;
            JOptionPane.showMessageDialog(null, "cliente: " + cliente.getNombre() + " ingresado con exito");
        } else {
            nuevo.setDireccion(primero);
            primero = nuevo;
            JOptionPane.showMessageDialog(null, "cliente: " + cliente.getNombre() + " ingresado con exito");
        }

    }

    public void consultar() {

        Nodo temporal = primero;
        if (temporal == null) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
        } else {
            while (temporal != null) {
                JOptionPane.showMessageDialog(null,
                        "Nombre : " + temporal.getPersona().getNombre() + " Edad : "
                                + temporal.getPersona().getNombre());

                temporal = temporal.getDireccion();
            }
        }
    }

}
