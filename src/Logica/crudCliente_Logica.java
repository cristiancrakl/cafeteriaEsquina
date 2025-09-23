package Logica;

import javax.swing.JOptionPane;

public class crudCliente_Logica {

    Nodo primero;

    public void ingresarCliente(Persona cliente) {

        System.out.println("entro aqui");

        Nodo nuevo = new Nodo(cliente);
        if (primero == null) {
            primero = nuevo;
        } else {
            nuevo.setDireccion(primero);
            primero = nuevo;

        }
        JOptionPane.showMessageDialog(null, "cliente: " + primero.getPersona().getNombre() + " ingresado con exito"
                + "  a las: " + primero.getPersona().getHoraIngreso());

    }

    public void consultar() {

        System.out.println("entro aqui");
        Nodo temporal = primero;
        if (temporal == null) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
            System.out.println("si");
        } else {
            while (temporal != null) {
                JOptionPane.showMessageDialog(null, "Nombre : " + temporal.getPersona().getNombre());

                temporal = temporal.getDireccion();
                System.out.println("no");
            }
        }
    }

}
