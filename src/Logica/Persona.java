package Logica;

import java.time.LocalDateTime;

public class Persona {

    private String nombre;
    private int cedulaId;
    private int mesaPosicion;
    private int diaSemana;
    private LocalDateTime horaIngreso;

    public Persona(int cedulaId, int diaSemana, LocalDateTime horaIngreso, int mesaPosicion, String nombre) {
        this.cedulaId = cedulaId;
        this.diaSemana = diaSemana;
        this.horaIngreso = horaIngreso;
        this.mesaPosicion = mesaPosicion;
        this.nombre = nombre;
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

    public LocalDateTime getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(LocalDateTime horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

}
