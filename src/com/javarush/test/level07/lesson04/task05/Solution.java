package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] bigMass = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < bigMass.length; i++) {
            bigMass[i] = Integer.parseInt(reader.readLine());
        }

        int[] smallMass1 = new int[10];
        int[] smallMass2 = new int[10];

        for (int i = 0; i < bigMass.length; i++) {
            if (i<smallMass1.length){
                smallMass1[i] = bigMass[i];
            }
            else {
                smallMass2[i-10] = bigMass[i];
                System.out.println(smallMass2[i-10]);
            }
        }
    }
}
