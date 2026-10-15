package Condicionales;

public class Condicionales {
    public static void main(String[] args) {
        int age = 55;

        //Condicionales if, else if, else.
        if (age <= 0) {
            System.out.println("Error: ingrese una edad válida (un número mayor a 0).");
        } else if (age >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }

        // switch case
        int day = 8;

        switch (day) {
            case 1:
                System.out.println("Lunes.");
                break;
            case 2:
                System.out.println("Martes.");
                break;
            case 3:
                System.out.println("Miércoles.");
                break;
            case 4:
                System.out.println("Jueves.");
                break;
            case 5:
                System.out.println("Viernes.");
                break;
            case 6:
                System.out.println("Sábado.");
                break;
            case 7:
                System.out.println("Domingo.");
                break;
            default:
                System.out.println("Error: ingrese un número de día válido (del 1 al 7).");
        }
        
        //Buenas practicas

        age = 17;
        double average = 6.99;
        boolean isAdult = age >= 18;
        boolean hasPassingGrade = average >= 7;

        if (age <= 0) {
            System.out.println("Error: ingrese una edad válida (un número mayor a 0).");
        } else if (isAdult && hasPassingGrade) {
            System.out.println("El estudiante cumple con todos los requisitos.");
        } else if (!isAdult && !hasPassingGrade) {
            System.out.println("El estudiante no cumple ningún requisito: es menor de edad y su promedio es menor a 7.");
        } else if (!isAdult) {
            System.out.println("El estudiante no cumple los requisitos: es menor de edad.");
        } else {
            System.out.println("El estudiante no cumple los requisitos: su promedio es menor a 7.");
        }
    }
}