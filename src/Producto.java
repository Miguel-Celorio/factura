public class Producto {
    private String nombre;
    private float precio;
    private int cantidad;

    public Producto(String nombre, float precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float precioTotal(){
        return precio * cantidad;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Nombre: ");
        sb.append(nombre);
        sb.append(", precio: ");
        sb.append(precio);
        sb.append(", cantidad: ");
        sb.append(cantidad);

        return sb.toString();
    }
}
