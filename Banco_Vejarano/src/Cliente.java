import java.util.ArrayList;

public class Cliente {
    int dniCliente;
    String nombre;
    ArrayList<Producto> p= new ArrayList<Producto>();

    public Cliente(int dniCliente, String nombre) {
        this.dniCliente = dniCliente;
        this.nombre = nombre;
    }

    public Cliente(){
        this.dniCliente=10104519;
        this.nombre="Pedro Pedraza";
    }

    public void asociarProducto(Producto pro){
        p.add(pro);
    }


}
