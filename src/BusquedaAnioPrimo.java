/**
 * Clase encargada de encontrar el primer año primo entre 2008 y 2033
 */
public class BusquedaAnioPrimo {

    /**
     * Método main de la clase de búsqueda de año primo donde se ejecuta el método de lógica detrás.
     * @param args
     */
    public static void main(String[] args) {
        int primerAnio = 0;
        int comienzoBusqueda = 2008;

        busquedaAnioPrimo(primerAnio, comienzoBusqueda);
    }

    /**
     * Método que contiene la lógica detrás de la búsqueda del primer año primo, ejecutada en el main.
     * @param primerAnio
     * @param comienzoBusqueda
     */
    public static void busquedaAnioPrimo(int primerAnio, int comienzoBusqueda) {
        while (comienzoBusqueda <= 2033) {
            if (primerAnio == 0) {
                boolean esPrimo = true;
                for (int i = comienzoBusqueda - 1; i > 1; i--) {
                    if (comienzoBusqueda % i == 0) {
                        esPrimo = false;
                    }
                }
                if (esPrimo) {
                    primerAnio = comienzoBusqueda;
                }
            }
            comienzoBusqueda++;
            continue;
        }
        System.out.println("El primer año primo encontrado es " + primerAnio);
        if (primerAnio % 2 != 0) {
        } else System.out.println("que es un año par");
        if (primerAnio > 2008) {
            if (primerAnio < 2033) {
                System.out.println("y está comprendido entre 2008 y 2033");
            }
        }
    }
}