package service;

import org.springframework.stereotype.Service;

import model.Empleado;

@Service  //carga en el controlador de beans
public class EmpleadoService {
	
	public Empleado agregarEmpleado(String nombre, String id) {
		System.out.println("Ingreso a agregar empleado");
		Empleado emp = new Empleado();
		emp.setNombre(nombre);
		emp.setId(id);
		
		
		
		return emp;
		}
	
	public String eliminarEmpleado(String id) {
		
	return "empleado eliminado ".concat(id);}//Para concatenar string .concat es optimo comparado con el + (tira error por null)
}
