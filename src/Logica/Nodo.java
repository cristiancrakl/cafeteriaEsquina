package Logica;

public class Nodo {

    private Nodo direccion;
    private Persona persona;

    public Nodo getDireccion() {
        return direccion;
    }

    public void setDireccion(Nodo direccion) {
        this.direccion = direccion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Nodo(Persona persona) {
        this.persona = persona;
    }

}
