package vehiculo;
public abstract class Vehiculo {
    protected double combustible; // Cantidad de combustible
    protected double consumo;
    protected double capacidadTanque;

    protected Vehiculo(double combustible, double capacidadTanque, double consumo) {
        this.combustible = combustible;
        this.capacidadTanque = capacidadTanque;
        this.consumo = consumo;
    }

    public void setCombustible(double combustible){
        this.combustible = combustible;
    }

    public void setConsumo(double consumo){
        this.consumo = consumo;
    }

    public void setcapacidadTanque(double capacidadTanque){
        this.capacidadTanque = capacidadTanque;
    }

    public double getCombustible(){ //cantidad de combustible
        return this.combustible;
    }

    public double getConsumo(){
        return this.consumo;
    }

    public double getcapacidadTanque(){
        return this.capacidadTanque;
    }

    public String viaje(double km) {
        double combustibleConsumido = km * consumo;
        if(this.combustible - combustibleConsumido < 0) {
            // Impresion
            return "Vehiculo necesita reabastecimiento de combustible";
        } else {
            this.combustible -= combustibleConsumido;
            // Impresion
            return "Vehiculo viajo " + km + " km y aun tiene " + String.format("%.2f",this.combustible) + " de combustible";
        }
    }
    public abstract String recargar(double litros);
}