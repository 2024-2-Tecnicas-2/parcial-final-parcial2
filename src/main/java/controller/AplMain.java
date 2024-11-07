
package controller;

import model.*;
import view.VistaAnimal;

public class AplMain {
    public static void main(String[] args) {
        VistaAnimal vista = new VistaAnimal();
        Controlador controlador = new Controlador(vista);

        
        controlador.agregarAnimal(new Leon("Simba"));
        controlador.agregarAnimal(new Delfin("Flipper"));
        controlador.agregarAnimal(new Perro("Max"));

     
        controlador.mostrarInformacionAnimales();
    }
}
