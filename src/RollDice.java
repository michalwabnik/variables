public class RollDice {
    public int rollDice() {
        double randomNumber = Math.random();
        randomNumber = randomNumber + 1;
        int randomInt = (int) randomNumber;
        return randomInt;

    }
}
