package br.com.example.retangulo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTest {

    @Test
    public void testCalcularArea() {
        Retangulo r = new Retangulo(5, 10);
        assertEquals(50, r.calcularArea(), "A área deve ser 50");
    }

    @Test
    public void testCalcularPerimetro() {
        Retangulo r = new Retangulo(5, 10);
        assertEquals(30, r.calcularPerimetro(), "O perímetro deve ser 30");
    }
}
