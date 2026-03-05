package dani;


import java.util.ArrayList;
import java.util.List;

/**
 * Representa una empresa con fuentes de emisión y medidas correctoras.
 */
public class Empresa {

    private String nombre;
    private List<FuenteEmision> fuentes = new ArrayList<>();
    private List<MedidaCorrectora> medidas = new ArrayList<>();

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public void agregarFuente(FuenteEmision fuente) {
        fuentes.add(fuente);
    }

    public void agregarMedida(MedidaCorrectora medida) {
        medidas.add(medida);
    }

    public double calcularEmisionesTotales() {
        return fuentes.stream().mapToDouble(FuenteEmision::calcularEmisiones).sum();
    }

    public double calcularCosteTotal() {
        return fuentes.stream().mapToDouble(FuenteEmision::calcularCoste).sum();
    }

    public void simular() {
        double emisionesIniciales = calcularEmisionesTotales();
        double costeInicial = calcularCosteTotal();

        double reduccionEmisiones = medidas.stream()
                .mapToDouble(m -> m.reducirEmisiones(fuentes)).sum();

        double reduccionCoste = medidas.stream()
                .mapToDouble(m -> m.reducirCoste(fuentes)).sum();

        System.out.println("Empresa: " + nombre);
        System.out.println("Emisiones iniciales: " + emisionesIniciales);
        System.out.println("Coste inicial: " + costeInicial);
        System.out.println("Reducción emisiones: " + reduccionEmisiones);
        System.out.println("Ahorro económico: " + reduccionCoste);
    }
}