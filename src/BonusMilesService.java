public class BonusMilesService {
    public int calculate(int price, int rublesMile) {
        int miles;
        int rubleMile;
        if (price >= rublesMile) {
            miles = price / rublesMile;
        } else {
            miles = 0;
        }
        return miles;
    }
}
