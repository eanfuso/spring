package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmpleadoServiceAspect {
	///spring-boot-aop/src/main/java/service/EmpleadoService.java
	//aspect
	@Before(value = "execution(* service.EmpleadoService.*(..)) && args(nombre, id)")//La referencia que va a escanear puede ser por paquetes o por clases, o por métodos
	//se agrega execution()con el asteriso, todo lo que esta en-> en este caso, la clase
	//y el asterisco, para todos los metodos de la clase
	//y además se agrega un filtro con && solo los metodos que tengan los argumentos definidos
	public void antesDeAgregarEmpleado(JoinPoint joinPoint, String nombre, String id ) {//JoinPoint ver grafico
		System.out.println("Método before: " + joinPoint.getSignature());
		System.out.println("Creando empleado: ".concat(id));
	}
	
	
	
	@After(value = "execution(* service.EmpleadoService.*(..)) && args(nombre, id)")//La referencia que va a escanear puede ser por paquetes o por clases, o por métodos
	//se agrega execution()con el asteriso, todo lo que esta en-> en este caso, la clase
	//y el asterisco, para todos los metodos de la clase
	//y además se agrega un filtro con && solo los metodos que tengan los argumentos definidos
	public void despuesDeAgregarEmpleado(JoinPoint joinPoint, String nombre, String id ) {//JoinPoint ver grafico
		System.out.println("Método before: " + joinPoint.getSignature());
		System.out.println("Empleado creado correctamente: " .concat(nombre));
	} 
///spring-boot-aop-2/src/main/java/service/EmpleadoService.java	
	
	
}
