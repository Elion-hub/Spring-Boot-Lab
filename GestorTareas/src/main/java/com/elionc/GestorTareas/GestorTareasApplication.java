package com.elionc.GestorTareas;

import com.elionc.GestorTareas.presentacion.SistemaTareasFx;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestorTareasApplication {

	public static void main(String[] args) {

		//SpringApplication.run(GestorTareasApplication.class, args);
		Application.launch(SistemaTareasFx.class,args);
	}

}
