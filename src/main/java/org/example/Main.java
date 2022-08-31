package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of lines and columns: ");
    Integer num = sc.nextInt();
    System.out.println();

    Integer[][] matrix = new Integer[num][num];

    List<Integer> diagonal = new ArrayList<>();
    List<Integer> negatives = new ArrayList<>();

    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num; j++) {
        System.out.printf("Pos[%d][%d]: ", i, j);
        matrix[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (i == j) {
          diagonal.add(matrix[i][j]);
        }
        if (matrix[i][j] < 0) {
          negatives.add(matrix[i][j]);
        }
      }
    }

    System.out.println();
    System.out.println("Main diagonal");
    for (Integer el : diagonal) {
      System.out.print(el + " ");
    }
    System.out.printf("%nNegative numbers = %d", negatives.size());

    sc.close();
  }
}