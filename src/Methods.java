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

    }

    @Override
    public void cikisYap() {

    }
}
