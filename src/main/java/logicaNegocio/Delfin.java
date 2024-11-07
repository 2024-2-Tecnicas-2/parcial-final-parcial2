
package model;

public class Delfin extends Animal {

   
    public Delfin() {}

  
    public Delfin(String nombre) {
        super(nombre, TipoHabitat.ACUATICO);
    }

    @Override
    public String emitirSonido() {
        return "Chirrido";
    }

    @Override
    public String obtenerDieta() {
        return "Pescado";
    }
}
