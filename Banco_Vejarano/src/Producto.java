public class Producto {

    int numero;
    String tipo, estado;
    double saldo;
    Cliente cli;

    public Producto(Cliente cli, int numero, String tipo, String estado, double saldo) {
        this.cli=cli;
        this.numero = numero;
        this.tipo = tipo;
        this.estado = estado;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
