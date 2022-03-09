package com.sovos;

public class Main {

    public static void main(String[] args) {

        Dados dados = new Dados();

        System.out.println("Criar as listas inicial desordenada:");
        dados.numeros();
        dados.view();

        System.out.println("\nOrdenar as listas de forma crescente:");
        dados.ordenarCresc();
        dados.view();

        System.out.println("\nApaga todos os elementos da lista numeros:");
        dados.deletarLista();
        dados.view();

        System.out.println("\nCriar novamente as listas inicial desordenada:");
        dados.numeros();
        dados.view();

        System.out.println("\nOrdenar as listas de forma decrescente:");
        dados.ordenarDecr();
        dados.view();

        System.out.println("\nMedia aritimetica dos valores numericos:");
        dados.media();
        dados.view();

    }

}
