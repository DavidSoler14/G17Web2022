/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Alumno;
import Modelo.Empresa;
import Modelo.OfertaPracticas;
import Modelo.Responsable;
import Modelo.Tutor;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.logging.Logger;
import static org.hibernate.bytecode.BytecodeLogging.LOGGER;

/**
 *
 * @author dsole
 */

public class UserService {
    private static ArrayList<Tutor> tutoresRegistrados = new ArrayList<>();
    private static ArrayList<OfertaPracticas> ofertasRegistradas = new ArrayList<>();
    private static ArrayList<Empresa> empresasRegistradas = new ArrayList<>();
    private static ArrayList<Alumno> alumnosRegistrados = new ArrayList<>();
    
  

    static void actualiza_oferta(OfertaPracticas ofertaPracticas) {

        for (int i = 0; i < ofertasRegistradas.size(); i++) {
            if(ofertasRegistradas.get(i).getIdOfertaPracticas()==ofertaPracticas.getIdOfertaPracticas()){
                ofertasRegistradas.get(i).setCurso(ofertaPracticas.getCurso());
                ofertasRegistradas.get(i).setDescripcion(ofertaPracticas.getDescripcion());
                ofertasRegistradas.get(i).setFechaInicio(ofertaPracticas.getFechaInicio());
                ofertasRegistradas.get(i).setIdOfertaPracticas(ofertaPracticas.getIdOfertaPracticas());
                ofertasRegistradas.get(i).setIdiomas(ofertaPracticas.getIdiomas());
                ofertasRegistradas.get(i).setRequisitos(ofertaPracticas.getRequisitos());
                ofertasRegistradas.get(i).setTitulo(ofertaPracticas.getTitulo());
                ofertasRegistradas.get(i).setTutor_Empresa_cif(ofertaPracticas.getTutor_Empresa_cif());
                ofertasRegistradas.get(i).setTutor_Persona_usuario(ofertaPracticas.getTutor_Persona_usuario());
            }	
        }
 	
	
    }

    static void actualiza_alumno(Alumno alumno) {
        for (int i = 0; i < alumnosRegistrados.size(); i++) {
            if(alumnosRegistrados.get(i).getNif().equals(alumno.getNif())){
                alumnosRegistrados.get(i).setCarrera(alumno.getCarrera());
                alumnosRegistrados.get(i).setContrasena(alumno.getContrasena());
                alumnosRegistrados.get(i).setNif(alumno.getNif());
                alumnosRegistrados.get(i).setNotaMedia(alumno.getNotaMedia());
                alumnosRegistrados.get(i).setOfertaPracticas_idOfertaPracticas(alumno.getOfertaPracticas_idOfertaPracticas());
                alumnosRegistrados.get(i).setPersona_usuario(alumno.getPersona_usuario());               
                alumnosRegistrados.get(i).setUsuario(alumno.getUsuario());      
            }	
        }
    }
    static Tutor crea_tutor(Tutor tutor) throws Exception {
        boolean existe= false;
        for (int i = 0; i < tutoresRegistrados.size(); i++) {
            if(tutoresRegistrados.get(i).getNif().equals(tutor.getNif())){
                existe=true; 
            }	
		}
            if(existe=false){
                tutoresRegistrados.add(tutor);
                return tutor;
            }else{
                out.println("Usuario con dni ya existente");
                return null;
            }	
	}
        

    static Empresa alta_empresa(Tutor tutor,Empresa empresa) throws Exception {
        boolean existe= false;
        for (int i = 0; i < empresasRegistradas.size(); i++) {
            if(empresasRegistradas.get(i).getCif().equals(tutor.getEmpresa_cif())){
                existe=true; 
            }	
		}
            if(existe=false){
                empresasRegistradas.add(empresa);
                return empresa;
            }else{
                out.println("Usuario con dni ya existente");
                return null;
            }
            
	}
    static void asigna_practicas(Responsable responsable, Alumno alumno) {
        for (int i = 0; i < alumnosRegistrados.size(); i++) {
            alumnosRegistrados.get(i).setOfertaPracticas_idOfertaPracticas(alumno.getOfertaPracticas_idOfertaPracticas());     
        
    }
    }

    static OfertaPracticas crea_oferta(OfertaPracticas ofertaPracticas) {
        ofertasRegistradas.add(ofertaPracticas);
        return ofertaPracticas;
    }


}

