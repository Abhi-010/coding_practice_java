package abstract_class_interfaces.challenge_1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Store {

    public record OrderItem(int qty, ProductForSale product){}


    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {
        storeProducts.add(new ArtObject("Oil Painting", 1350,
                "Impressionistic work by ABF painted in 2010"));

        storeProducts.add(new ArtObject("Sculpture", 2000,
                "Bronze work by JKF, produced in 1950"));

        storeProducts.add(new Furniture("Desk",500,"Mahogany Desk")) ;

        storeProducts.add(new Furniture("Lamp", 200, "Tiffany Lamp with Humming Birds")) ;

        listProducts();


        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 3, 5);
        addItemToOrder(order2, 0, 1);
        addItemToOrder(order2, 2, 1);
        printOrder(order2);
    }

    public static void listProducts(){
        for(ProductForSale item : storeProducts){
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty){
        order.add(new OrderItem(qty,storeProducts.get(orderIndex))) ;
    }

    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal = 0;
        for(var orderItem : order){

            orderItem.product().printPricedItem(orderItem.qty());
            salesTotal+= orderItem.product().getSalesPrice(orderItem.qty());

        }
       System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }
}