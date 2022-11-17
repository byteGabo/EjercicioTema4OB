public class Main {
    public static void main(String[] args) {
        //EJERCICIO DE CONDICION IF
        System.out.println("------------------------------------------------------");
        System.out.println("EJERCICIO IF");
        int numeroIf = -5;

        if(numeroIf > 0){
            System.out.println("El numero " + numeroIf + " es positivo");
        }else if(numeroIf < 0){
            System.out.println("El numero " + numeroIf + " es Negativo");
        }else {
            System.out.println("El numero " + numeroIf + " es Cero");
        }

        //EJERCICIO DE BUCLE WHILE
        System.out.println("------------------------------------------------------");
        System.out.println("EJERCICIO WHILE");
        int numeroWhile = 1;

        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        //EJERCICIO DEL BUCLE DO WHILE
        System.out.println("------------------------------------------------------");
        System.out.println("EJERCICIO DO WHILE");
        int numeroDoWhile = 2;
        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        }while (numeroDoWhile < 3);

        System.out.println("------------------------------------------------------");
        System.out.println("EJERCICIO FOR");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        System.out.println("------------------------------------------------------");
        System.out.println("EJERCICIO SWITCH");

        var estacion = "VERANO";
        switch (estacion){
            case "VERANO":
                System.out.println("Estamos en verano");
                break;
            case  "INVERNO":
                System.out.println("Estamos en invierno");
                break;
            case "OTOÑO":
                System.out.println("Estamos en otoño");
                break;
            case "PRIMAVERA":
                System.out.println("Estamos en primavera");
                break;
            default:
                System.out.println("Error, no se encontro ninguna estacion");
        }

        System.out.println("------------------------------------------------------");
    }
}