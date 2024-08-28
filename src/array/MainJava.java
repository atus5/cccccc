/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class MainJava {

    public static void main(String[] args) {
        swaptwoArray sw = new swaptwoArray();
        int[] a = {11, 42, -5, 27, 0, 89};// thay doi gia tri mang o day
        int[] a1 = {12, 34, 56};
        int[] a2 = {20, 50, 80};
        sw.swapAll(a1, a2);
        System.out.println(Arrays.toString(a1)); // [20, 50, 80]
        System.out.println(Arrays.toString(a2)); // [12, 34, 56]

    }

}
