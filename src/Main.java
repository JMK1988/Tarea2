public class Main {
    public static void main(String[] args) {
        //1
        System.out.println("ejercicio 1");
        double numeroIf = -7;
        if (numeroIf>0){
            System.out.println("El numero es POSITIVO");
        } else if (numeroIf<0) {
            System.out.println("El numero es NEGATIVO");
        }else{
            System.out.println("El numero es CERO");
        }
        //2
        System.out.println("ejercicio 2");
        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        //3
        System.out.println("ejercicio 3");
        int numeroWhile2 = 0;
        do {
            System.out.println(numeroWhile2);
        }while (numeroWhile2 != 0);
        //4
        System.out.println("ejercicio 4");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }
        //5
        System.out.println("ejercicio 5");
        String estacion = "naranja";
        switch (estacion){
            case "verano" :
                System.out.println("Estamos en VERANO");
            break;
            case "invierno" :
                System.out.println("Estamos en INVIERNO");
            break;
            case "primavera" :
                System.out.println("Estamos en PRIMAVERA");
            break;
            case "otoño" :
                System.out.println("Estamos en OTOÑO");
            break;
            default :
                System.out.println("No es una estacion");
            break;

        }
    }
}