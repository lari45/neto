package neto;

import java.util.Random;
import java.util.Scanner;
class MassiM {

  static int stroka;
  static int stolb;
  static String line = "------------------------------------------";
  static int size = 8;
  static int [][] color = new int[size][size];
  static int [][] rotateColor = new int[size][size];

  public static void main(String []args){
    randomMatrik(color);
    printMatic(color);
    int ugol = getUgol();
    // matrikKrug(ugol);
  }//main

  public static void matrikKrug(int sustem ) {
    if (sustem == 90) {
      for (int stroka = 0; stroka < color.length; stroka++) {     //
        for (int stolb = 0; stolb < color.length; stolb++) {    //
          rotateColor[stroka][stolb] = color[color.length - stolb - 1][stroka];
        }//for2
      }//for1
      printMatic(rotateColor);

    } else if (sustem == 180) {
      for (int stroka = 0; stroka < color.length; stroka++) {
        for (int stolb = 0; stolb < color.length; stolb++) {
          rotateColor[stroka][stolb] = color[size - 1 - stroka][size - 1 - stolb];
        }//for2
      }//for1
      printMatic(rotateColor);

    } else if (sustem == 270) {
      for (int stroka = 0; stroka < color.length; stroka++) {
        for (int stolb = 0; stolb < color.length; stolb++) {
          rotateColor[stroka][stolb] = color[stolb][size - 1 - stroka];
        }//for2
      }//for1
      printMatic(rotateColor);
    }
  }

  public static int getUgol(){
    System.out.println(line);
    System.out.println("Введите угол на который вы хотите развернуть массив");
    System.out.println("Для окончания операции введите 0");
    System.out.println("90 , 180 , 270 Градусов");
    System.out.println(line);
    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNextInt()) {                   //Проверяем на ошибки /наличие букв в веденных даных
      int  enterUgol= scanner.nextInt();
      if(enterUgol==0){
        System.out.println("End");
        System.exit(0);
      }else
      if ( enterUgol == 90 || enterUgol == 180 || enterUgol == 270) { //Делаем проверку введенного угла
        matrikKrug(enterUgol);
      } else {
        System.out.println("Ввели не тот угол");
      }
    } else {
      System.out.println("Вы ввели не число .Повторите ввод ");
    }
    return getUgol();
  }//getUgol

  private static void randomMatrik(int[][] randomw) {
    Random random = new Random();
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        randomw[i][j] = random.nextInt(256);
      }
    }
  }//randomMatrik

  public static void printMatic(int[][] inmatrik){
    for(int[] row : inmatrik){
      for(int cell : row){
        System.out.format("%4d",cell);
      }
      System.out.println(" ");
    }
  }//printMatric

}//class
