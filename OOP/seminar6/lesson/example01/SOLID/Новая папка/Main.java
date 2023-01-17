package isp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DepositSumUI sumUI = new ConsoleUI(new Scanner(System.in));
        DepositOperation dOp = new DepositOperation(sumUI);
        dOp.execute();
    }
}
