package Lecutre5Lists.exersice;

        import java.util.Arrays;
        import java.util.List;
        import java.util.Scanner;
        import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        List<String> text = Arrays.stream(scanner.nextLine().split(""))
                .collect(Collectors.toList());

        String result = "";
        for (int i = 0; i < nums.size(); i++) {

            int sum = 0;
            int current = nums.get(i);
            for (int j = 0; j < nums.get(i).toString().length(); j++) {
                sum += current % 10;
                current /= 10;
            }
            while (sum > text.size()) {
                sum -= text.size();
            }
            result += text.get(sum);
            text.remove(sum);
        }
        System.out.println(result);
    }
}
