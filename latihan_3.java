/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zahra281022;

/**
 *Mengunakan do while loop
 * 
 * @author HP
 */
public class latihan_3 {
    public static void main(String[]args)
    {
        String[] hari = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

        int i=0;
        do
            {
                System.out.println(hari[i]);
                i++;
            }while(i<hari.length);
    }
}
