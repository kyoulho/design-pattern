package iterator;

public class Client {
    public static void main(String[] args) {
        Witness witness = new Witness(new CafeMenu(), new DinnerMenu());
        witness.printMenu();
    }

}
