import org.junit.Test;
import static org.junit.Assert.*;

public class OperacionTest {
    Operacion op= new Operacion();
    Cliente cli= new Cliente(1000547,"Pedro Perez",3017872,"aclr31@gmail.com");
    Cuenta cuenta= new Cuenta(cli,4785,"CuentaAhorros","Activa",15000);
    Cuenta empresa= new Cuenta(new Cliente(100254,"Pagos",7913900,"pagos01@correo.com"),185,"CuentaCoriente","Activa",740000);
    Tarjeta credito= new Tarjeta(cli,7841,"TarjetaCredito","Activa",45000,80000);
    Prestamo prestamo= new Prestamo(cli,2123,"CuotaFija","Activa",35000);

    @Test
    public void consignarEnCuenta() {
        boolean ans= op.consignarEnCuenta(cuenta,25000);
        assertEquals(true,ans);
    }

    @Test
    public void retirarDinero() {
        boolean ans= op.retirarDinero(cuenta,10000);
        assertEquals(true,ans);
    }

    @Test
    public void transferirACuenta() {
        boolean ans= op.transferirACuenta(cuenta, empresa, 7412);
        assertEquals(true,ans);
    }

    @Test
    public void comprarConTarjeta() {
        boolean ans= op.comprarConTarjeta(credito, empresa, 2, 30000);
        assertEquals(true,ans);
    }

    @Test
    public void consultarCupoTCredito() {
        double ans= op.consultarCupoTCredito(credito);
        assertEquals(80000,ans,0);
    }

    @Test
    public void consultarGastoTCredito() {
        op.comprarConTarjeta(credito, empresa, 2, 30000);
        double ans= op.consultarGastoTCredito(credito);
        assertEquals(30000,ans,0);
    }

    @Test
    public void pagarTarjetaCredito() {
        boolean ans= op.pagarTarjetaCredito(credito, 32000);
        assertEquals(true,ans);
    }
}