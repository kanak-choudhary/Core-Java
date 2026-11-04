
class gradeMarks {

    public static void main(String[] args) {

       
        int stdMarks =155;
        if (stdMarks >= 0 && stdMarks <= 100) {

            if (stdMarks >= 75) {
                System.out.println("Student got 'A' Grade");
            } else if (stdMarks >= 65) {
                System.out.println("Student got 'B' Grade");
            } else if (stdMarks >= 45) {
                System.out.println("Student got 'C' Grade");
            } else if (stdMarks >= 33) {
                System.out.println("Student got 'D' Grade");
            } 

        }
        else {
                System.out.println("Invalid marks");
            }

    }
}
