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
                   urunListele();
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

    private void urunListele() {
   Set<Map.Entry<Integer,Products>> urunlerSet=urunlerMap.entrySet(); // urunTanimlama meth ile urunlerMap e atilan objler depolanacagi set tanimlandi
    // entrySet yaparak valuelari alirim

        System.out.println("id       ismi         ureticisi       miktari       birimi         raf" +
                "\n----------------------------------------------------------------------");

    for (Map.Entry<Integer,Products>avuc: urunlerSet) {
        System.out.printf("%d    %-8s       %-14s %3d          %-14s %s"
        ,       avuc.getKey(),  avuc.getValue().getProductName(),
                avuc.getValue().getProducter(),  avuc.getValue().getMiktar(),
                avuc.getValue().getBirim(), avuc.getValue().getRaf()
        );}
    }

    private void urunTanimlama() {
        System.out.print("Urun bilgileri giriniz: ");

        System.out.print("Urun ismi giriniz:");
        input.next();
        String urunIsmi=input.nextLine();
        System.out.print("Uretici ismi giriniz :");
        input.next();
        String producter= input.nextLine();
        System.out.print("Urun birimi giriniz: ");
        input.next
                ();
        String birim=input.nextLine();
    Products urun = new Products(id,urunIsmi,producter,birim);
    urunlerMap.put(id,urun);
    id++;
        System.out.println("Urun bilgileri basariyla isleme alindi!");
        System.out.println("Tekrar giris paneline yonlendiriliyorsunuz...");
        girisPaneli();
    }

    @Override
    public void cikisYap() {
        System.out.println("App ten cikisiniz yapildi");
    }
}
