public class LogLevels {
    
    public static String message (String logLine) {
        return getLogMessage(logLine);
    }
    
    private static String getLogMessage (String logLine) {
        return logLine.substring(logLine.indexOf(":") + 1)
            .trim();
    }
    
    public static String logLevel (String logLine) {
        return getLogLevel(logLine);
    }
    
    private static String getLogLevel (String logLine) {
        return logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]"))
            .toLowerCase();
    }
    
    public static String reformat (String logLine) {
        String level = getLogLevel(logLine);
        String message = getLogMessage(logLine);
        return "%s (%s)".formatted(message, level);
    }
}
