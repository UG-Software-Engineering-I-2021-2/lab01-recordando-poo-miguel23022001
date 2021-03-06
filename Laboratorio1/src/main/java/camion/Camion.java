package camion;
import vehiculo.Vehiculo;
public class Camion extends Vehiculo {
    public Camion(double combustible, double capacidadTanque, double consumo) {
        super(combustible, capacidadTanque, consumo);
    }
    @Override
    public String recargar(double litros) {
        double currentTankSpace = this.capacidadTanque - this.combustible;
        if(currentTankSpace - litros < 0) {
            return "No  se  puede  reabastecer  el  tanque,  esta  lleno";
        } else {
            this.combustible += (litros * 0.95);
            return "La cantidad de combustible del vehiculo es: " + this.combustible;
        }
    }
}