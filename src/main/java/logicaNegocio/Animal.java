
package model;

public abstract class Animal {
    protected String nombre;
    protected TipoHabitat habitat;

   
    public Animal() {}

  
    public Animal(String nombre, TipoHabitat habitat) {
        this.nombre = nombre;
        this.habitat = habitat;
    }

    public abstract String emitirSonido();
    public abstract String obtenerDieta();

    public TipoHabitat getHabitat() {
        return habitat;
    }

    public void setHabitat(TipoHabitat habitat) {
        this.habitat = habitat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
