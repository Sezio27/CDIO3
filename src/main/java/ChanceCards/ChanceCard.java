package ChanceCards;

import spil.Player;

abstract public class ChanceCard {
    String description;

    public ChanceCard(String description) {
        this.description = description;
    }
    abstract public void process(Player[] in, Player with);
}