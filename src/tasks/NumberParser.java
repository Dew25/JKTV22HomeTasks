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
public class NumberParser {

    private final Scanner scanner;

    public NumberParser(Scanner scanner) {
        this.scanner = scanner;
    }

    public void doParse() {
        System.out.print("Введите трехзначное число: ");
        int edCount=0;
        int decCount=0;
        int sumDigits=0;
        
        System.out.println("В этом числе:");
        System.out.println("   - единиц: "+ edCount);
        System.out.println("   - десятков: " + decCount);
        System.out.println("   - сумма цифр: " + sumDigits);
    }
    
}
