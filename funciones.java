public class funciones {

    public static void main(String [] args){
        int resulFinal = suma(1, 4, 3);
        System.out.println(resulFinal);

        Coche miCoche = new Coche();
        miCoche.masPuertas();
        System.out.println(miCoche.puertas);
        
    }
    public static int suma(int a, int b, int c){
        int resultado = a + b + c;
        return resultado;
    }

    public static class Coche{
        int puertas = 4;
        void masPuertas(){
            this.puertas++;
        }
    }
}
