public class BonusMilesService {
    public int calculate(int price) {
        int miles;

        if (price >= 20) {
            miles = price / 20;
        } else {
            miles = 0;
        }
        return miles;
    }
}
