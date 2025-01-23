import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    
    public LocalDateTime schedule (String appointmentDateDescription) {
        return LocalDateTime.parse(appointmentDateDescription,
            DateTimeFormatter.ofPattern("M/dd/yyyy HH:mm:ss"));
    }
    
    public boolean hasPassed (LocalDateTime appointmentDate) {
        return LocalDateTime.now()
            .isAfter(appointmentDate);
    }
    
    public boolean isAfternoonAppointment (LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        return hour >= 12 && hour < 18;
    }
    
    public String getDescription (LocalDateTime appointmentDate) {
        String formattedDate = getFormattedDate(appointmentDate);
        String formattedTime = getFormattedTime(appointmentDate);
        return "You have an appointment on %s, at %s".formatted(formattedDate, formattedTime);
    }
    
    private static String getFormattedDate (LocalDateTime appointmentDate) {
        return appointmentDate.format(DateTimeFormatter.ofPattern("eeee, MMMM d, yyyy"));
    }
    
    private static String getFormattedTime (LocalDateTime appointmentDate) {
        return appointmentDate.format(DateTimeFormatter.ofPattern("h:mm a."));
    }
    
    public LocalDate getAnniversaryDate () {
        int currentYear = LocalDate.now()
            .getYear();
        return LocalDate.of(currentYear, 9, 15);
    }
}
