import java.util.*;

public class Methods implements EntryExitInterface{
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";


    static Scanner input= new Scanner(System.in);
    static int id=1000;
    static HashMap<Integer,Products> urunlerMap= new HashMap<>(); // able to store values and keys empty map has been created


    @Override
    public void girisPaneli() {
        System.out.println(Y + "========================== OPERATIONS =======================\r\n"
                + "   _______________________           _______________________   \n"
                + "   | 1-PRODUCT DEFINITION |          |  2-PRODUCT LIST  | \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯               ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                + "   _____________________              ______________________   \n"
                + "   | 3-PRODUCT ENTRY |                | 4-PRODUCT ON SHELF | \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯               ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                + "   _____________________              ______________________   \n"
                + "   | 5- PRODUCT EXIT  |              |  6-EXIT |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯  " + R);
try {
    System.out.println("Please choose an option you want to proceed ..");
    int option = input.nextInt();

    switch (option) {
        case 1:
            productDefinition();
            break;
        case 2:
            productList();
            break;
        case 3:
            break;
        case 4:
            break;
        case 5:
            break;
        case 6:
            break;
        default:
            System.out.println("Something went wrong");
            break;
    }


}catch (InputMismatchException e){
    System.out.println("It s not a number. Please choose a number to able to proceed!");
}

    }

    private void productList() {

        Set<Map.Entry<Integer,Products>> urunListesi = urunlerMap.entrySet();
        System.out.println("id       product name         producer       quantity       unit         shelf" +
                "\n----------------------------------------------------------------------");

        for(Map.Entry<Integer,Products> avuc:urunListesi) {
            System.out.printf("%d    %-8s       %-14s %3d          %-14s %s"

          ,avuc.getKey()
          ,avuc.getValue().getProductName()
          ,avuc.getValue().getProducter()
          ,avuc.getValue().getQuantity()
          ,avuc.getValue().getUnit()
          ,avuc.getValue().getShelf()
            );
            System.out.println(" ");

        }// end foreach
        System.out.println("You been added your product info succesfully");
        System.out.println("You are directing to the entry panel");
        girisPaneli();
    }

    private void productDefinition() {
        System.out.println("Please enter the products infromation");
        System.out.println("Product name :");
        input.nextLine(); // dumy entry
        String productName = input.nextLine();

        System.out.println("Producer name : ");
        String producer = input.nextLine();

        System.out.println("The unit : ");
        input.next();
        String unit= input.nextLine();


        Products urun = new Products(productName,producer,unit,id);
        urunlerMap.put(id,urun);
        id++;
        System.out.println("Has been added successfully..");
        System.out.println("You are directing to the entry panel");
        girisPaneli();
    }

    @Override
    public void cikisYap() {
        System.out.println("You are exiting the app..");
    }





}
