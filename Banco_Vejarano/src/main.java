import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Bienvenido al Banco");

        int resp = JOptionPane.showConfirmDialog(null, "¿Ya está registrado?", "Registro", JOptionPane.YES_NO_OPTION);

        Cliente cli;
        if(resp==0){
            cli= new Cliente();
        }else{
            int dni = Integer.parseInt(JOptionPane.showInputDialog("Digite su cédula"));
            String nombre = JOptionPane.showInputDialog("Digite su nombre");
            cli= new Cliente(dni,nombre);
        }

        String[] options = {"Consignar en cuenta", "Retirar Dinero", "Consultar Saldo", "Transferir",
                "Comprar con Tarjeta", "Consultar Cupo T.Crédito", "Consultar Gasto T.Crédito", "Pagar T.Crédito"};

        int seleccion = JOptionPane.showOptionDialog(null, "Es necesario que seleccione una opcion", "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,   null, options, options[0]);

    }


}
