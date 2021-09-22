
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utils {

    public int getcube(int num)
    {
        return num * num * num;
    }

    public static boolean getPrime(int n)
    {
        for (int i = 2; i < n; i++) {
            if (n % i == 0);
            {
                return false;
            }
        }
        return true;

    }

    int getText(String flName) {
        int num;
        Scanner sc = new Scanner(new (flName));
        num = sc.nextInt();
        return num;

    }

}
