package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (a<b&&b<c || c<b&&b<a){
            System.out.println(b);
        }
        else if (b>a&&a>c || c>a&&a>b){
            System.out.println(a);
        }
        else if (a>c&&c>b || b>c&&c>a){
            System.out.println(c);
        }


    }
}
