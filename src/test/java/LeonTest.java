import model.Animal;
import model.Leon;
import model.TipoHabitat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LeonTest extends AnimalTest {

    @Override
    @Test
    void testEmitirSonido() {
        Animal leon = new Leon();
        assertEquals("Rugido", leon.emitirSonido());
    }

    @Override
    @Test
    void testObtenerDieta() {
        Animal leon = new Leon();
        assertEquals("Carnívoro", leon.obtenerDieta());
    }

    @Test
    void testLeonHabitat() {
        Animal leon = new Leon();
        assertEquals(TipoHabitat.TERRESTRE, leon.getHabitat());
    }
}
