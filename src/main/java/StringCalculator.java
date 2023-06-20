public class StringCalculator {
    public static int add(String numbers) {
        int returnValue=0;
        String[] numbersArray = numbers.split(",|\n");
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        } else {
            for (String number : numbersArray) {
                if (!number.trim().isEmpty()) {
                    int num = Integer.parseInt(number.trim()); // number to add to returnValue. If it is not a number, parseInt will throw an exception
                    if (num < 0) {
                        throw new IllegalArgumentException();
                    }
                    // Add element of numbersArray if it is less than 1000.
                    if (num < 1000) {
                        returnValue+=num;
                    }
                }
            }
        }
        return returnValue;

    }
}
