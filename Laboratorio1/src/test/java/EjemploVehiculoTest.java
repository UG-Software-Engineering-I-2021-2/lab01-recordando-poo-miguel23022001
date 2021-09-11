import org.testng.Assert;
import org.testng.annotations.Test;

import automovil.Automovil;
import camion.Camion;

public class EjemploVehiculoTest {

    // recarga
    @Test
    public void test01(){
        Automovil toyota = new Automovil(10, 100, 0.9);
        Assert.assertEquals(toyota.recargar(99), "No  se  puede  reabastecer  el  tanque,  esta  lleno");
    }
    @Test
    public void test02(){
        Automovil toyota = new Automovil(10, 100, 0.9);
        Assert.assertEquals(toyota.recargar(3.6), "La cantidad de combustible del vehiculo es: 13.6");
    }
    @Test
    public void test03(){
        Camion toyota = new Camion(100, 100, 1.6);
        Assert.assertEquals(toyota.recargar(5), "No  se  puede  reabastecer  el  tanque,  esta  lleno");
    }
    @Test
    public void test04(){
        Camion toyota = new Camion(25, 100, 1.6);
        Assert.assertEquals(toyota.recargar(30), "La cantidad de combustible del vehiculo es: 53.5");
    }
    @Test
    public void test05(){
        Automovil toyota = new Automovil(100, 100, 0.9);
        Assert.assertEquals(toyota.recargar(12), "No  se  puede  reabastecer  el  tanque,  esta  lleno");
    }
    @Test
    public void test06(){
        Automovil toyota = new Automovil(10, 10, 0.5);
        Assert.assertEquals(toyota.recargar(12), "No  se  puede  reabastecer  el  tanque,  esta  lleno");
    }
    @Test
    public void test07(){
        Automovil toyota = new Automovil(25, 60, 0.7);
        Assert.assertEquals(toyota.recargar(12), "La cantidad de combustible del vehiculo es: 37.0");
    }

    //viaje
   @Test()
    public void test08() {

        Automovil toyota = new Automovil(10, 100, 0.9);
        Assert.assertEquals(toyota.viaje(12), "Vehiculo necesita reabastecimiento de combustible");
    }
    @Test
    public void test09(){
        Automovil toyota = new Automovil(10, 100, 0.9);
        Assert.assertEquals(toyota.viaje(4), "Vehiculo viajo 4.0 km y aun tiene 6,40 de combustible");
    }
    @Test
    public void test10(){
        Camion toyota = new Camion(10, 100, 1.6);
        Assert.assertEquals(toyota.viaje(4), "Vehiculo viajo 4.0 km y aun tiene 3,60 de combustible");
    }
    @Test
    public void test11(){
        Automovil toyota = new Automovil(10, 100, 0.9);
        Assert.assertEquals(toyota.viaje(12), "Vehiculo necesita reabastecimiento de combustible");
    }
    @Test
    public void test12(){
        Camion toyota = new Camion(10, 100, 1.6);
        Assert.assertEquals(toyota.viaje(30), "Vehiculo necesita reabastecimiento de combustible");
    }

    //setters y getters
    @Test
    public void test13(){
        Camion toyota = new Camion(10, 100, 1.6);
        toyota.setcapacidadTanque(13.4);
        Assert.assertEquals(toyota.getcapacidadTanque(),13.4);
    }
    @Test
    public void test14(){
        Camion toyota = new Camion(10, 100, 1.6);
        toyota.setConsumo(3.4);
        Assert.assertEquals(toyota.getConsumo(),3.4);
    }
    @Test
    public void test15(){
        Camion toyota = new Camion(10, 100, 1.6);
        toyota.setCombustible(13.4);
        Assert.assertEquals(toyota.getCombustible(),13.4);
    }
}