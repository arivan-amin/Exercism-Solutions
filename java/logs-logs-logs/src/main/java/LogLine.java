public class LogLine {
    
    private final String logLine;
    
    public LogLine (String logLine) {
        this.logLine = logLine;
    }
    
    public String getOutputForShortLog () {
        LogLevel logLevel = getLogLevel();
        String levelCode = switch (logLevel) {
            case UNKNOWN -> "0";
            case TRACE -> "1";
            case DEBUG -> "2";
            case INFO -> "4";
            case WARNING -> "5";
            case ERROR -> "6";
            case FATAL -> "42";
        };
        return "%s:%s".formatted(levelCode, logLine.substring(logLine.indexOf(":") + 1)
            .trim());
    }
    
    public LogLevel getLogLevel () {
        String levelShortCode = logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]"));
        return switch (levelShortCode) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }
}
