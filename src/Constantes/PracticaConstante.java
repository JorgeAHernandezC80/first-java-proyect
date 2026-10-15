package Constantes;

public class PracticaConstante {
    public static void main(String[] args) {
        int workDays = 10;
        workDays = 20;
        workDays = 30;

        //Valor fijo de la constante y que no varia a lo largo del tiempo
        final double ANNUAL_INTEREST_RATE = 0.10;

        //Valor fijo de la constante TAX_RATE y que no varia a lo largo del tiempo
        final double TAX_RATE = 0.10;
        int grossSalary = 3000;
        double netSalary = grossSalary * (1 - TAX_RATE);
        System.out.println("Salario Neto: " + netSalary);

    }
;;}
