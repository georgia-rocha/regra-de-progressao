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

    double totalPoints = 0;
    double totalWeights = 0;

    for (int i = 1; i <= numAct; i++) {
      String nameAtc = readName(scanner, i);
      double weightsAct = readWeightsAct(scanner, i);
      double gradeAct = readGradeAct(scanner, nameAtc);

      totalWeights += weightsAct;
      totalPoints += weightsAct * gradeAct;

      System.out.println();
    }

    double gradeFinal = finalGrade(totalPoints, totalWeights);

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

  private static double finalGrade(double totalPoints, double totalWeights) {
    return totalPoints / totalWeights;
  }

  private static void result(double gradeFinal) {
    System.out.println("Você alcançou " + gradeFinal + "%!");

    if (gradeFinal >= 85) {
      System.out.println("Parabéns! Você alcançou " + gradeFinal + "%! E temos o prazer de"
              + " informar que você obteve aprovação!");
    } else {
      System.out.println("Lamentamos informar que, com base na sua pontuação"
              + " alcançada neste período, " + gradeFinal + "%, você não atingiu a pontuação mínima"
              + " necessária para sua aprovação.");
    }
  }
}
