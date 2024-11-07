import model.TipoHabitat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TipoHabitatTest {

    @Test
    void testEnumValues() {
        assertEquals(TipoHabitat.ACUATICO, TipoHabitat.valueOf("ACUATICO"));
        assertEquals(TipoHabitat.TERRESTRE, TipoHabitat.valueOf("TERRESTRE"));
        assertEquals(TipoHabitat.AEREO, TipoHabitat.valueOf("AEREO"));
    }

    @Test
    void testEnumSize() {
        assertEquals(3, TipoHabitat.values().length);
    }
}
