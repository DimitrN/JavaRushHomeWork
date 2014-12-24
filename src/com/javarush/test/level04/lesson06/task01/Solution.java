package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String digit1 = br.readLine();
        String digit2 = br.readLine();

        int digitInt1 = Integer.parseInt(digit1);
        int digitInt2 = Integer.parseInt(digit2);

        if (digitInt1>digitInt2){
            System.out.println(digit2);
        } else {
            System.out.println(digit1);
        }

        /* данные для тестирования:
        введите 1 и 2, минимум =  1
        введите 2 и 1, минимум =  1
        введите 1 и 1, минимум =  1
        введите -1 и -2, минимум =  -2
         */
    }
}