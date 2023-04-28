import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(",");
        int sum = Arrays.stream(strArr).mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
    }
}
