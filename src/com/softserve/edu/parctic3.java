package com.softserve.edu;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.String;
import java.util.Locale;

/* enum Continent {
    EU("Ukraine", "Poland"),
    AS("Japan", "India"),
    AU("Australia"),
    NA("USA", "Canada"),
    SA("Brazil", "Chilli");
    private final String country1;
    private final String country2;

    Continent(String arg1, String arg2){
        this.country1 = arg1;
        this.country2 = arg2;
    }
    Continent(String arg1){
        this.country1 = arg1;
        this.country2 = "";
    }

*/
enum Continent {
    AS(new String[]{"Japan", "India"}, false),
    AU(new String[]{"Australia"}, false),
    EU(new String[]{"Ukraine", "Poland"}, false),
    NA(new String[]{"USA", "Canada"}, false),
    SA(new String[]{"Brazil", "Chilli0"}, false);
    private final String[] countries;
    private boolean active;

    Continent(String[] args1, boolean act) {
        int counter = 0;
        countries = new String[args1.length];
        for (String arg : args1) {
            this.countries[counter++] = arg;
        }
        this.active = act;
    }
        public Continent nextContinent() {
           if (this == Continent.AS) return AU;
            if (this == Continent.AU) return EU;
            if (this == Continent.EU) return NA;
            if (this == Continent.NA) return SA;
            return AS;

        }

 /*
 @Override
        public String toString(){
        return "";
        }
*/
        public Continent hasCountry (String arg){
             Continent result = AS;
             arg = arg.toLowerCase();
//             System.out.println("country = "+arg);
            do {
//                System.out.println(result);
                 for (String country : result.countries) {
                     if ((country.toLowerCase()).equals(arg)) {
                         result.active = true;
                         return result;
                     }
                 }
                 result = result.nextContinent();
             }
             while (result != AS);
             return result;

        }

        public boolean isActive (){
            return active;
        }

//    */

}

public class parctic3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String country;
        System.out.print("Country? : ");
        country = br.readLine();
//        Continent continent = Continent.hasCountry(country);
        Continent continent = Continent.AS;
        continent = continent.hasCountry(country);
        if (continent.isActive())
//        if (continent.hasCountry(country))
            System.out.println("The country belongs " + continent);
        else
            System.out.println("The country not found!?!?!");
//        System.out.println(localization.getUa());

    }
}
/*
 enum Localization {
    EN("Англійська", "English"), UA("Українська", "Ukrainian");
    private final String ua;
    private final String en;

    Localization(String ua, String en) {
        this.ua = ua;
        this.en = en;
    }

    public String getUa() {
        return ua;
    }

    public String getEn() {
        return en;
    }

}
*/