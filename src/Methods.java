import java.util.HashMap;
import java.util.Hashtable;
import java.util.InputMismatchException;
import java.util.Scanner;

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
        System.out.println(Y + "========================== İŞLEMLER =======================\r\n"
                + "   ____________________              ____________________   \n"
                + "   | 1-URUN TANIMLAMA |              |  2-URUN LİSTELE  |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                + "   ____________________              ____________________   \n"
                + "   | 3-URUN GIRISI    |              |  4-URUN RAFA KOY |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                + "   ____________________              ____________________   \n"
                + "   | 5-URUN CIKISI    |              |  6-BITIRME       |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯  " + R);


        System.out.println("Yapmak istediginiz islemi seciniz");
       try {


           int secim = input.nextInt();

           switch (secim) {
               case 1:
                   urunTanimlama();
                   break;
               case 2:
                   System.out.println();
                   break;
               case 3:
                   System.out.println();
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
           input.nextLine(); // dumy : hayalet komut.. Aabir bos komut aciyorum ki yeni komuta girebilsin pattern erro vermesin
           girisPaneli();
       }
    }

    private void urunTanimlama() {
    }

    @Override
    public void cikisYap() {
        System.out.println("App ten cikisiniz yapildi");
    }
}
