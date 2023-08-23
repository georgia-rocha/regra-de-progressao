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
    double pesos = 0;

    for (int i = 1; i <= qntAtividade; i++) {
      System.out.println("Digite o nome da atividade " + i + ":");
      atividades.add(scanner.nextLine());

      System.out.println("Digite o peso da atividade " + i + ":");
      pesos += (Integer.parseInt(scanner.nextLine()));
    }

    System.out.println(
        "pesos:" + pesos + "atividades:" + atividades.toString()
    );
    scanner.close();
  }
}
