
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 20_225;
        int rubleMile = 20;
        int miles = service.calculate(20_225, 20); // должно получиться 500
        System.out.println(miles);
    }
}