package readfile;
import java.io.*;

import java.util.*;

public class ReadFile { 

    public static String reverse(String word) {

        String str = "";

        for (int i = word.length() - 1; i >= 0; i--) {

            str += word.charAt(i);

        }

        return str;

    }

    public static void main(String[] args) throws IOException {

        ArrayList<String> al = new ArrayList<String>();

        File file = new File("file.txt");

        Scanner sc = new Scanner(file);

        String data = "";

        while (sc.hasNextLine()) {

            data = data + sc.nextLine();

        }

        String arr[] = data.split(" ");

        for (int i = 0; i < arr.length; i++) {

            int c = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i].equals(arr[j]))

                    c++;

            }

            if ((c - 1 >= 5) && arr[i].length() > 3) {

                if (!al.contains(reverse(arr[i])))

                    al.add(reverse(arr[i]));

            }

        }

        for (String i : al)

            System.out.print(i + " ");

        sc.close();

    }

}
