public class OperadoresUnarios {
    public static void main(String[] args) {

        //Operadores Unarios (++, --, +, -, ~)
        //Se aplican a un solo operando.

        int a = 5;
        int b = -a; //Negacion unaria
        boolean flag= true;

        System.out.println("Negacion unaria: " + b); //-5
        System.out.println("Negacion Logica: " + !flag); //False

        //Incremento y decremento
        int c = 10;
        System.out.println("Valor original: " + c); //10
        System.out.println("Post-Incremento: " + (c++)); //10
        System.out.println("Pre-Incremento: " + (++c)); //12
        System.out.println("Post-Decremento: " + (c--)); //12
        System.out.println("Pre-Incremento: " + (--c)); //10


    }
}
