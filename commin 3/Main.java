package dani;

/**
 * Clase principal para ejecutar la simulación.
 */
public class Main {

    public static void main(String[] args) {

        Empresa empresa = new Empresa("Empresa Sostenible SL");

        empresa.agregarFuente(new Electricidad(10000, 0.0003, 0.15));
        empresa.agregarFuente(new Transporte(5000, 0.0026, 1.8));
        empresa.agregarFuente(new Climatizacion(2000, 0.0015, 0.10));

        empresa.agregarMedida(new Autoconsumo(0.30));
        empresa.agregarMedida(new MovilidadElectrica(0.40));
        empresa.agregarMedida(new ClimatizacionBombaCalor(0.35));

        empresa.simular();
    }
}