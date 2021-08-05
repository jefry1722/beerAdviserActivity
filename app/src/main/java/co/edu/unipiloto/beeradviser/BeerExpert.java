package co.edu.unipiloto.beeradviser;


import java.util.ArrayList;

public class BeerExpert {

    public static ArrayList<String> getBrands(String beerType){
        ArrayList<String> beerList = new ArrayList();
        if(beerType.equals("Light")){
            beerList.add("Jail Pale Ale");
            beerList.add("Gout Stout");
        }
        else if(beerType.equals("Amber")){
            beerList.add("Jack Amber");
            beerList.add("Red Moose");
        }
        else if(beerType.equals("Brown")){
            beerList.add("Costeña negra");
            beerList.add("Miller lite");
        }
        else if(beerType.equals("Dark")){
            beerList.add("Aguila");
            beerList.add("Poker");
        }
        return beerList;
    }
}
