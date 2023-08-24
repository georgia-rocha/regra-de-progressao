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

    int numAct = readQuanty(scanner);

    double totalWeights = 0;

    for (int i = 1; i <= numAct; i++) {
      String nameAtc = readName(scanner, i);
      double weightsAct = readWeightsAct(scanner, i);
      double gradeAct = readGradeAct(scanner, nameAtc);

      totalWeights += weightsAct;

      System.out.println();
    }

    result(gradeFinal);

    scanner.close();
  }

  private static int readQuanty(Scanner scanner) {
    System.out.println("Digite a quantidade de atividades para cadastrar:");
    return scanner.nextInt();
  }

  private static String readName(Scanner scanner, int i) {
    scanner.nextLine();
    System.out.println("Digite o nome da atividade " + i + ":");
    return scanner.nextLine();
  }

  private static double readWeightsAct(Scanner scanner, int i) {
    System.out.println("Digite o peso da atividade " + i + ":");
    return scanner.nextDouble();
  }

  private static double readGradeAct(Scanner scanner, String nameAtc) {
    scanner.nextLine();
    System.out.println("Digite a nota obtida para " + nameAtc + ":");
    return scanner.nextDouble();
  }
}
