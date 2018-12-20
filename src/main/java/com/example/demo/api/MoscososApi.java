package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Moscoso;
import com.example.demo.entity.Personal;
import com.example.demo.service.MoscosoService;
import com.example.demo.service.PersonalService;

@RestController
public class MoscososApi {
	
	@Autowired
	MoscosoService moscosoService;
	
	@Autowired
	PersonalService personalService;
	
	@RequestMapping(value="/guardarmoscoso", method=RequestMethod.POST)
	public Moscoso updateOrSave(@RequestBody Moscoso moscoso){
	    return moscosoService.save(moscoso);
	}
	
	@RequestMapping(value="/listadomoscosos", method=RequestMethod.GET)
	public List<Moscoso> listadoMoscosos(){
        /*List<Moscoso> lista = new ArrayList<>();
        lista = moscosoService.listadoMoscosos();
        for(Moscoso moscoso : lista)
        {
            System.out.println(moscoso.getFechaMoscoso());
        }*/
        return moscosoService.listadoMoscosos();
    }
	
	@RequestMapping(value="/generarpersonas", method=RequestMethod.GET)
	public void generarMoscosos(){
		System.out.println("****** Generar Moscosos **");
		Personal persona1 = new Personal();
		Personal persona2 = new Personal();
		persona1.setNombre("oscar"); 
		persona1.setApellidos("lopez");
		persona1.setCargo("jefe");
		persona1.setExpediente("1234");
		persona1.setFechaAlta("10122018");
		personalService.save(persona1);	
		persona2.setNombre("juan"); 
		persona2.setApellidos("perez");
		persona2.setCargo("pringao");
		persona2.setExpediente("5678");
		persona2.setFechaAlta("01012018");
		personalService.save(persona2);
		persona1 =personalService.findId((long) 1);
		persona1 =personalService.findId((long) 2);
		Moscoso moscoso1 =new Moscoso();
		moscoso1.setAgno("2018");
		moscoso1.setFechaMoscoso("14122018");
		moscoso1.setPersona(persona1);
		moscosoService.save(moscoso1);
		Moscoso moscoso2 =new Moscoso();
		moscoso2.setAgno("2018");
		moscoso2.setFechaMoscoso("15122018");
		moscoso2.setPersona(persona1);
		moscosoService.save(moscoso2);
    }	
}
