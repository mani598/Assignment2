package nz.ac.eit.Assignment2;

import java.util.Scanner;

public class InputShouldBeYOrNException extends Throwable {
    InputShouldBeYOrNException() {

    }

    @Override
    public String getMessage() {
        return "The input must be either 'y' or 'n'.";
    }
//when using: throw new InputShouldBeYOrNException
}
