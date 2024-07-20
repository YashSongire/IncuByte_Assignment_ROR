package com.example;

public class StringCalculator {
    public int add(String numbers) throws Exception {
        // Empty String 
        if (numbers.isEmpty()) {
            return 0;
        }

        //  Inline Delimter 
        String delimiter = ",";
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterIndex);
            numbers = numbers.substring(delimiterIndex + 1);
        }

        // 
        String[] numberArray = numbers.split("[," + delimiter + "\n]");
        int sum = 0;
        StringBuilder negativeNumbers = new StringBuilder();

        // Iteration of Numbers from String Array
        for (String number : numberArray) {
            int num = Integer.parseInt(number);
            if (num < 0) {
                negativeNumbers.append(num).append(",");
            } else {
                sum += num;
            }
        }

        // Negative Number Exception Handling 
        if (negativeNumbers.length() > 0) {
            throw new Exception("negative numbers not allowed " + negativeNumbers.toString().replaceAll(",$", ""));
        }

        return sum;
    }
}