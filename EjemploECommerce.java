package ejemplo_notificaciones;

class Cliente {
    private String nombre;
    private String direccion;

    public Cliente(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }
}
class Pedido {
    private Cliente cliente;
    private int npedido;
    private String articulos;

    public Pedido(Cliente cliente, int npedido, String articulos){
        this.npedido = npedido;
        this.articulos = articulos;
    }
}
class Pago {
    private Pedido pedido;
    private String metodo_pago;
    private int cantidad;

    public Pago(Pedido pedido, String metodo_pago, int cantidad){
        this.pedido = pedido;
        this.metodo_pago = metodo_pago;
        this.cantidad = cantidad;
    }
}
class Notificacion{
    private Pedido pedido;
    private String correo;

    public Notificacion(Pedido pedido, String correo){
        this.pedido = pedido;
        this.correo = correo;
    }
}