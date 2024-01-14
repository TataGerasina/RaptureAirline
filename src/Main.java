
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 50_000;
        int miles = service.calculate(price); // должно получиться 2500
        System.out.println(miles);
    }
}