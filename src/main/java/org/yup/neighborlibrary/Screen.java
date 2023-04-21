package org.yup.neighborlibrary;

import java.util.Scanner;

public class Screen(){
    return 0;
}

public int screenMenu(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to the library menu!");
    System.out.println("Press 1 for ");
    System.out.println("Press 2 for ");
    System.out.println("Press 3 for ");
    int userSelection = scanner.nextInt();
    int result;
    switch (userSelection){
        case 1:
            result = xxxxx;
            break;
        case 2:
            result = xxxxx;
            break;
        case 3:
            result = xxxxx;
            break;
        default:
            System.out.println("The user chose nothing.");
            result = 0;
    }
    return result;
}