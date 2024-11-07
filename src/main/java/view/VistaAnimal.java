
package view;

import model.Animal;
import model.Perro;

public class VistaAnimal {
    public void mostrarDatosAnimal(Animal animal) {
        System.out.println("Animal: " + animal.getClass().getSimpleName());
        System.out.println("Nombre: " + animal.getNombre());
        System.out.println("Sonido: " + animal.emitirSonido());
        System.out.println("Dieta: " + animal.obtenerDieta());
        System.out.println("Habitat: " + animal.getHabitat());
        System.out.println();
    }

    public void mostrarInteraccionConHumano(Perro perro) {
        System.out.println("Interaccion con humano: " + perro.interactuarConHumano());
    }
}
