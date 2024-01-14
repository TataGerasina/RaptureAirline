
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 20_333;
        int rubleMile = 20;
        int miles = service.calculate(20_333, 20);
        System.out.println(miles);
    }
}