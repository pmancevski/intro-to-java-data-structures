import java.util.*;

public class Exercise21_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        Map<Integer, Integer> map = new TreeMap<>();

        System.out.print("Enter integers (for exit enter 0): ");
        int value = 1;

        do {
            value = input.nextInt();

            if (value != 0) {
                map.put(value, map.getOrDefault(value, 0) + 1);
            }
        }
        while (value != 0);

        int max = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }

        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                list.add(entry);
            }
        }

        for (Map.Entry<Integer, Integer> entry : list) {
            System.out.println("Key: " + entry.getKey() + " - Occur: " + entry.getValue() + " time(s)");
        }
    }
}
