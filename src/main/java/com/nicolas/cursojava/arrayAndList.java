package com.nicolas.cursojava;

import org.w3c.dom.NameList;

import java.util.ArrayList;

public class arrayAndList {
    static void main() {
        EstruturaDeRepeticao();
        invertString();
        RepeticaoEDecicaoJuntos();
    }

    private static void EstruturaDeRepeticao() {
        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("Nicolas");
        nameList.add("Maria");
        nameList.add("White");

        //CONDIÇÃO
        if(nameList.contains("Nicolas")){
            System.out.println("tem Nicolas na lista " + nameList);
        }else{
            System.out.println(("nao tem Nicolas na lista"));
        }

        //LOOP
        for(String showName : nameList){
            System.out.println(showName);
        }

        //LOOP 2
        nameList.forEach(showName2 -> System.out.println(showName2));

        //LOOP 3
        for(int i = 0; i < nameList.size(); i++){
            System.out.println(nameList.get(i));
        }
    }

    private static void invertString() {
        String normal = "12345";
        String invertida = "";

        for(int j = normal.length() -1 ;  j >= 0 ; j--){
            // índice:    0 1 2 3 40
            // caracteres 1 2 3 4 5
            invertida = invertida + normal.charAt(j);
        }
        System.out.println(invertida);
    }

    private static void RepeticaoEDecicaoJuntos () {
        ArrayList<Integer> listaDeUmADez = new ArrayList<>();
        for(int k = 1; k < 10; k++){
            listaDeUmADez.add(k);
        }

        ArrayList<Integer> numerosPares = new ArrayList<>();
        ArrayList<Integer> numerosImpares = new ArrayList<>();

        for(Integer numero : listaDeUmADez){
            if (numero % 2 == 0){
                numerosPares.add(numero);
                System.out.println("numeros pares: " + numero);
            }else{
                numerosImpares.add(numero);
                    System.out.println("numeros impares: " + numero);
                }
            }
            for(Integer numeroPar : numerosPares){
                System.out.println(numeroPar);
            }for(Integer numeroImpar : numerosImpares){
                System.out.println(numeroImpar);
            }
        }
    }

//Em Java, array e List servem para guardar vários valores, mas funcionam de formas diferentes.
//
//Array
//
//O array tem tamanho fixo.
//
//String[] nomes = new String[3];
//
//nomes[0] = "Ana";
//nomes[1] = "Carlos";
//nomes[2] = "Maria";
//
//Aqui o array só pode guardar 3 posições.
//
//Se quiser mais espaço, precisa criar outro array.
//
//Características do array
//tamanho fixo
//mais rápido
//estrutura mais simples
//pode guardar tipos primitivos diretamente



//List
//
//List é uma interface da biblioteca Java.
//
//A implementação mais usada é:
//
//ArrayList
//
//Exemplo:
//
//import java.util.ArrayList;
//import java.util.List;
//
//List<String> nomes = new ArrayList<>();
//
//nomes.add("Ana");
//nomes.add("Carlos");
//nomes.add("Maria");
//
//Agora você pode adicionar infinitos itens dinamicamente.