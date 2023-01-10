package AssignmentTasks;

import inheritance.Result;

class Application extends Result {
    static String appName;
    static double appVersion;
    static {
        appName = "Java_Application";
        appVersion = 17.5;
    }
}

public class Task090123 extends Application {
    public static void main(String[] args) {
        System.out.println("appName "+ Application.appName);
        System.out.println("appVersion "+ appVersion);
        appName = "SampleJava";
        appVersion=17;
        System.out.println("appName "+ appName);
        System.out.println("appVersion "+ Application.appVersion);

        Result res = new Result();
        res.calculateStudentResult();
        Result res1 = new Result();
        res1.calculateStudentResult();

    }
}
