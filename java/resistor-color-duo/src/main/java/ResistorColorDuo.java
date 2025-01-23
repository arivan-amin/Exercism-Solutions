class ResistorColorDuo {
    
    int value (String[] colors) {
        String firstValue = getValueByColor(colors[0]);
        String secondValue = getValueByColor(colors[1]);
        return Integer.parseInt(firstValue + secondValue);
    }
    
    public String getValueByColor (String color) {
        return switch (color) {
            case "black" -> "0";
            case "brown" -> "1";
            case "red" -> "2";
            case "orange" -> "3";
            case "yellow" -> "4";
            case "green" -> "5";
            case "blue" -> "6";
            case "violet" -> "7";
            case "grey" -> "8";
            case "white" -> "9";
            default -> "";
        };
    }
}
