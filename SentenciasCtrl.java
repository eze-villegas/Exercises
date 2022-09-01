package EjercisiosOBIntro;

public class SentenciasCtrl {
    public static void main(String[] args){
            //condicional IF
        int numeroIf = 0;
        if (numeroIf > 0){
            System.out.println("El nro "+numeroIf+" es positivo");
        }else if(numeroIf<0){
            System.out.println("El nro "+numeroIf+" es negativo");
        } else {
            System.out.println("El nro es 0");
        }

            //Bucle While
        int numeroWhile = -2;
        while (numeroWhile<3){
            System.out.println("Bucle while "+numeroWhile);
            numeroWhile++;
        }

            //Bucle Do While
        do{
            System.out.println("Bucle Do while " + numeroWhile);
            numeroWhile++;
        } while(numeroWhile <= numeroWhile - 1);
        
        //Bucle For
        for(int numeroFor=0; numeroFor<=3; numeroFor++){
            System.out.println("El numero de la iteracion es: " + numeroFor);
        }

        String estacion = "Otoño";
        switch(estacion){
            case "Verano":
                System.out.println("La estacion es Verano");
                break;
            case "Invierno":
                System.out.println("La estacion es Invierno");
                break;
            case "Otoño":
                System.out.println("La estacion es Otoño");
                break;
            case "Primavera":
                System.out.println("La estacion es Primaver");
                break;
            default:
                System.out.println("No es ninguna estacion");
        }
    }
}
