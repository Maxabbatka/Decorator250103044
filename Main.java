public class Main {
    public static void main(String[] args) {
        Pizza myPizza = new Pineapple(new Olive(new Cheese(new PlainPizza())));

        System.out.println("Description: " + myPizza.getDescription());
        System.out.printf("Total Cost : " + myPizza.getCost() + "$");
    }
}