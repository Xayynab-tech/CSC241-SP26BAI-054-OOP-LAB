class Task1Demo{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.studentId = "SP26-BAI-005";
        s1.name = "Abeer Amina";
        s1.completedCredits = 15;

        Student s2 = new Student();
        s2.studentId = "SP26-BAI-054";
        s2.name = "Zainab Shahzad";
        s2.completedCredits = 18;

        Student s3 = new Student();
        s3.studentId = "SP26-BAI-012";
        s3.name = "Aliza Choudhary";
        s3.completedCredits = 12;

        System.out.println("Before Change");
        System.out.println(s1.studentId + ": " + s1.name + " - " + s1.completedCredits + " credits");
        System.out.println(s2.studentId + ": " + s2.name + " - " + s2.completedCredits + " credits");
        System.out.println(s3.studentId + ": " + s3.name + " - " + s3.completedCredits + " credits");

        // Increase completedCredits of only s2
        s2.completedCredits += 3;

        System.out.println("\nAfter Increasing s2 completedCredits");
        System.out.println(s1.studentId + ": " + s1.name + " - " + s1.completedCredits + " credits");
        System.out.println(s2.studentId + ": " + s2.name + " - " + s2.completedCredits + " credits");
        System.out.println(s3.studentId + ": " + s3.name + " - " + s3.completedCredits + " credits");

       
    }
}