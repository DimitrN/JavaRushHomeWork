package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] mas = new int[3];
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());


        mas [0] = a;
        mas [1] = b;
        mas [2] = c;

        Arrays.sort(mas);
        System.out.println(mas [2]);
        System.out.println(mas [1]);
        System.out.println(mas [0]);



    }
}
