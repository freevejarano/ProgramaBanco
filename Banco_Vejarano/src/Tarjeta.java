public class Tarjeta extends Producto {
    double cupo, gasto, deuda;
    public Tarjeta(Cliente cli, int numero, String tipo, String estado, int saldo, int cupo) {
        super(cli, numero, tipo, estado, saldo);
        this.cupo=cupo;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public double getGasto() {
        return gasto;
    }

    public void setGasto(double gasto) {
        this.gasto = gasto;
    }

    public double getCupo() {
        return cupo;
    }

    public void setCupo(double cupo) {
        this.cupo = cupo;
    }
}