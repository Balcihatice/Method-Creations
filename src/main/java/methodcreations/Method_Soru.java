package methodcreations;

public class Method_Soru {

    //iki tane isim al cift karakterliyse ikinci ismi birincinin ortasina yazdir
    // Meh    (ahmet)    met


    public static void main(String[] args) {

        String d = isimler("Mehmet", "Ahmet");

        System.out.println(d);

    }

    public static String isimler(String name1, String name2) {

        int n1L = name1.length();

        String s = name1.length() % 2 == 0 ? (name1.substring(0, n1L / 2) + name2 + name1.substring(n1L / 2)) :

                "Name2 cannot be insert in the name1";

        return s;
    }

}
