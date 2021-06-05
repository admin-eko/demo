package Lesson_2;

import java.io.IOException;

public class MyArraySizeException extends IOException {
    private MyArraySizeException() {

    }

    public MyArraySizeException(String s) {
        super(s);
    }

}
