package br.com.ariki;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        String palavra = "";

        if(args.length > 0) {
            palavra = Optional.ofNullable(args[0])
                    .orElse("");
        }
        System.out.printf("String de entrada: %s%n", palavra);

        List<String> anagramas = criarAnagramas("", palavra);

        if(anagramas.size() > 5){
            System.out.printf("String de saída: %s...%n", String.join(", ", anagramas.subList(0, 7)));
        } else {
            System.out.println("String de saída: Quantidade de string de saída não atingiu o valor mínimo(5).");
        }
    }

    private static List<String> criarAnagramas(String prefixo, String sufixo) {

        List<String> anagramas = new ArrayList<>();

        if (Optional.ofNullable(sufixo).isPresent() && sufixo.length() > 0 && sufixo.length() <= 50) {

            String ponteiro;
            String antes;
            String proximo;
            if (sufixo.length() <= 1) {
                anagramas.add(prefixo + sufixo);
            } else {
                for (int i = 0; i < sufixo.length(); i++) {
                    ponteiro = sufixo.substring(i, i + 1);
                    antes = sufixo.substring(0, i);
                    proximo = sufixo.substring(i + 1);
                    anagramas.addAll(criarAnagramas(prefixo + ponteiro, antes + proximo));
                }
            }

        }

        return anagramas;
    }

}
