package citiBank;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
                printBinaryDigits(-2);
    }

    static void printBinaryDigits(int n){
        for(int i = 0 ; i < 32 ; i++){
            if((n>>i & 1) == 1){
                System.out.print("1 " );
            }
            else{
                System.out.print("0 ");
            }
        }
    }
}
