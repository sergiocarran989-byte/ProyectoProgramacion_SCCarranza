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
