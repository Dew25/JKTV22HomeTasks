/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class ArraySum {

    private final Scanner scanner;

    public ArraySum(Scanner scanner) {
        this.scanner = scanner;
    }

    public void printResult() {
        System.out.println("Массив случайных чисел: ");
        int[] myArray = new int[20];
        int min = 0;
        int max = 0;
        int sum = 0;
        //code this
        /*
        1. иницировать массив случайными числами от 0 до 99
        2. вычислить min и max
        3. вычислить сумму всех ячеек, вычесть из нее min и max, результат 
        разделить на количество ячеек массива минус 2.
        */
        System.out.println("min = "+ min);
        System.out.println("max = "+ max);
        System.out.println("Среднеарифметическая сумма ячеек = "+ sum);
        
    }
    
}
