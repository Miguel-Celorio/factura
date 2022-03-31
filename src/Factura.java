import java.util.Vector;

public class Factura {
    private Vector<Producto> productos;

    public void meterProducto(Producto p){
        productos.add(p);
    }

    public float totalFactura(){
        float total = 0;

        for (Producto p : productos) {
            total += p.precioTotal();
        }

        return total;
    }

    public float aplicarIva(float iva){
        return  totalFactura() + totalFactura() * 0.21f;
    }
}
