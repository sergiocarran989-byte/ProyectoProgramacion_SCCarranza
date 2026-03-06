package dani;

/**
 * Representa el consumo de combustible en transporte
 */
public class Transporte extends FuenteEmision {
	
	//metodo privado de la clase, litro de combustible
    private double litrosCombustible;
    
    //constructor de transporte 
    public Transporte(double litrosCombustible, double factorEmision, double costeUnitario) {
        super("Transporte", factorEmision, costeUnitario);
        this.litrosCombustible = litrosCombustible;
    }

    //metodo para calcular emisiones con cobustible
    @Override
    public double calcularEmisiones() {
        return litrosCombustible * factorEmision;
    }

  //metodo para calcular coste de combustible
    @Override
    public double calcularCoste() {
        return litrosCombustible * costeUnitario;
    }
}