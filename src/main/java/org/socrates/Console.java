package org.socrates;

import java.util.Scanner;

public class Console {

    Scanner scanner = new Scanner(System.in);

    public void write(String text) {
        System.out.println(text);
    }

    public String read() {
        return scanner.nextLine();
    }
}
