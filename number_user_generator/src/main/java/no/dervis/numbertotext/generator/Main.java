package no.dervis.numbertotext.generator;

public class Main {

    public static void main(String[] args) {

        Generator generator = Generator.createFromLanguageProviders();

        System.out.println(generator.convert(123));

    }

}
