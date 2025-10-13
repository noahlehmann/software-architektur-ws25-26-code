package idioms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        String path = "test.txt";
        tryCatchFinally(path);
        tryWithResources(path);
    }

    private static void tryCatchFinally(String path) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(path));
            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.err.println("Fehler beim Lesen: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    private static void tryWithResources(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.err.println("Fehler beim Lesen: " + e.getMessage());
        }
    }
}