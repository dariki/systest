package br.com.ariki.testesys.armstrongnumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TextoXML {

    private TextoXML(){}

    public static String extrairTextoXML(String palavra) {

        StringBuilder sb = new StringBuilder();
        sb.append("<h1>Nayeem loves counseling</h1>");
        sb.append("<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>");
        sb.append("<Amee>safat codes like a ninja</amee>");
        sb.append("<SA premium>Imtiaz has a secret crush</SA premium>");

        String nohtml = sb.toString().replaceAll("\\</.*?>","\n");
        nohtml = nohtml.replaceAll("\\<.*?>","");
        nohtml = nohtml.replaceAll("\n\n","\n");

        System.out.println(nohtml);

        return nohtml;

    }
}
