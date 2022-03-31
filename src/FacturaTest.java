import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacturaTest {
    Factura f;
    @BeforeEach
    void setUp() {
        f = new Factura();
        f.meterProducto(new Producto("huevos", 2f, 3));
        f.meterProducto(new Producto("pipas", 1f, 2));
        f.meterProducto(new Producto("jamon york", 3f, 5));
    }

    @Test
    void testTotalFactura(){
        assertEquals(f.totalFactura(), 23f);
    }

    @Test
    void testAplicarIva(){
        assertEquals(f.aplicarIva(0.21f), 27.83f);
    }
}
