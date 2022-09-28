package danielkazmierczak;

import java.util.ArrayList;

public class KanyeWestQuotes {
    private ArrayList<String> quotes;

    public KanyeWestQuotes() {
        this.quotes = new ArrayList<>();
    }

    public void add(String string){
        quotes.add(string);
    }

    public boolean search(String string){
        for(String quote:quotes){
            if(string.equals(quote)){
                return true;
            }
        }
        return false;
    }
}
