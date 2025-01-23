class ReverseString {
    
    String reverse (String inputString) {
        if (inputString.isEmpty()) {
            return "";
        }
        String reversedString = "";
        for (int length = inputString.length() - 1; length >= 0; length--) {
            reversedString += inputString.charAt(length);
        }
        return reversedString;
    }
}
