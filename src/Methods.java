import java.util.*;

public class Methods implements GirisCikisInterface {
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";
    static Scanner input= new Scanner(System.in);
    static int id=1000;
    static HashMap<Integer,Products> urunlerMap=new HashMap<>(); // urunler obkesini store edecek bos map


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


        System.out.println("Yapmak istediginiz islemi seciniz");
       try {

           int secim = input.nextInt();

           switch (secim) {
               case 1:
                   productDefinition();
                   break;
               case 2:
                   productList();
                   break;
               case 3:
                   productEntry();
                   break;
               case 4:
                   System.out.println();
                   break;
               case 5:
                   System.out.println();
                   break;
               case 6:
                   System.out.println();
                   break;

               default:
                   System.out.println("hatali giris yaptiniz tekrar deneyin");
                   break;
           }
       }catch (InputMismatchException e){
           System.out.println("Sayi disinda bir karakter girilemez");
           input.nextLine(); // dumy : hayalet komut.. bir bos komut aciyorum ki yeni komuta girebilsin pattern erro vermesin
           girisPaneli();
       }
    }

    private void productEntry() {
        System.out.println("Enter the product id :");
        int arananId = input.nextInt();
        if(urunlerMap.containsKey(arananId)) {
            System.out.println("Enter the product quantity : ");
            int quantity= input.nextInt();

            urunlerMap.get(arananId).setMiktar(quantity+urunlerMap.get(arananId).getMiktar());

        }else System.out.println("The product you are searching cant found..");
        System.out.println("You are being redirected back to the main menu...");
        girisPaneli();
    }

    private void productList() {
   Set<Map.Entry<Integer,Products>> urunlerSet=urunlerMap.entrySet(); // urunTanimlama meth ile urunlerMap e atilan objler depolanacagi set tanimlandi
    // entrySet yaparak valuelari alirim

        System.out.println("Id       Name       Producter       Quantity       Unit       Shelf" +
                "\n----------------------------------------------------------------------");

    for (Map.Entry<Integer,Products>avuc: urunlerSet) {
        System.out.printf("%d    %-8s       %-14s %3d          %-14s %s"
        ,       avuc.getKey(),  avuc.getValue().getProductName(),
                avuc.getValue().getProducter(),  avuc.getValue().getMiktar(),
                avuc.getValue().getBirim(), avuc.getValue().getRaf()
        );}
    }

    private void productDefinition() {
        System.out.print("Enter the product information");

        System.out.print("Enter the name of product :");
        input.nextLine();
        String urunIsmi=input.nextLine();
        System.out.print("Enter the name of producter :");
        input.next();
        String producter= input.nextLine();
        System.out.print("Enter product unit : ");
        String birim=input.nextLine();
    Products urun = new Products(id,urunIsmi,producter,birim);
    urunlerMap.put(id,urun);
    id++;
        System.out.println("Product information has been successfully recorded!");
        System.out.println("You are being redirected back to the main menu...");
        girisPaneli();
    }

    @Override
    public void cikisYap() {
        System.out.println("You are exiting from app...");
    }
}
