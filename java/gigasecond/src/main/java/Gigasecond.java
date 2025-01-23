import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {
    
    public static final int GIGA_SECONDS = 1_000_000_000;
    
    LocalDateTime birthDate;
    
    Gigasecond (LocalDate birthDate) {
        this.birthDate = birthDate.atStartOfDay();
    }
    
    Gigasecond (LocalDateTime birthDateTime) {
        birthDate = birthDateTime;
    }
    
    LocalDateTime getDateTime () {
        return birthDate.plusSeconds(GIGA_SECONDS);
    }
}
