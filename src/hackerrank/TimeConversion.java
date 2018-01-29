package hackerrank;

public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(
            convertTime("12:55:55PM")
        );
    }
    static String convertTime(String time) {
        int hours = Integer.valueOf(time.substring(0,2));
        int minutes = Integer.valueOf(time.substring(3, 5));
        int seconds = Integer.valueOf(time.substring(6,8));
        boolean isPM = time.indexOf("PM") != -1;
        if (isPM && hours != 12)
            hours += 12;
        if (!isPM && hours == 12)
            hours = 0;
        return  String.format("%02d", hours) + ":" +
                String.format("%02d", minutes) + ":" +
                String.format("%02d", seconds);
    }
}
