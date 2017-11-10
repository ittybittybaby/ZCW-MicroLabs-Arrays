package io.zipcoder.microlabs.arrays;

public class ArrayParty {

    public String printArray(String[] inputArray){
        StringBuilder outputString = new StringBuilder();
        for (String str : inputArray) {
            outputString.append("\n" +str);
        }
        return outputString.toString();
    }

    public String lastElement(String[] inputArray){
        return inputArray[inputArray.length - 1];
    }

    public String lastButOne(String[] inputArray) {
        return inputArray[inputArray.length - 2];
    }

    public String reverse(String[] inputArray) {
        StringBuilder outputString = new StringBuilder();
        for(int i = inputArray.length - 1; i >= 0 ; i--) {
            outputString.append("\n" + inputArray[i]);
        }
        return outputString.toString();
    }

    //TODO Define the method isPalindrome
    public String isPalindrome(String[] inputArray) {
        int j = inputArray.length - 1;
        String isPalindrome = "False";

        for(int i = 0; i <= j; i++) {
            if(inputArray[i].equals(inputArray[j])) {
                isPalindrome = "True";
            }
            else {
                isPalindrome = "False";
                break;
            }
            j--;
        }

        return isPalindrome;
        //        String isPalindrome = "False";
//
//        for(String str : inputArray) {
//            StringBuilder reversed = new StringBuilder(str).reverse();
//            if(str.equals(reversed.toString())){
//                isPalindrome = "True";
//            }
//        }
    }

    public String compress(int[] inputArray) {
        Integer nSub1 = inputArray[0];
        Integer n;

        StringBuilder outputString = new StringBuilder();
        outputString.append(nSub1);

        for (int i = 1; i <= inputArray.length - 1; i++) {
            n = inputArray[i];
            if(n != nSub1) {
                outputString.append("\n" + n);
                nSub1 = n;
            }
        }
        return outputString.toString();
    }

    public String pack(Character[] inputArray) {
        StringBuilder outputString = new StringBuilder();
        StringBuilder word = new StringBuilder();

        Character nSub1 = inputArray[0];
        Character n;
        word.append(nSub1);

        for(int i = 1; i <= inputArray.length - 1; i++) {
            n = inputArray[i];
            if(n.equals(nSub1)) {
                word.append(n);
                nSub1 = n;
            }
            else {
                outputString.append(word + ", ");
                word = new StringBuilder();
                word.append(n);
                nSub1 = n;
            }
        }
        outputString.append(word);

        return outputString.toString();
    }



}
