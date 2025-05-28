package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_56;

//Java Program to check for triplet sum by generating
//all triplets

import java.util.*;
class GfG {

 // Function to check if there exists a triplet with the given sum
 static boolean hasTripletSum(int[] arr, int target) {
     int n = arr.length;
     
     // Fix the first element as arr[i]
     for (int i = 0; i < n - 2; i++) {
         
         // Fix the second element as arr[j]
         for (int j = i + 1; j < n - 1; j++) {
             
             // Now look for the third number
             for (int k = j + 1; k < n; k++) {
                 if (arr[i] + arr[j] + arr[k] == target)
                     return true; // If a triplet is found
             }
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
