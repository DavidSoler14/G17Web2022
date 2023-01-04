package Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name="Responsable")
public class Responsable extends Persona {
    @Column(name="Persona_usuario")
    private String Persona_usuario;

    public Responsable(String Persona_usuario, String nif, String usuario, String contrasena) {
        super(nif, usuario, contrasena);
        this.Persona_usuario = Persona_usuario;
    }

    public String getPersona_usuario() {
        return Persona_usuario;
    }

    public void setPersona_usuario(String Persona_usuario) {
        this.Persona_usuario = Persona_usuario;
    }
}
