import java.util.List;
import java.util.Set;

public class WaveDrawer {

    private static final int WAVE_PERIOD = 15;
    private static final int WAVE_HEIGHT = 4;
    private static final int WAVE_LENGTH = 30;

    public static void main(String[] args) {
        draw();
    }

    private static void draw() {
        for (int i = 0; i < WAVE_HEIGHT; i++) {
            drawLine(Set.copyOf(List.of(i, 7 - i, 8 + i, 14 - i)));
        }
    }

    private static void drawLine(Set<Integer> remainders) {
        for (int i = 0; i < WAVE_LENGTH; i++) {
            int remainder = i % WAVE_PERIOD;
            if (remainders.contains(remainder))
                System.out.print("*");
            else
                System.out.print(".");
        }
        System.out.println();
    }
}
