public class Manager {
    public static void Main() {
        printData(" -Manager: ", "25.08.2022", "17:30");
        interviewer.main();
    }

    static void printData(String speaker, String data, String time) {
        interviewer.println(speaker + HR.NAME + " date of the interview " + data + " time of the interview " + time);
    }
}

