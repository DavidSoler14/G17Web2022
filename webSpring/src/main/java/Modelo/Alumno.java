package Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Alumno")
public class Alumno extends Persona {
    @Column(name="Persona_usuario")
    private String Persona_usuario;
    @Column(name="notaMedia")
    private double notaMedia;
    @Column(name="carrera")
    private String carrera;
    @Column(name="OfertaPracticas_idOfertaPracticas")
    private int OfertaPracticas_idOfertaPracticas;

    public Alumno(String Persona_usuario, double notaMedia, String carrera, int OfertaPracticas_idOfertaPracticas, String nif, String usuario, String contrasena) {
        super(nif, usuario, contrasena);
        this.Persona_usuario = Persona_usuario;
        this.notaMedia = notaMedia;
        this.carrera = carrera;
        this.OfertaPracticas_idOfertaPracticas = OfertaPracticas_idOfertaPracticas;
    }
    
    public String getPersona_usuario() {
        return Persona_usuario;
    }

    public void setPersona_usuario(String Persona_usuario) {
        this.Persona_usuario = Persona_usuario;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getOfertaPracticas_idOfertaPracticas() {
        return OfertaPracticas_idOfertaPracticas;
    }

    public void setOfertaPracticas_idOfertaPracticas(int OfertaPracticas_idOfertaPracticas) {
        this.OfertaPracticas_idOfertaPracticas = OfertaPracticas_idOfertaPracticas;
    }

}
