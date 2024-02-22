package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.Empleado;
import service.EmpleadoService;

@RestController //donde exponemos endpoint, se usa RestController. también existe 
//@Controller para webApp (cuando la vista está dentro de la palicación java)en cambio RestController

//ya nos da los codigos http, 200, 401, etc. Pero también se puede customizar
public class EmpleadoController {
	
	@Autowired //Inyeccion de dependencia-> es lo que me permite instanciar lo que en la clase se puso como @Service (clase EmpleadoService)
	private EmpleadoService empleadoService;
//Endppoint de prueba-> el barra url
	//antes de ejecutar la agregacion, se ejecuta la operacion transversal que sería el aspecto. 
	//Por lo cual el siguiente método queda encapsulado. Este metodo sería el advise del grafico
	@RequestMapping(value = "/agregar/empleado", method = RequestMethod.GET)
	public Empleado agregarEmpleado(@RequestParam("nombre") String nombre, @RequestParam("id") String id) {
		return empleadoService.agregarEmpleado(nombre, id);}

}
