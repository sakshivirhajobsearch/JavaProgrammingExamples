package java_15H_collections_programs_map_interface_DSA_Problems_On_HashMap_63;

//Java Program to check for triplet sum using Sorting
//and Two Pointer Technique

import java.util.Arrays;

class GfG {
 static boolean hasTripletSum(int[] arr, int target) {
     int n = arr.length;
     Arrays.sort(arr);
     
     // Fix the first element as arr[i]
     for (int i = 0; i < n - 2; i++) {
         
         // Initialize left and right pointers with 
         // start and end of remaining subarray
         int l = i + 1, r = n - 1;
         
         int requiredSum = target - arr[i];
         while (l < r) {
             if (arr[l] + arr[r] == requiredSum)
                 return true;
             if (arr[l] + arr[r] < requiredSum)
                 l++;
             else if (arr[l] + arr[r] > requiredSum)
                 r--;
         }
     }

     // If we reach here, then no triplet was found
     return false;
 }

 public static void main(String[] args) {
     int[] arr = { 1, 4, 45, 6, 10, 8 };
     int target = 13;
     if (hasTripletSum(arr, target))
         System.out.println("true");
     else
         System.out.println("false");
 }
}
