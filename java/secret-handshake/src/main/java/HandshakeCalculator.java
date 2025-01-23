import java.util.ArrayList;
import java.util.List;

class HandshakeCalculator {
    
    List<Signal> calculateHandshake (int number) {
        List<Signal> signals = new ArrayList<>();
        
        String binaryString = String.format("%5s", Integer.toBinaryString(number))
            .replaceAll(" ", "0");
        
        if (binaryString.charAt(binaryString.length() - 1) == '1') {
            signals.add(Signal.WINK);
        }
        if (binaryString.charAt(binaryString.length() - 2) == '1') {
            signals.add(Signal.DOUBLE_BLINK);
        }
        if (binaryString.charAt(binaryString.length() - 3) == '1') {
            signals.add(Signal.CLOSE_YOUR_EYES);
        }
        if (binaryString.charAt(binaryString.length() - 4) == '1') {
            signals.add(Signal.JUMP);
        }
        if (binaryString.charAt(binaryString.length() - 5) == '1') {
            signals = signals.reversed();
        }
        return signals;
    }
}
