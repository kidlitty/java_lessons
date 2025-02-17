public class DayType {
    public static String getDayType(String day) {
        if (day == null) {
            return "Null not allowed";
        }

        return switch (day.toLowerCase()) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> {
                yield "Weekday"; 
            }
            case "saturday", "sunday" -> {
                yield "Weekend";
            }
            default -> {
                yield "Invalid day";
            }
        };
    }
    public static void main(String[] args) {
        System.out.println(getDayType(null));
    }
}
