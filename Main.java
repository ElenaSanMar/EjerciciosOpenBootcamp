public class EjT3{
    public static void main(String[] args) {
        int resultado = suma(1, 2, 3);
        System.out.print("El valor de la suma es: ");
        System.out.println(resultado);

        coche miCoche = new coche();
        miCoche.IncrementarPuerta();
        System.out.print("El numero de puertas del coche es: ");
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}

class coche{
    public int puertas = 0;

    public void IncrementarPuerta(){
        this.puertas++;
    }

}
