package Execirse;

//F = (G(m1m2)/r^2)*r^
//G = 6.67428 * Math.pow(10, (-11)
//m1 = masa 1
//m2 = masa 2
//r^2 = distancia entre dos objetos al cuadraro
//r^= vector unitario que apunta del objeto 1 al objeto 2



public interface IGravitationalAttraction {
    double constantG = 1;

    default double attraction(double g) {
        return 0;
    }
}
