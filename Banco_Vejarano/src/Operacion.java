public class Operacion {


    public boolean consignarEnCuenta(Cuenta p, int valor){
        if(p.getEstado()=="Activa"){
            p.setSaldo(p.getSaldo()+valor);
            return true;
        }else{
            return false;
        }
    }

    public boolean retirarDinero(Cuenta p, int valor){
        if(p.getEstado()=="Activa"){
            double actual=p.getSaldo();
            if(actual>=valor){
                p.setSaldo(p.getSaldo()-valor);
                return true;
            }else{return false;}
        }else {
            return false;
        }
    }

    public boolean transferirACuenta(Cuenta origen, Cuenta destino, int valor){
        if(origen.getEstado()=="Activa" || destino.getEstado()=="Activa"){
            double actualO=origen.getSaldo();
            double actualD= destino.getSaldo();
            if(actualO>=valor){
                origen.setSaldo(origen.getSaldo()-valor);
                destino.setSaldo(destino.getSaldo()-valor);
                return true;
            }else{return false;}
        }else {
            return false;
        }
    }

    public boolean comprarConTarjeta(Tarjeta ta, Cuenta empresa, int cuotas, double valor){
        if(ta.getEstado()=="Activa"&&ta.getTipo()=="TarjetaCredito"){
            double actual=ta.getSaldo();
            if(actual>=valor){
                ta.setSaldo(ta.getSaldo()-valor);
                ta.setGasto(ta.getGasto()+valor);
                ta.setDeuda(ta.getDeuda()+valor);
                empresa.setSaldo(empresa.getSaldo()-valor);
                return true;
            }else if(ta.getCupo()>=valor){
                ta.setCupo(ta.getCupo()-valor);
                empresa.setSaldo(empresa.getSaldo()-valor);
                return true;
            }
        }
        return false;
    }

    public double consultarCupoTCredito(Tarjeta ta){
        double cupo=0;
        if(ta.getEstado()=="Activa"&&ta.getTipo()=="TarjetaCredito"){
            cupo=ta.getCupo();
        }
        return cupo;
    }

    public double consultarGastoTCredito(Tarjeta ta){
        double gasto=0;
        if(ta.getEstado()=="Activa"&&ta.getTipo()=="TarjetaCredito"){
            gasto=ta.getGasto();
        }
        return gasto;
    }

    public boolean pagarTarjetaCredito(Tarjeta ta, double valor){
        if(ta.getEstado()=="Activa"&&ta.getTipo()=="TarjetaCredito") {
            if(ta.getDeuda()>0){
                if(ta.getDeuda()>=valor){
                    ta.setDeuda(ta.getDeuda()-valor);
                }else{
                    valor-=ta.getDeuda();
                    ta.setDeuda(0);
                    ta.setSaldo(ta.getSaldo()+valor);
                }
                return true;
            }else{
                ta.setSaldo(ta.getSaldo()+valor);
                return true;
            }
        }
            return false;
    }






}
