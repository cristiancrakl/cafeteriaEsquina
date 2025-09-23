package Logica;

import javax.swing.JOptionPane;

public class crudCliente_Logica {

    Nodo primero;
    
    int[][] horarioMesa = new int[3][6];
    
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
        
        horarioMesa[cliente.getMesaPosicion()][cliente.getDiaSemana()] += 1;
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
    
    public void totalClientesSemanales() {
        int totalClientes = 0;
        for (int i = 0; i < horarioMesa.length; i++) {
            for (int j = 0; j < horarioMesa[i].length; j++) {
                totalClientes += horarioMesa[i][j];
            }
        }
        JOptionPane.showMessageDialog(null, 
            "El total de clientes en la semana es: " + totalClientes);
    }
    
    public void totalClientesPorDiaSemana() {
        for (int j = 0; j < horarioMesa[0].length; j++) {
           int totalDia = 0;
           for (int i = 0; i < horarioMesa.length; i++) {
            totalDia += horarioMesa[i][j];
        }
        JOptionPane.showMessageDialog(null, 
            "Total de clientes en el día " + (j + 1) + ": " + totalDia);
        }
    }
    
    public void totalClientesPorMesa() {
    for (int i = 0; i < horarioMesa.length; i++) { 
        int totalMesa = 0;

        for (int j = 0; j < horarioMesa[i].length; j++) { 
            totalMesa += horarioMesa[i][j];
        }
        
        JOptionPane.showMessageDialog(null, 
            "Total de clientes en la mesa " + (i + 1) + " = " + totalMesa);

    }
    }
    
    public void diaConMasClientes() {
    int maximoDia = -1;
    
    int maximoClientes = -1;

    for (int j = 0; j < horarioMesa[0].length; j++) { 
        int totalDia = 0;

        for (int i = 0; i < horarioMesa.length; i++) {
            totalDia += horarioMesa[i][j];
        }

        if (totalDia > maximoClientes) {
            maximoClientes = totalDia;
            maximoDia = j;
        }
    }

    JOptionPane.showMessageDialog(null, 
        "El día con más clientes es el día " + (maximoDia + 1) + 
        " con un total de " + maximoClientes + " clientes.");
}


}
