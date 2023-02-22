public class Main {
    public static void main(String[] args) {
        int numeroIf = 1;
        if(numeroIf > 0){
            System.out.println("El número " + numeroIf + " es positivo.");
        }
        else if(numeroIf < 0){
            System.out.println("El número " + numeroIf + " es negativo.");
        }
        else if(numeroIf == 0){
            System.out.println("El número es 0.");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        int numeroDo = 0;
        do {
            numeroDo++;
            System.out.println(numeroDo);
            break;
        }while (numeroDo < 3);

        int numeroFor = 0;
        for (; numeroFor < 3 ;){
            numeroFor++;
            System.out.println(numeroFor);
        }

        var estacion = "VERANO";
        switch (estacion){
            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;

            case "VERANO":
                System.out.println("Es verano");
                break;

            case "OTOÑO":
                System.out.println("Es otoño");
                break;

            case "INVIERNO":
                System.out.println("Es invierno");
                break;

            default:
                System.out.println("Estamos en una estación");
                break;
        }
    }
}