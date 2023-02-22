public class Main {
    public static void main(String[] args)
    {
    // Llamamos a la función suma desde el main, asignamos valores 5,10,15
        suma(5, 10, 15);

    // Creamos el objeto miCoche
        Coche miCoche = new Coche();
    // Llamamos a la funcion 4 veces, para que devuelva que el coche tiene 4 puertas
            miCoche.SumarPuertas();
            miCoche.SumarPuertas();
            miCoche.SumarPuertas();
            miCoche.SumarPuertas();
    // Devolvemos la solución en la consola
        System.out.println(miCoche.puertas);
    }

    public static void suma(int a, int b, int c)
    {
        // Declaramos la variable resultado que almacena datos enteros
        int resultado;
        // Definimos que resultado va a sumar los valores a,b,c entre si
        resultado = a + b + c;
        // Devolvemos la solución en la consola
        System.out.println(resultado);
    }
}

// Creamos la clase Coche
class Coche {
    // Declaramos la variable puertas, que almacena datos enteros
    public int puertas = 0;
    // Creamos la funcion SumarPuertas
    public void SumarPuertas()
    {
    // La función incrementa el número de puertas
        this.puertas++;
    }
}