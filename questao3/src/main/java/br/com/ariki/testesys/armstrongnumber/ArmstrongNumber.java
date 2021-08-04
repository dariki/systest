package br.com.ariki.testesys.armstrongnumber;

public class ArmstrongNumber {

    private ArmstrongNumber(){}

    public static boolean isArmstrongNumber(String textNumber){

        double number = Double.parseDouble(textNumber);
        char charNumber;
        double total = 0;
        double charValueToDouble;
        for (int i = 0; i < textNumber.length(); i++) {
            charNumber = textNumber.charAt(i);
            charValueToDouble = Character.getNumericValue(charNumber);
            total = total + Math.pow(charValueToDouble, 3);
        }

        boolean result = total == number;

        System.out.printf("Valor %s %s um número Armstrog. Valor calculado: %s%n",number, result ? "é" : "NÃO é", total);
        return result;
    }
}
