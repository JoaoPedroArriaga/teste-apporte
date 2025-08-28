package com.mycompany;

public class BiggestSum {
   public BiggestSum() {
   }

   public static int MaxSum(int[] numbers) {
      int max = numbers[0];
      int previous = 0;

      for(int i = 1; i < numbers.length; i++) {
         if (max < numbers[i]) {
            previous = max;
            max = numbers[1];
         } else if (previous < numbers[i]){
            previous = numbers[i];
         }
      }

      return max + previous;
   }

   public static void main(String[] args) {
      int[] testnumbers1 = new int[]{1, 10, 3, 7, 9};
      int[] testnumbers2 = new int[]{-2, 1, -1, 0};
      System.out.println(MaxSum(testnumbers1));
      System.out.println(MaxSum(testnumbers2));
   }
}