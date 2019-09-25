package Strategy;

public class NewCustormFewStrategy implements Strategy {
    @Override
    public double getPrice(double price) {
        System.out.println("新用户少量购买：原价");
        return price;
    }
}
