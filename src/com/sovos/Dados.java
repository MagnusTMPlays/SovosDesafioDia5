package com.sovos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Dados {

    List<String> nomes = new ArrayList<String>();
    List<Integer> numeros = new ArrayList<Integer>();
    Random geradorNum = new Random();

    public Dados(){
        nomes.add("Eu");
        nomes.add("Felipa");
        nomes.add("Jona");
        nomes.add("Fernanda");
        nomes.add("Ramon");
        nomes.add("Diego");
        nomes.add("Trinity");
        nomes.add("Vocelsio");
        nomes.add("Malana");
        nomes.add("Champu");

    }

    public void numeros(){
        int i = 1;
        for (i = 1;i<=10;i++){
            int id;
            numeros.add(geradorNum.nextInt(11));
        }
    }

    public void ordenarCresc(){

        Collections.sort(numeros);
        Collections.sort(nomes);
    }

    public void ordenarDecr(){
        Collections.sort(numeros);
        Collections.reverse(numeros);
        Collections.reverse(nomes);
    }


    public void deletarLista(){
        numeros.clear();
    }

    public void view(){
        System.out.println(nomes);
        System.out.println(numeros);
    }

    public void media() {
        double aux = 0;
        for (int i = 0; i < numeros.size(); i++) {
            aux = aux + numeros.get(i);
        }
        System.out.println("Soma: "+aux);
        System.out.println("Media: "+aux/(numeros.size()));
    }
}
