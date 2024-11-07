import model.Animal;
import model.Delfin;
import model.TipoHabitat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DelfinTest extends AnimalTest {

    @Override
    @Test
    void testEmitirSonido() {
        Animal delfin = new Delfin();
        assertEquals("Chirrido", delfin.emitirSonido());
    }

    @Override
    @Test
    void testObtenerDieta() {
        Animal delfin = new Delfin();
        assertEquals("Pescado", delfin.obtenerDieta());
    }

    @Test
    void testDelfinHabitat() {
        Animal delfin = new Delfin();
        assertEquals(TipoHabitat.ACUATICO, delfin.getHabitat());
    }
}
