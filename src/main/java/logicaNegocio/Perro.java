
package model;

public class Perro extends Animal implements Domestico {


    public Perro() {}

   
    public Perro(String nombre) {
        super(nombre, TipoHabitat.TERRESTRE);
    }

    @Override
    public String emitirSonido() {
        return "Ladrido";
    }

    @Override
    public String obtenerDieta() {
        return "Omnivoro";
    }

    @Override
    public String interactuarConHumano() {
        return "El perro mueve la cola y ladra de felicidad";
    }
}
