package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Personal;
import com.example.demo.service.PersonalService;

@RestController
public class PersonalApi {
	
	@Autowired
	PersonalService personalService;
	
	@RequestMapping(value="/persona", method=RequestMethod.GET)
	public Personal getById(@RequestParam Long id){
        return personalService.findId(id);
    }
	
	@RequestMapping(value="/guardarpersona", method=RequestMethod.POST)
	public Personal updateOrSave(@RequestBody Personal persona){
	    return personalService.save(persona);
	}
	
	@RequestMapping(value="/listadopersonal", method=RequestMethod.GET)
	public List<Personal> listadoContactos(){
        return personalService.listadoPersonal();
    }
	
	@RequestMapping(value="/personaexpediente", method=RequestMethod.GET)
	public Personal getByExpediente(@RequestParam String expediente) {
		System.out.print("expediente: " + expediente);
        return personalService.findByExpediente(expediente);
    }
	
	
}
