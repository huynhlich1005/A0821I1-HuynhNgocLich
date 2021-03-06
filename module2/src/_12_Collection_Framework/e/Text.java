package Collection_Framework.e;

import java.util.List;
import java.util.Scanner;

public class Text {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductService productService= new ProductService();
    public static void main(String[] args) {
        displayMenu();
    }

    static void displayMenu() {
        boolean check = true;

        do {

            System.out.println("1.Add new product \n2. Edit a product\n" +
                    "3. Delete a product \n4. Display list product\n" +
                    "5. Search by name\n6. Sort by price\n7. Exit\n");
            int choice = 0;
            do {
                System.out.println(choice == 0 ? "Input your choice:" : "Please input from 1 to 6: ");
                choice = Integer.parseInt(scanner.nextLine());
            } while (choice <= 0 || choice > 7);

            switch (choice) {
                case 1:
                    create();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    sort();
                    break;
                case 7:
                    check = false;
            }
            if (!check) {
                return;
            }

        } while (true);
    }

    private static void search(){
        System.out.println("Input product name to search: ");
        String name = scanner.nextLine();
        productService.search(name).forEach(System.out::println);
    }

    private static void sort(){
        System.out.println("Do you want sort price by ASC(0) or DESC(1):  ");
        boolean isASC = Boolean.parseBoolean(scanner.nextLine());
        productService.sort(isASC);
    }

    private static void create(){
        inputAndSave(0);
    }

    private static void edit(){
        display();
        System.out.println("Input product id to edit: ");
        int id = Integer.parseInt(scanner.nextLine());
        inputAndSave(id);
    }

    private static void display() {
        List<Product> productList = productService.getAll();
        int size = productList.size();
        for (int i = 0; i < size; i++){
            System.out.println(productList.get(i));
        }
    }

    private static void delete(){
        display();
        System.out.printf("Input product id to edit: ");
        int id = Integer.parseInt(scanner.nextLine());
        inputAndSave(id);
    }

    private static void inputAndSave(int id) {
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Price: ");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, price);
        productService.save(product);
        System.out.println(id> 0 ? "Updated successful": "Created successful");
    }
}
