package JavaCuestionario2;

import java.util.*;
import java.lang.*;
import java.io.*;

class Main16 {
    public static void main(String[] args) {
        String str = "1a2b3c4d5e6f";
        String[] splitStr = str.split("//D");

        for (String elemento : splitStr) {
            System.out.println(elemento);
        }
    }
}

