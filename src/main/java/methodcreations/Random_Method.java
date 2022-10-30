package methodcreations;

public class Random_Method {
    // Example: 20 elemanlı bir dizi(Arrays) tanımlayın ve içini Random sınıfını kullanarak 0 ile 50 arasında
    // rastgele sayılar ile doldurun. Oluşun dizide kaç tek ve kaç çift sayı olduğunu bulan algoritma yazın.


    public static void main(String[] args) {

        counter(1, 0, 50);

    }

    public static void counter(int number1, int number2, int target) {

        for (int i = 0; i < target; i++) {

            int random = (int) ((Math.random() * target));

            System.out.println(random);

            if (random == number1) {

                number1++;

            } else if (random == number2) {

                number2++;
            }

        }

        System.out.println("number1 count : " + number1 + " ,number2 count : " + number2);


    }
}