/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometasks;

import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class HomeTasks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        App app = new App(scanner);
        app.run();
    }
    
}
