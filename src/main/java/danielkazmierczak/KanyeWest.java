package danielkazmierczak;

import kong.unirest.Unirest;


public class KanyeWest {

    private KanyeWestQuotes kanyeWestQuotes = new KanyeWestQuotes();

    public String quote(){

        String quote = Unirest.get("https://api.kanye.rest/text").asString().getBody();
        while(kanyeWestQuotes.search(quote)){
            quote = Unirest.get("https://api.kanye.rest/text").asString().getBody();
        }
        kanyeWestQuotes.add(quote);
        return quote;
    }

}
