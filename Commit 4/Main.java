package proyecto;

/**
 * Clase principal para ejecutar la simulación de sostenibilidad.
 */
public class Main {

    /**
     * Metodo principal que arranca la aplicacion
     * @param args Argumentos de la linea de comandos
     */
    public static void main(String[] args) {

        // Crear una nueva instancia de empresa
        Empresa empresa = new Empresa("Empresa Sostenible SL");

        // Añadir fuentes de emision: electricidad, transporte y climatizacion
        empresa.agregarFuente(new Electricidad(10000, 0.0003, 0.15));
        empresa.agregarFuente(new Transporte(5000, 0.0026, 1.8));
        empresa.agregarFuente(new Climatizacion(2000, 0.0015, 0.10));

        // Registrar las medidas correctoras para reducir el impacto ambiental
        empresa.agregarMedida(new Autoconsumo(0.30));
        empresa.agregarMedida(new MovilidadElectrica(0.40));
        empresa.agregarMedida(new ClimatizacionBombaCalor(0.35));

        // Ejecutar el metodo que realiza la simulacion y muestra resultados
        empresa.simular();
        
    }
}