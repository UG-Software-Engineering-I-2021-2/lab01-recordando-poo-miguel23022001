import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.logging.Logger;
import java.io.IOException;

public class EjemploVehiculoTest {
   @Test()
    public void test01() {

        Automovil toyota = new Automovil(10, 100, 0.9);
        Assert.assertEquals(toyota.viaje(12), "Vehiculo necesita reabastecimiento de combustible");
    }
    @Test
    public void test02(){
        Automovil toyota = new Automovil(10, 100, 0.9);
        Assert.assertEquals(toyota.viaje(4), "Vehiculo viajo 4.0 km y aun tiene 6,40 de combustible");
    }
}
