package com.fabiobritto.view;

import java.util.Scanner;

public class ConsoleView {

    public void printMessage(String message){
        System.out.println(message);
    }
    
    public String catchInput(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
