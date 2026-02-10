import java.util.HashMap;
import java.util.Hashtable;
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
    }

    @Override
    public void cikisYap() {

    }
}
