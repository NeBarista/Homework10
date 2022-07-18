public class HR {
    static final String NAME = "Sergey";
    static final int yearsInCoding = 2;

    static int salary = 100_000;

    public static void main() {
        printBegin(" -HR: ", "seat");
        ResultDialogueWithHR(" -HR: ", "hired");
        Manager.Main();
        ResultOfInterview(" -HR: ", "you are accepted into the company");
    }


    static void printBegin(String speaker, String decision) {
        if (salary > 75_000) {
            interviewer.println(" Hello, my name is Sergey, I came for an interview");
            interviewer.println(speaker + "Hello, " + NAME + " have a " + decision);
        } else {
            System.out.println("I will not take this position");
        }
    }

    static void ResultDialogueWithHR(String speaker, String decision) {
        if (yearsInCoding > 1) {
            interviewer.println(speaker + NAME + " you have a " + decision);
        } else {
            interviewer.println("Sorry, Sergey, you are not suitable for us");
        }
    }

    public static void ResultOfInterview(String speaker, String decision) {
        interviewer.println(speaker + " " + NAME + " " + decision);
    }
}



