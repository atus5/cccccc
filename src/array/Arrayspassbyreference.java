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
public class Arrayspassbyreference {
    public static void crease() {
        int[] iq = {126, 167, 95};
        increase(iq);
        System.out.println(Arrays.toString(iq));

        reverse(iq);
        System.out.println(Arrays.toString(iq));
    }

    public static void increase(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * 2;
            System.out.println(a[i]);
        }
    }

    public static void reverse(int[] iq) {
        for (int i = 0; i < iq.length / 2; i++) {
            int temp = iq[i];
            iq[i] = iq[iq.length - 1 - i];
            iq[iq.length - 1 - i] = temp;
        }
    }

}



