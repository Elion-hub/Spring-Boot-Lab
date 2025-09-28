package com.elionc.estudiantes;

import com.elionc.estudiantes.models.Estudiante;
import com.elionc.estudiantes.service.EstudianteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class EstudiantesApplication implements CommandLineRunner {

	@Autowired
	private EstudianteService estudianteService;

	private static final Logger logger = LoggerFactory.getLogger(EstudiantesApplication.class);

	String nl = System.lineSeparator();

	public static void main(String[] args) {
		logger.info("Iniciando la aplicacion...");
		SpringApplication.run(EstudiantesApplication.class, args);
		logger.info("Aplicacion finalizada");
	}

	@Override
	public void run(String... args) throws Exception {
	logger.info(nl +"Ejecutando metodo run de spring" + nl);
	var salir = false;
	var consola = new Scanner(System.in);
	while (!salir){
		mostrarMenu();
		salir = ejecutarOpciones(consola);
		logger.info("");
	}
	}

	private void mostrarMenu(){
		logger.info(nl);
		logger.info("""
				*** Sistema de Estudiantes ***
				1. Lista de Estudiantes
				2. Buscar Estudiante
				3. Agregar Estudiante
				4. Modificar Estudiante
				5. Eliminar Estudiante
				6. Salir
				Elige una opcion:""");
	}

	private boolean ejecutarOpciones(Scanner consola){
		var opcion = Integer.parseInt(consola.nextLine());
		var salir= false;
		switch (opcion){
			case 1 ->{
				logger.info(nl+ "Listado de Estudiantes: " + nl);
				List<Estudiante> estudiantes = estudianteService.listarEstudiantes();
				estudiantes.forEach((estudiante -> logger.info(estudiante.toString() + nl)));
			}
			case 2 ->{
				logger.info("INtroduce el id estudiante a buscar: ");
				var idEstudiante = Integer.parseInt(consola.nextLine());
				Estudiante estudiante = estudianteService.buscarEstudiantePorId(idEstudiante);
				if (estudiante != null) logger.info("Estudiante encontrado: " + estudiante + null);
				else logger.info("Estudiante NO encontrado con id: " + idEstudiante + nl);
			}
			case 3->{
				logger.info("Agregar Estudiante: " + nl);
				logger.info("Nombre: ");
				var nombre = consola.nextLine();
				logger.info("Apellido: ");
				var apellido = consola.nextLine();
				logger.info("Telefono: ");
				var telefono = consola.nextLine();
				logger.info("Email: ");
				var email = consola.nextLine();

				var estudiante = new Estudiante();
				estudiante.setNombre(nombre);
				estudiante.setApellido(apellido);
				estudiante.setTelefono(telefono);
				estudiante.setEmail(email);
				estudianteService.guardarEstudiante(estudiante);
				logger.info("Estudiante agregado: " + estudiante + nl);

			}
			case 4->{
				logger.info("Modificar estudiante: " + nl);
				logger.info("Id Estudiante: ");
				var idEstudiante = Integer.parseInt(consola.nextLine());
				Estudiante estudiante=estudianteService.buscarEstudiantePorId(idEstudiante);
				if (estudiante != null){
					logger.info("Nombre: ");
					var nombre = consola.nextLine();
					logger.info("Apellido: ");
					var apellido = consola.nextLine();
					logger.info("Telefono: ");
					var telefono = consola.nextLine();
					logger.info("Email: ");
					var email = consola.nextLine();

					estudiante.setNombre(nombre);
					estudiante.setApellido(apellido);
					estudiante.setTelefono(telefono);
					estudiante.setEmail(email);
					estudianteService.guardarEstudiante(estudiante);
					logger.info("Estudiante modificado: " + estudiante + nl);

				}else logger.info("Estudiante NO encontrado con id: " + estudiante + nl);
			}

			case 5 ->{
				logger.info("Eliminar estudiante: " + nl);
				logger.info("Id Estudiante: ");
				var idEstudiante = Integer.parseInt(consola.nextLine());
				var estudiante = estudianteService.buscarEstudiantePorId(idEstudiante);
				if (estudiante != null){
					estudianteService.eliminarEstudiante(estudiante);
					logger.info("Estudiante eliminado: " + estudiante + nl);

				}else  logger.info("Estudiante NO encontrado con id: " + idEstudiante);
			}
			case 6->{
				logger.info("Hasta pronto!" + nl + nl);
				salir = true;
			}
			default -> logger.info("Opcion NO reconocida: " + opcion + nl);
		}
		return salir;
	}
}
