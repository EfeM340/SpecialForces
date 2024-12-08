import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        handleNames();
        handleRandomNumbers();
        handleSorting();
    }

    public static void handleNames() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Burak");
        names.add("Ahmet");
        names.add("Semih");
        names.add("Hadise");
        names.add("Ela");
        names.add("Toprak");
        names.add("Scarlet");
        names.add("Jessica");
        names.add("Selin");
        names.add("Emre");

        System.out.println("İsimler: " + names);

        names.set(2, "Zeynep");
        System.out.println("Güncellenmiş İsimler: " + names);

        names.remove(4);
        System.out.println("Eleman Çıkardıktan Sonra: " + names);

        for (int i = 0; i < names.size(); i++) {
            names.set(i, names.get(i).toUpperCase());
        }
        System.out.println("Büyük Harfle İsimler: " + names);
    }

    public static void handleRandomNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add((int) (Math.random() * 101));
        numbers.add((int) (Math.random() * 101));
        numbers.add((int) (Math.random() * 101));

        System.out.println("Rastgele Sayılar: " + numbers);

        int toplam = numbers.get(0) + numbers.get(1) + numbers.get(2);
        double ortalama = toplam / 3.0;
        int max = Math.max(numbers.get(0), Math.max(numbers.get(1), numbers.get(2)));
//buralarda ufak yardım almış olabilmle ihtimaline ssahip olabilirim ama ufacık minnacık
        System.out.println("Toplam: " + toplam);
        System.out.println("Ortalama: " + ortalama);
        System.out.println("Max: " + max);
    }

    public static void handleSorting() {
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            randomNumbers.add((int) (Math.random() * 100) + 1);
        }

        System.out.println("Rastgele Sayılar: " + randomNumbers);

        Collections.sort(randomNumbers);
        System.out.println("Sıralanmış Sayılar: " + randomNumbers);
    }
}
