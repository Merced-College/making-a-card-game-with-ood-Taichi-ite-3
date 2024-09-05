import java.util.Random;

public class Card {
    private int value;
    private String suit;
    private String rank;

    public Card(){
        this.value = 0;
        this.suit = "no suit";
        this.rank = "no rank";
    }

    public Card(int value, String suit, String rank){
        this.value = value;
        this.suit = suit;
        this.suit = rank;
    }

    public String getRank(){
        return rank;
    }

    public String getSuit(){
        return suit;
    }

    public int getValue(){
        return value;
    }

    public void setRank(String rank){
        this.rank = rank;
    }

    public void setSuit(String suit){
        this.suit = suit;
    }

    public void setValue(int value){
        this.value = value;
    }

    public String toString(){
        return "Rank = " + rank + "," + "suit = " + suit + "," + "value = " + value + ",";
    }

    public void dealCard(){
        Random rand = new Random();
        String suit = getSuit();
        String rank = getRank();
        int vlaue = getValue();
    }
}
