package com.github.kadehar.thrower;

import com.github.kadehar.custom.MyCustomException;

public class Thrower {
    public void throwCustomException() throws MyCustomException {
        throw new MyCustomException("[MyCustomException] Hello from custom!");
    }
}
