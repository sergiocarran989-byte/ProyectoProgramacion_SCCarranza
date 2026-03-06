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

