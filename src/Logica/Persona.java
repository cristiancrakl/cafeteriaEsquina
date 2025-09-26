package Logica;

public class Persona {
    crudCliente_Logica diasCambio = new crudCliente_Logica();

    private String nombre;
    private int cedulaId;
    private int mesaPosicion;
    private int diaSemana;
    private String horaIngreso;

    public Persona(int cedulaId, int diaSemana, String horaIngreso, int mesaPosicion, String nombre) {
        this.cedulaId = cedulaId;
        this.diaSemana = diaSemana;
        this.horaIngreso = horaIngreso;
        this.mesaPosicion = mesaPosicion;
        this.nombre = nombre;
    }

    public String mostrarAtributos() {

        return "Nombre: " + nombre + "\nCedula: " + cedulaId + "\nMesa: " + (mesaPosicion + 1) + "\nDia reserva: "
                + diasCambio.saberDiasLetra(diaSemana)
                + "\nHora de ingreso: " + horaIngreso;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedulaId() {
        return cedulaId;
    }

    public void setCedulaId(int cedulaId) {
        this.cedulaId = cedulaId;
    }

    public int getMesaPosicion() {
        return mesaPosicion;
    }

    public void setMesaPosicion(int mesaPosicion) {
        this.mesaPosicion = mesaPosicion;
    }

    public int getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

}
