package it.develhope.regex;

public class Start {

    public static void main(String[] args) {

    System.out.println("------------------Starting--------------------");

    String s1 = "I Like to code near the Lake with my friend Luke";

    System.out.println(s1.replaceAll("L[^u]ke", "BLA"));

    System.out.println("----------------------------------------------");

    }
}
