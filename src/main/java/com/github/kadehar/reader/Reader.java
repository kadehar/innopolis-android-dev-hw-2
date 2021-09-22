package com.github.kadehar.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
    public String readLine() {
        String string = "";
        try(BufferedReader reader =
                    new BufferedReader(new InputStreamReader(System.in))) {
            string = reader.readLine();
        } catch (IOException e) {
            System.out.println("Checked!");
        }
        return string;
    }
}
