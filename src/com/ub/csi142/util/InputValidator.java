package com.ub.csi142.util;
public class InputValidator{
  public static boolean isPositive(int value){
    return value >0;
  }
  public static boolean isValidChoice(int choice){
    return choice >= 1 && choice<= 5;
  }
}
