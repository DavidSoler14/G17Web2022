package Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Empresa")
public class Empresa {
    @Column(name="cif")
    private String cif;
    @Column(name="nombre")
    private String nombre;
    @Column(name="sector")
    private String sector;

    public Empresa(String cif, String nombre, String sector) {
        this.cif = cif;
        this.nombre = nombre;
        this.sector = sector;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
