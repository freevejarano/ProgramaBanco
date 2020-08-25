import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {

        Cliente cli= new Cliente(1000547,"Pedro Perez");
        Cuenta cuenta= new Cuenta(cli,4785,"CuentaAhorros","Activa",15000);
        Tarjeta credito= new Tarjeta(cli,7841,"TarjetaCredito","Activa",45000,80000);
        Prestamo prestamo= new Prestamo(cli,2123,"CuotaFija","Activa",35000);

    }


}
