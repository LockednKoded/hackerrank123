/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/*
Duplication
by philipsweng

Consider a binary string, , with an initial value of . We expand  by performing the following steps:

Create a string, , where each character  is equal to . For example, if , then . Note that  and  always have the same length because  is the complement of .
Append  to the end of  so that . In the example above,  becomes .
We keep on expanding  using steps  and  until the length of  exceeds .
When we repeat the expansion operation, string  grows like this:

Given  queries in the form of a zero-based index, , solve each query by printing the character at index  in  on a new line.

Input Format

The first line contains an integer denoting  (number of queries). 
Each of the  subsequent lines contains an integer describing the value of  for a query.

Constraints

Output Format

For each query, print the value of  (i.e., either  or ) on a new line.

Sample Input 0

3
2
5
7
Sample Output 0

1
0
1

*/

/**
 *
 * @author Karishma
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.*;

public class Solution {

    static String duplication(int x){
        // Complete this function
        
        String s = "0";
        while (x>=s.length())
            
            {
                String t ="";
            
            int len = s.length();
            for(int j=0; j<len; j++)
                {
                    
                String tt =  Integer.toString(1-((Integer.valueOf(s.charAt(j)))-48));
                t = t+tt; 
            }
            s=s+t;
        }
        
        String now = ""+s.charAt(x);
        
        return (now);
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            String result = duplication(x);
            System.out.println(result);
        }
    }
}

