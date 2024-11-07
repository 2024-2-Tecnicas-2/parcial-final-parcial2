import model.Animal;
import model.Domestico;
import model.Perro;
import model.TipoHabitat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PerroTest extends AnimalTest {

    @Override
    @Test
    void testEmitirSonido() {
        Animal perro = new Perro();
        assertEquals("Ladrido", perro.emitirSonido());
    }

    @Override
    @Test
    void testObtenerDieta() {
        Animal perro = new Perro();
        assertEquals("Omnívoro", perro.obtenerDieta());
    }

    @Test
    void testPerroHabitat() {
        Animal perro = new Perro();
        assertEquals(TipoHabitat.TERRESTRE, perro.getHabitat());
    }

    @Test
    void testPerroInteractuarConHumano() {
        Domestico perro = new Perro();
        assertEquals("El perro mueve la cola y ladra de felicidad", perro.interactuarConHumano());
    }
}
