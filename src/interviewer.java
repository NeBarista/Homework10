import java.util.Date;

public class interviewer {
    final static int HOW_MANY_PROJECTS_DOES_A_PERSON_HAVE_ON_GITHUB = 33;

    public static void main() {
        printResultOfInterview(" -Interviewer: ", " you have successfully passed the interview");
    }

    static void printResultOfInterview(String speaker, String result) {
        if (HOW_MANY_PROJECTS_DOES_A_PERSON_HAVE_ON_GITHUB > 15) {
            println(speaker + HR.NAME + result);
        } else {
            println(" Sorry, Sergey, you are not suitable for us");
        }
    }

    static void println(String text) {
        System.out.println(new Date() + text);
    }
}


