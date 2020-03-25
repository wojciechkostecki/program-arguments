import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();

        for (String arg : args) {
            numbersList.add(Integer.parseInt(arg));
        }

        System.out.println(numbersList.size());
        System.out.println(numbersList);

        squaredNumbers(numbersList);

        printAllNumbersAndSumNumbers(numbersList);
    }

    private static void squaredNumbers(List<Integer> list) {
        List<Integer> squared = list.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println(squared);
    }

    private static void printAllNumbersAndSumNumbers(List<Integer> list) {
        StringBuilder stringBuilder = new StringBuilder();
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            sum += integer;
            stringBuilder.append(integer);

            if (i < list.size() - 1) {
                stringBuilder.append(" + ");
            } else {
                stringBuilder.append(" = ").append(sum);
            }
        }
        System.out.println(stringBuilder);
    }
}
