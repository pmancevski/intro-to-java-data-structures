package Exercise20_20;

import java.io.File;
import java.util.*;

public class App {
    public static void main(String[] args) {

        System.out.print("Enter a directory or a file: ");
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        String directory = input.nextLine();

        System.out.println(getSize(new File(directory)) + " bytes");
    }

    public static long getSize(File file) {
        long size = 0;
        Stack<File> list = new Stack<>();
        list.add(file);

        while (!list.isEmpty()) {
            File temp = list.removeLast();

            if (temp.isFile()) {
                size += temp.length();
            } else {
                list.addAll(Arrays.asList(Objects.requireNonNull(temp.listFiles())));
            }
        }

        return size;
    }
}
