public class GradesApplication {
    public static void main(String[] args) {
        Grades grade = new Grades();
        grade.add(4);
        grade.add(2);
        grade.add(5);
        double result = grade.getAvgGrade();
        System.out.println("Average grade: " + result);
        double result2 = grade.getLastGrade();
        System.out.println("Last grade: " + result2);

    }
}
