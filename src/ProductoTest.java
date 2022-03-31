import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductoTest {


    @Test
    void testNuevo(){
        Producto p = new Producto("pan", 0.50f, 1);
        assertTrue(p.getNombre().equals("pan") && p.getPrecio() == 0.50f && p.getCantidad() == 1);
    }

    @Test
    void testPrecioTotal(){
        Producto p = new Producto("miel", 1.20f, 5);
        assertEquals(p.precioTotal(), 6f);
    }

}
