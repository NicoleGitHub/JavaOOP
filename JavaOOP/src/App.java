import model.Student;

public class App {
   public static void main(String [] args) {
      Student student = new Student("nicole", 100, "female", "12345678");
      System.out.println("name:" + student.getName() +
              "\nage:" + student.getAge() +
              "\ngender:" + student.getGender() +
              "\nid:" + student.getId());
   }
}