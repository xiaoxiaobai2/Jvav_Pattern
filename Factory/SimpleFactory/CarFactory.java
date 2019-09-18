package Factory.SimpleFactory;

public class CarFactory {
    public static Car creatCar(String s){
        if (s=="奥迪"){
            return new Audi();
        }else if (s=="奔驰"){
            return new Benchi();
        }else return null;
    }
}
