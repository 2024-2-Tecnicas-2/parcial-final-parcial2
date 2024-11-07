
package model;

public class Leon extends Animal {

   
    public Leon() {}

   
    public Leon(String nombre) {
        super(nombre, TipoHabitat.TERRESTRE);
    }

    @Override
    public String emitirSonido() {
        return "Rugido";
    }

    @Override
    public String obtenerDieta() {
        return "Carnivoro";
    }
}
