package Strategy;

public class OldCustormManyStrategy implements Strategy {
    @Override
    public double getPrice(double price) {
        System.out.println("老用户大量购买：打八折");
        return price*0.8;
    }
}
