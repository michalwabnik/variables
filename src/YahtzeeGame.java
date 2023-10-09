import RollDice;
public class YahtzeeGame {
    public int keepRolling() {
        int dice1 = new RollDice().rollDice();
        int dice2 = new RollDice().rollDice();
        int dice3 = new RollDice().rollDice();
        int count = 1;
        while (!(dice1 == dice2 && dice2 == dice3)) {
            //we need to re-roll
            dice1 = new RollDice().rollDice();
            dice2 = new RollDice().rollDice();
            dice3 = new RollDice().rollDice();
            count = count + 1;
        }
        return count;
    }

}
