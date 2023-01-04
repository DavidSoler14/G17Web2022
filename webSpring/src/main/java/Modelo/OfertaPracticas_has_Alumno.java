package Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name="OfertaPracticas_has_Alumno")
public class OfertaPracticas_has_Alumno {
    @Column(name="OfertaPracticas_idOfertaPracticas")
    private int OfertaPracticas_idOfertaPracticas;
    @Column(name="Alumno_Persona_usuario")
    private String Alumno_Persona_usuario;

    public OfertaPracticas_has_Alumno(int OfertaPracticas_idOfertaPracticas, String Alumno_Persona_usuario) {
        this.OfertaPracticas_idOfertaPracticas = OfertaPracticas_idOfertaPracticas;
        this.Alumno_Persona_usuario = Alumno_Persona_usuario;
    }

    public int getOfertaPracticas_idOfertaPracticas() {
        return OfertaPracticas_idOfertaPracticas;
    }

    public void setOfertaPracticas_idOfertaPracticas(int OfertaPracticas_idOfertaPracticas) {
        this.OfertaPracticas_idOfertaPracticas = OfertaPracticas_idOfertaPracticas;
    }

    public String getAlumno_Persona_usuario() {
        return Alumno_Persona_usuario;
    }

    public void setAlumno_Persona_usuario(String Alumno_Persona_usuario) {
        this.Alumno_Persona_usuario = Alumno_Persona_usuario;
    }

}
