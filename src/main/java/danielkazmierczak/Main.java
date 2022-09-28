package danielkazmierczak;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KanyeWest quote = new KanyeWest();

        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        System.out.println(quote.quote());
        while(!quit){
            String x = scanner.nextLine().toLowerCase(Locale.ROOT);
            if(x.equals("next")){
                System.out.println(quote.quote());
            }else if(x.equals("q")){
                quit = true;
            }else{
                System.out.println("Wrong command. Use command 'next' to see new quote or 'q' to quit");
            }
        }
    }

    /*ZAD 2 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
    W tym przypadku wybrałem metodę wyszukiwania binarnego.
    Złożoność obliczeniowa tego sposobu to O(logn), a pamięciowa O(1).
     */
    private boolean search(int[] numbers, int x){
        int begin = 0;
        int end = numbers.length - 1;
        int middle = 0;
        while(begin!=end){
            middle = (begin + end)/2;
            if(x == numbers[middle]){
                return true;
            }else if (x > numbers[middle]){
                end = middle - 1;
            }else{
                begin = middle + 1;
            }
        }
        return false;
    }


}