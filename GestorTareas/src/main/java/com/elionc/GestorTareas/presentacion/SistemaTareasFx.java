package com.elionc.GestorTareas.presentacion;

import com.elionc.GestorTareas.GestorTareasApplication;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

public class SistemaTareasFx extends Application {

    private ConfigurableApplicationContext applicationContext;

//    public static void main(String[] args) {
//
//        launch(args);
//    }
    @Override
    public void init(){
        this.applicationContext = new SpringApplicationBuilder(GestorTareasApplication.class).run();

    }
    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(GestorTareasApplication.class.getResource("/templates/index.fxml"));
        loader.setControllerFactory(applicationContext::getBean);
        Scene escena = new Scene(loader.load());
        stage.setScene(escena);
        stage.show();
    }

    public void stop(){
        applicationContext.close();
        Platform.exit();
    }
}
