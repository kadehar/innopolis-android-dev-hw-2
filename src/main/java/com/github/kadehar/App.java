package com.github.kadehar;

import com.github.kadehar.custom.MyCustomException;
import com.github.kadehar.reader.Reader;
import com.github.kadehar.thrower.Thrower;

public class App {
    public static void main(String[] args) {
        Reader reader = new Reader();
        System.out.print("Input a string: ");
        String str = reader.readLine();
        System.out.println("\nOutput: " + str);

        Thrower thrower = new Thrower();
        try {
            thrower.throwCustomException();
        } catch (MyCustomException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
