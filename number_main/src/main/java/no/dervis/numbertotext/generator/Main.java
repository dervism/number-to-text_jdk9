package no.dervis.numbertotext.generator;

import no.dervis.numbertotext.api.generator.Generator;

public class Main {

    public static void main(String[] args) {

        Generator base10Generator = new Base10Generator();

        System.out.println(base10Generator.convert(Integer.parseInt(args[0])));

    }

}
