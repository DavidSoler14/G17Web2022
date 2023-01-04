package Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="InformePracticas")
public class InformePracticas {
    @Column(name="comentarios")
    private String comentarios;
    @Column(name="nota")
    private double nota;
    @Column(name="Tutor_Persona_usuario")
    private String Tutor_Persona_usuario;
    @Column(name="Tutor_Empresa_cif")
    private String Tutor_Empresa_cif;
    @Column(name="Alumno_Persona_usuario")
    private String Alumno_Persona_usuario;
    

    public InformePracticas(String comentarios, double nota, String Tutor_Persona_usuario, String Tutor_Empresa_cif, String Alumno_Persona_usuario) {
        this.comentarios = comentarios;
        this.nota = nota;
        this.Tutor_Persona_usuario = Tutor_Persona_usuario;
        this.Tutor_Empresa_cif = Tutor_Empresa_cif;
        this.Alumno_Persona_usuario = Alumno_Persona_usuario;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getTutor_Persona_usuario() {
        return Tutor_Persona_usuario;
    }

    public void setTutor_Persona_usuario(String Tutor_Persona_usuario) {
        this.Tutor_Persona_usuario = Tutor_Persona_usuario;
    }

    public String getTutor_Empresa_cif() {
        return Tutor_Empresa_cif;
    }

    public void setTutor_Empresa_cif(String Tutor_Empresa_cif) {
        this.Tutor_Empresa_cif = Tutor_Empresa_cif;
    }

    public String getAlumno_Persona_usuario() {
        return Alumno_Persona_usuario;
    }

    public void setAlumno_Persona_usuario(String Alumno_Persona_usuario) {
        this.Alumno_Persona_usuario = Alumno_Persona_usuario;
    }

}
