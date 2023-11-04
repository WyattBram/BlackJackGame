import java.util.ArrayList;


public class Dealer extends Person{

    //creates a dealer and gives them cards in hand
    Dealer(){
        this.cards_in_hand = new ArrayList<Card>();
    }

    //Returns the first card in the dealers hand for initial showcase of dealers cards
    public String toStringFirst(){
        return cards_in_hand.get(0).getFace() + " ?";
    }
}
