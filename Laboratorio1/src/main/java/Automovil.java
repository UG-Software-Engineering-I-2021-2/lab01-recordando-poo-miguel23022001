class Automovil extends Vehiculo {
    public Automovil (double combustible, double capacidadTanque, double consumo) {
        super(combustible, capacidadTanque, consumo);
    } 
    @Override
        public String recargar(double litros) {
            double currentTankSpace = this.capacidadTanque - this.combustible;
            if(currentTankSpace - litros < 0) {
                return "No  se  puede  reabastecer  el  tanque,  esta  lleno";
            }
            else {
                this.combustible += litros;
                return "La cantidad de combustible del vehiculo es: " + this.combustible;
            }
        }
}