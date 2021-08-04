public class Main {
    public static void main(String[] args) {
        String numeroEmTexto = "153";
        double valorOriginal = Double.parseDouble(numeroEmTexto);
        char numeroChar;
        double total = 0;
        double charValueToDouble;
        for (int i = 0; i < numeroEmTexto.length(); i++) {
            numeroChar = numeroEmTexto.charAt(i);
            charValueToDouble = Character.getNumericValue(numeroChar);
            total = total + Math.pow(charValueToDouble, 3);
        }
        System.out.printf("Valor %s %s um número Armstrog. Valor calculado: %s%n",valorOriginal,  total == valorOriginal ? "é" : "NÃO é", total);

    }
}
