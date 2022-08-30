public class funciones {

    public static void main(String [] args){
        int resulFinal = suma(1, 4, 3);
        System.out.println(resulFinal);

        Coche unCoche = new Coche();
        unCoche.masPuertas();
        System.out.println(unCoche.puertas);
        
    }
    public static int suma(int a, int b, int c){
        int resultado = a + b + c;
        return resultado;
    }

    static class Coche{
        int puertas = 4;
        void masPuertas(){
            this.puertas++;
        }
    }
}