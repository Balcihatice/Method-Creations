package methodcreations;

public class isimSoyIsimDuzenlemeMetodu {

    /*
   Kullanicidan ayri ayri isim ve soy isim aliniz
   Isim ve soyisim ilk harfler buyuk ve isim bosluk soyisim seklinde
   bize donduren metodu olusturalim
    */
    public static void main(String[] args) {

        String isim = "Hasan";
        String soyIsim = "Huseyinoglu";
        System.out.println(isimSoyisimduzenle(isim, soyIsim));

        System.out.println(isimSoyisimduzenle("Kadir", "Akar"));
    }

    public static String isimSoyisimduzenle(String isim, String soyIsim) {

        String newIsimSoyIsim = isim.substring(0, 1).toUpperCase() +
                isim.substring(1).toLowerCase() +
                " " +
                soyIsim.substring(0, 1).toUpperCase() +
                soyIsim.substring(1).toLowerCase();

        return newIsimSoyIsim;
    }
}
