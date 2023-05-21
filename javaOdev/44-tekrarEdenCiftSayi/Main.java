public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 2, 3, 4, 4, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10, 10};

        System.out.println("Repeated even numbers in the array: ");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                boolean isRepeated = false;
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        isRepeated = true;
                        break;
                    }
                }
                if (isRepeated) {
                    boolean isPrintedBefore = false;
                    for (int k = 0; k < i; k++) {
                        if (numbers[i] == numbers[k]) {
                            isPrintedBefore = true;
                            break;
                        }
                    }
                    if (!isPrintedBefore) {
                        System.out.println(numbers[i]);
                    }
                }
            }
        }
    }
}
