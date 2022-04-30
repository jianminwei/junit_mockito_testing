package justJunit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CupTest {

    @Test
    void getLiquidType() {
        Cup c = new Cup("Orange Juice", 85.5);
        assertEquals("Orange Juice", c.getLiquidType());
    }
}