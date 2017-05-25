/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author Karishma
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6 {
    
    public static void separate(String x)
        {
        int n = x.length();
        String even = "";
        String odd = "";
        for(int j = 0; j<n; j++)
            {
            if(j%2==0)
                even = even+x.charAt(j);
            else
                odd = odd+x.charAt(j);
            }
        System.out.println(even+" "+odd);
        return;
        }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int numb;
        Scanner in = new Scanner(System.in);
        numb = in.nextInt();
        in.nextLine(); //tch tch tch 
        String arr = new String();
        for(int i = 0; i<numb; i++)
           { 
               arr =  in.nextLine();
            separate(arr);}
        in.close();
    }
    
}
