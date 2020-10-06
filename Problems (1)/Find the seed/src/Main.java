import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");
        int a = Integer.parseInt(inputArr[0]);
        int b = Integer.parseInt(inputArr[1]);
        int n = Integer.parseInt(inputArr[2]);
        int k = Integer.parseInt(inputArr[3]);

        Map<Integer, Integer> map = new HashMap<>();
        int[] arrOfMins = new int[b - a + 1];
        int[] temp = new int[n];
        int l = 0;
        int min = Integer.MAX_VALUE;
        int seed = 0;
        for (int i = a; i <= b; i++) {
            Random random = new Random(i);
            for (int j = 0; j < n; j++) {
                temp[j] = random.nextInt(k);
            }
            Arrays.sort(temp);
            int currentMin = temp[temp.length -1];
            arrOfMins[l] = currentMin;
            l++;
            map.put(i, currentMin);
            if (currentMin < min) {
                min = currentMin;
                seed = i;
            }
        }
        Arrays.sort(arrOfMins);

        int result = arrOfMins[0];
        System.out.println(seed + "\n" + result);

    }
}