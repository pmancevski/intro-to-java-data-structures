package Exercise20_18;

import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) {

    }

    public static long getSize(File file) {
        long size = 0;
        Queue<File> queue = new LinkedList<>(Arrays.asList(file));

        while (!queue.isEmpty()) {
            File temp = queue.poll();

            if (temp.isFile()) {
                size += temp.length();
            }
            else {
                queue.addAll(Arrays.asList(temp.listFiles()));
            }
        }

        return size;
    }
}
