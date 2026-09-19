class Student {
 	String studentId;
	String name;
	int completedCredits;

	void addCredits(int c) { completedCredits += c; }
	int remainingCredits(int total) {
     return total - completedCredits;
	}
	String summary() {
        return "ID: " + studentId + " | Name: " + name + " | Credits: " + completedCredits;
	}
}