package Logica;

import javax.swing.JOptionPane;

public class crudCliente_Logica {

    Nodo primero;

    // matriz para llevar el control de las mesas y los dias
    int[][] horarioMesa = new int[5][7];

    // esto es para cambiar de numeros a dias en letras
    public String saberDiasLetra(int dia) {

        String diaSemana = "";

        switch (dia) {
            case 0 -> diaSemana = "lunes";
            case 1 -> diaSemana = "martes";
            case 2 -> diaSemana = "miércoles";
            case 3 -> diaSemana = "jueves";
            case 4 -> diaSemana = "viernes";
            case 5 -> diaSemana = "sábado";
            case 6 -> diaSemana = "domingo";
            default -> {
            }
        }

        return diaSemana;

    }

    // esto es para cambiar de letras a dias en numero
    public int saberDiasNumero(String diaReserva, int diaSemana) {

        try {

            switch (diaReserva) {
                case "lunes" -> diaSemana = 0;
                case "martes" -> diaSemana = 1;
                case "miercoles" -> diaSemana = 2;
                case "jueves" -> diaSemana = 3;
                case "viernes" -> diaSemana = 4;
                case "sabado" -> diaSemana = 5;
                case "domingo" -> diaSemana = 6;
            }

        } catch (Exception e) {

            System.out.println(e);

        }

        return diaSemana;
    }

    // metodo para ingresar clientes a la lista
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

    // metodo para consultar todos los clientes
    public void consultar() {

        Nodo temporal = primero;
        if (temporal == null) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
            System.out.println("si");
        } else {
            while (temporal != null) {
                JOptionPane.showMessageDialog(null,
                        "Los datos del cliente son: \n" + temporal.getPersona().mostrarAtributos());
                temporal = temporal.getDireccion();
            }
        }
    }

    // metodo para consultar clientes por ID
    public void consultarID() {

        Nodo temporal = primero;
        if (temporal == null) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
            System.out.println("si");
        } else {

            boolean encontrado = false;

            int cedulaBuscar = Integer
                    .parseInt(JOptionPane.showInputDialog("Ingrese el numero de cedula a buscar"));

            while (temporal != null) {
                int cedula = temporal.getPersona().getCedulaId();

                if (cedula == cedulaBuscar) {
                    JOptionPane.showMessageDialog(null, "ID encontrado");
                    JOptionPane.showMessageDialog(null,
                            "Los datos del cliente son: \n" + "" + temporal.getPersona().mostrarAtributos());

                    encontrado = true;

                    break;

                }

                temporal = temporal.getDireccion();

            }
            if (encontrado == false) {
                JOptionPane.showMessageDialog(null, "ID no encontrado");

            }

        }
    }

    // metodo para mostar estadisticas
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

    // metodo para mostar estadisticas
    public void totalClientesPorDiaSemana() {
        for (int j = 0; j < horarioMesa[0].length; j++) {
            int totalDia = 0;
            for (int i = 0; i < horarioMesa.length; i++) {
                totalDia += horarioMesa[i][j];
            }
            JOptionPane.showMessageDialog(null,
                    "Total de clientes en el día " + (saberDiasLetra(j)) + ": " + totalDia);
        }
    }

    // metodo para mostar estadisticas
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

    // metodo para mostar estadisticas
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
                "El día con más clientes es el día " + (saberDiasLetra(maximoDia)) +
                        " con un total de " + maximoClientes + " clientes.");
    }

}
