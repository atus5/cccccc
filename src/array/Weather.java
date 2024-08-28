/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Admin
 */
public class Weather {

    /**
     * @param args the command line arguments
     */
    public void weather(){

        Scanner sc = new Scanner(System.in);
        float avenger = 0;
        int[] arr = new int[100];
        int count = 0;
        for (int i = 1; i <= 8; i++) {
            System.out.println("Nhap ngay thu: " + i);
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i <= 8; i++) {
            System.out.println("Nhiet do ngay thu " + i + " la: " + arr[i]);

        }
        for (int i = 1; i <= 8; i++) {
            avenger += arr[i];

        }
        avenger /= 8;
        System.out.println("Nhiet do trung binh: " + avenger);

        for (int i = 1; i <= 8; i++) {
            if (arr[i] > avenger) {
                count++;
            }

        }
        System.out.println(count + " days were above avenger.");

            int[] sortt = Arrays.copyOfRange(arr, 1, 9);
        Arrays.sort(sortt);
        
        System.out.println("Two coldest days: " + sortt[0] + ", " + sortt[1]);
        System.out.println("Two hottest days: " + sortt[sortt.length - 1] + ", " + sortt[sortt.length - 2]);
    }
}

