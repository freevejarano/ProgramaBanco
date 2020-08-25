public class Tarjeta extends Producto {
    int cupo;
    public Tarjeta(Cliente cli, int numero, String tipo, String estado, int saldo, int cupo) {
        super(cli, numero, tipo, estado, saldo);
        this.cupo=cupo;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }
}