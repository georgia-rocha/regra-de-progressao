package com.trybe.java.regraprogressao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   * Novo PR
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int qntAtividade = Integer.parseInt(scanner.nextLine());

    ArrayList<String> atividades = new ArrayList<>();
    ArrayList<Integer> pesos = new ArrayList<>();

    for (int i = 1; i <= qntAtividade; i++) {
      System.out.println("Digite o nome da atividade " + i + ":");
      atividades.add(scanner.nextLine());

      System.out.println("Digite o peso da atividade " + i + ":");
      pesos.add(Integer.parseInt(scanner.nextLine()));
    }

    System.out.println(
        "pesos:" + pesos.toString() + "atividades:" + atividades.toString()
    );
    scanner.close();
  }
}

// package com.trybe.java.regraprogressao;

// import java.util.Arrays;
// import java.util.Scanner;

// /**
//  * App.
//  */
// public class App {

//   /**
//    * Metodo main.
//    */
//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);

//     System.out.println("Digite a quantidade de atividades para cadastrar:");
//     int qntAtividade = Integer.parseInt((scanner.nextLine()));
//     int[] pesos = new int[qntAtividade];
//     String[] atividades = new String[qntAtividade];
//     for (int i = 1; i <= qntAtividade; i++) {
//       System.out.println("Digite o nome da atividade " + i + ":");
//       atividades[i - 1] = scanner.nextLine();
//       System.out.println("Digite o peso da atividade " + i + ":");
//       pesos[i - 1] = Integer.parseInt(scanner.nextLine());
//       System.out.print("Digite a nota obtida para" + " " + atividades[i - 1] + ": ");
//       float nota =  Float.parseFloat(scanner.nextLine());
//     }
//     System.out.println(
//             "pesos:" + Arrays.toString(pesos) + "atividades:" + Arrays.toString(atividades));
//     scanner.close();
//   }
// }