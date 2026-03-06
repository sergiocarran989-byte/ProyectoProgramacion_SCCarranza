package proyecto;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una empresa con fuentes de emisión y medidas correctoras.
 */
public class Empresa {

    private String nombre;
    private List<FuenteEmision> fuentes = new ArrayList<>();
    private List<MedidaCorrectora> medidas = new ArrayList<>();

    /**
     * Constructor Empresa
     * @param nombre El nombre de la empresa
     */
    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para añadir una fuente de emision a la lista
     * @param fuente La fuente de emision a registrar
     */
    public void agregarFuente(FuenteEmision fuente) {
        fuentes.add(fuente);
    }

    /**
     * Metodo para añadir una medida correctora a la lista
     * @param medida La medida de ahorro a registrar
     */
    public void agregarMedida(MedidaCorrectora medida) {
        medidas.add(medida);
    }

    /**
     * Metodo que calcula las emisiones totales sumando todas las fuentes
     * @return El total de emisiones acumuladas
     */
    public double calcularEmisionesTotales() {
        double totalEmisiones = 0;
        
        // Recorrer la lista de fuentes y sumar sus emisiones calculadas
        for (FuenteEmision f : fuentes) {
            totalEmisiones += f.calcularEmisiones();
        }
        return totalEmisiones;
    }

    /**
     * Metodo que calcula el coste total sumando todas las fuentes
     * @return El sumatorio de los costes de emision
     */
    public double calcularCosteTotal() {
        double totalCoste = 0;
        
        // Iterar sobre las fuentes para obtener el coste total
        for (FuenteEmision f : fuentes) {
            totalCoste += f.calcularCoste();
        }
        return totalCoste;
    }

    /**
     * Metodo para simular el impacto de las medidas correctoras en la empresa
     */
    public void simular() {
        double emisionesIniciales = calcularEmisionesTotales();
        double costeInicial = calcularCosteTotal();

        double reduccionEmisiones = 0;
        // Calcular la reduccion de emisiones aplicando cada medida correctora
        for (MedidaCorrectora m : medidas) {
            reduccionEmisiones += m.reducirEmisiones(fuentes);
        }

        double reduccionCoste = 0;
        // Calcular el ahorro economico aplicando cada medida correctora
        for (MedidaCorrectora m : medidas) {
            reduccionCoste += m.reducirCoste(fuentes);
        }

        // Mostrar resultados por consola
        System.out.println("Empresa: " + nombre);
        System.out.println("Emisiones iniciales: " + emisionesIniciales);
        System.out.println("Coste inicial: " + costeInicial);
        System.out.println("Reducción emisiones: " + reduccionEmisiones);
        System.out.println("Ahorro económico: " + reduccionCoste);
    }
}