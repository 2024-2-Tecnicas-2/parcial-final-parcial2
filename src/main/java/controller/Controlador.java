
package controller;

import model.*;
import view.VistaAnimal;
import java.util.ArrayList;
import java.util.List;

public class Controlador {
    private VistaAnimal vista;
    private List<Animal> animales;

    
    public Controlador(VistaAnimal vista) {
        this.vista = vista;
        this.animales = new ArrayList<>();
    }

  
    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }

   
    public void mostrarInformacionAnimales() {
        for (Animal animal : animales) {
            vista.mostrarDatosAnimal(animal);
            if (animal instanceof Perro) {
                vista.mostrarInteraccionConHumano((Perro) animal);
            }
        }
    }
}
