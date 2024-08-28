/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author Admin
 */
public class swaptwoArray {

    public static void swapAll(int[] a1, int[] a2) {
        for (int i = 0; i < a1.length; i++) {
            int temp = a1[i];
            a1[i] = a2[i];
            a2[i] = temp;
        }
    }

}
