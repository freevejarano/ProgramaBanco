import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Bienvenido al Banco");

        int resp = JOptionPane.showConfirmDialog(null, "¿Ya está registrado?", "Registro", JOptionPane.YES_NO_OPTION);

        Cliente cli= new Cliente(1000547,"Pedro Perez");
        Cuenta cuenta= new Cuenta(cli,4785,"CuentaAhorros","Activa",15000);
        Tarjeta credito= new Tarjeta(cli,7841,"TarjetaCredito","Activa",45000,80000);
        Prestamo prestamo= new Prestamo(cli,2123,"CuotaFija","Activa",35000)

                
    }


}
