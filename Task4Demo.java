class Task4Demo {

    void changeNumber(int x) {
        x = 99;
        System.out.println("Inside changeNumber: x = " + x);
    }

    void changeStudent(Student st) {
        st.completedCredits = 99;
        System.out.println("Inside changeStudent: st.completedCredits = " + st.completedCredits);
    }

    void replaceStudent(Student st) {
        st = new Student();
        st.name = "Temporary";
        st.completedCredits = 50;
        System.out.println("Inside replaceStudent: st.name = " + st.name);
    }

    public static void main(String[] args) {
        Task4Demo demo = new Task4Demo();

        // Experiment A
        System.out.println("Experiment A: Primitive");
        int num = 10;
        System.out.println("Before: num = " + num);
        demo.changeNumber(num);
        System.out.println("After: num = " + num);

        // Experiment B
        System.out.println("\nExperiment B: Object Mutation");
        Student s1 = new Student();
        s1.name = "Abeer";
        s1.completedCredits = 20;
        System.out.println("Before: completedCredits = " + s1.completedCredits);
        demo.changeStudent(s1);
        System.out.println("After: completedCredits = " + s1.completedCredits);

        // Experiment C
        System.out.println("\nExperiment C: Object Reassignment");
        Student s2 = new Student();
        s2.name = "Ali";
        s2.completedCredits = 30;
        System.out.println("Before: name = " + s2.name);
        demo.replaceStudent(s2);
        System.out.println("After: name = " + s2.name);

       
    }
}