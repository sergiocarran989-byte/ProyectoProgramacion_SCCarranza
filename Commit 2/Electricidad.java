package dani;

/**
 * Representa el consumo eléctrico de la empresa.
 */
public class Electricidad extends FuenteEmision {

	//metodo privado de la clase, consumo kilometro/hora
    private double consumoKWh;

    //constructor de electricadad 
    public Electricidad(double consumoKWh, double factorEmision, double costeUnitario) {
        super("Electricidad", factorEmision, costeUnitario);
        this.consumoKWh = consumoKWh;
    }

    //metodo para calcular emisiones por kilometro/hora
    @Override
    public double calcularEmisiones() {
        return consumoKWh * factorEmision;
    }

    //metodo para calcular coste kilometro/hora
    @Override
    public double calcularCoste() {
        return consumoKWh * costeUnitario;
    }
}