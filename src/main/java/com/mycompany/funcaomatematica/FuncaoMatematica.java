package com.mycompany.funcaomatematica;

public class FuncaoMatematica {

    public static void main(String[] args) {

        double x = 3.0;
        double y = 4.0;
        double z = 5.0;
        double a, b, c;

        //RAIZ QUADRADA
        a = Math.sqrt(x);
        b = Math.sqrt(y);
        c = Math.sqrt(25.0);

        System.out.println("RESULTADO EM RAIZ QUADRADA");
        System.out.println("Raiz quadrada de " + x + " = " + a);
        System.out.println("Raiz quadrada de " + x + " = " + b);
        System.out.println("Raiz quadrada de 25 = " + c);

        //POTÊNCIA
        a = Math.pow(x, y);
        b = Math.pow(x, 2.0);
        c = Math.pow(5.0, 2.0);

        System.out.println("\nRESULTADO EM POTÊNCIA");
        System.out.println(x + " elevado a " + y + " = " + a);
        System.out.println(x + " elevado ao quadrado = " + b);
        System.out.println("5 elevado ao quadrado = " + c);

        //VALOR ABSOLUTO
        a = Math.abs(y);
        b = Math.abs(z);

        System.out.println("\nRESULTADO EM VALOR ABSOLUTO");
        System.out.println("Valor absoluto de " + y + " = " + a);
        System.out.println("Valor absoluto de " + z + " = " + b);

        System.out.println("\nThe End");

    }
}
