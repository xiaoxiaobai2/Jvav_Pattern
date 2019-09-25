package Strategy;

public class NewCustormManyStrategy implements Strategy {
    @Override
    public double getPrice(double price) {
        System.out.println("新用户大量购买：打九折");
        return price*0.9;
    }
}
