package edu.isu.cs.cs3308.structures.impl;

public class SolitaireDecrypt {

    protected String deck;



    // Where all the magic happens. Will decrypt the given input.
    public String execute(String input)
    {
        //Capitalize all and remove spaces
        String capInput = input.replaceAll("\\s+","");
        capInput.toUpperCase();

       return capInput;
    }







    //Basic Constructor.
    public SolitaireDecrypt()
    {

    }

    //Constructor with string parameter.
    public SolitaireDecrypt(String deck) {
        this.deck = deck;
    }
}
