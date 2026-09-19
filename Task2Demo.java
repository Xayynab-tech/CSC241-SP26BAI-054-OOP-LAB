class Task2Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.studentId = "SP26-BAI-005";
        s1.name = "Abeer Amina";
        s1.completedCredits = 30;

        Student s2 = new Student();
        s2.studentId = "SP26-BAI-054";
        s2.name = "Zainab Shahzad";
        s2.completedCredits = 45;

        //adding credits
        s1.addCredits(4);
        s2.addCredits(3);

        //showing remaining credits
        int s1Remaining = s1.remainingCredits(130);
        int s2Remaining = s2.remainingCredits(130);

        //printing summaries
        System.out.println(s1.summary() + " | Remaining: " + s1Remaining);
        System.out.println(s2.summary() + " | Remaining: " + s2Remaining);
    }
}