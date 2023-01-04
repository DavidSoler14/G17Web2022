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
import Repositories.AlumnoRepository;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author dsole
 */

@RestController
public class WebSpringApplicationREST { 
    private final AlumnoRepository alumnoRepository;
    @Autowired
    public WebSpringApplicationREST(AlumnoRepository alumnoRepository){
        this.alumnoRepository=alumnoRepository;
    }
    private static final Logger logger = LoggerFactory.getLogger(WebSpringApplicationREST.class);
    @Autowired
    UserService userService;
    @GetMapping("/alumnos")
    public List<Alumno> mostrarAlumnos(){
        //logger.debug("Obteniendo datos de todos los alumnos");
        return alumnoRepository.findAll();
         
    }
  
    @PutMapping("/{DatosAlumno}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void actualiza_alumno(@PathVariable String nif,@RequestBody Alumno alumno){
        logger.debug("Actualizando datos del alumno con id{} y datos{}",nif, alumno);
        UserService.actualiza_alumno(alumno);
    }
    @PutMapping("/{DatosEmpresa}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void actualiza_oferta(@PathVariable String Tutor_Empresa_cif,@RequestBody OfertaPracticas ofertaPracticas){
        logger.debug("Actualizando datos de ofreta de la Empresa con cif{} y datos{}",Tutor_Empresa_cif, ofertaPracticas);
        UserService.actualiza_oferta(ofertaPracticas);
    }
    @PutMapping("/{Prácticas}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void asigna_practicas(@PathVariable String nif,@RequestBody Responsable responsable, Alumno alumno){
        logger.debug("Asignando las Practicas por parte del responsable con nif{}",nif);
        UserService.asigna_practicas(responsable, alumno);
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String crea_tutor(@RequestBody Tutor tutor) throws Exception{
    logger.debug("Creando tutor con datos{}", tutor);
        try{
            tutor = UserService.crea_tutor(tutor);
        }catch(IllegalArgumentException e){
            logger.warn(e.toString(),e);
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Error en la introducción de los datos");
        }catch(DuplicateKeyException e){
            logger.error(e.toString(), e);
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Usuario ya existente");
        }return tutor.getNif();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String crea_oferta(@RequestBody OfertaPracticas ofertaPracticas){
    logger.debug("Creando oferta con datos{}", ofertaPracticas);
        try{
            ofertaPracticas = UserService.crea_oferta(ofertaPracticas);
        }catch(IllegalArgumentException e){
            logger.warn(e.toString(),e);
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Error en la introducción de los datos");
        }catch(DuplicateKeyException e){
            logger.error(e.toString(), e);
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Oferta ya existente");
        }return ofertaPracticas.getTutor_Empresa_cif();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String alta_empresa(@RequestBody Tutor tutor, Empresa empresa) throws Exception{
    logger.debug("Dando de alta empresa con datos{}", empresa);
        try{
            empresa = UserService.alta_empresa(tutor, empresa);
        }catch(IllegalArgumentException e){
            logger.warn(e.toString(),e);
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Error en la introducción de los datos");
        }catch(DuplicateKeyException e){
            logger.error(e.toString(), e);
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Empresa ya existente");
        }return empresa.getCif();
    }
}
  