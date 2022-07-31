package com.portfolio.Curriculum.controller;

import com.portfolio.Curriculum.model.Persona;
import com.portfolio.Curriculum.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private IPersonaService persoServ;

    //@GetMapping ("/hola/{nombre}")
    //public String decirHola(@PathVariable String nombre){
    // return "hola "+ nombre;
    //}

    // @GetMapping ("/chau")
    //public String decirCHau(@RequestParam String nombre){
    //  return "hola "+ nombre;
    //}

    @PostMapping("/agregar")
    public void agregarPersona(@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }

    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }

    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
}
