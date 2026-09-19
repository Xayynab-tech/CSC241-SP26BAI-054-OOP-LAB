class Task3Demo {

    // Signature: enroll(String)
    void enroll(String courseCode) {
        System.out.println("Enrolled in course code: " + courseCode);
    }

    // Signature: enroll(String, int)
    void enroll(String courseCode, int section) {
        System.out.println("Enrolled in course: " + courseCode + ", Section: " + section);
    }

    // Signature: enroll(int)
    void enroll(int numericCourseCode) {
        System.out.println("Enrolled in numeric course code: " + numericCourseCode);
    }

    public static void main(String[] args) {
        Task3Demo demo = new Task3Demo();

        // Valid calls
        demo.enroll("CSC241");
        demo.enroll("CSC241", 2);
        demo.enroll(241);

    }
}