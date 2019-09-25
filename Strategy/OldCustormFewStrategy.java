package Strategy;

public class OldCustormFewStrategy implements Strategy {
    @Override
    public double getPrice(double price) {
        System.out.println("老用户少量购买：打八五折");
        return price*0.85;
    }
}
