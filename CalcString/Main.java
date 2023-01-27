package CalcString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        CharOperations charOperations = new CharOperations();
        charOperations.checkAction(exp);
    }
}