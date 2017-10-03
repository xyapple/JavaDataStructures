package Clone;

public class StudentListCloneTest extends StudentManagement{
    public static void main(String[] args) {
    SinglyLinkedList<Student> studentList = new SinglyLinkedList<>();
        Student student1 = new Student("1", "1", "1", 1, "1", 1);
        Student student2 = new Student("2", "2", "2", 2, "2", 2);
        Student student3 = new Student("3", "3", "3", 3, "3", 3);
        Student student4 = new Student("4", "4", "4", 4, "4", 4);
        Student student5 = new Student("5", "5", "5", 5, "5", 5);
        studentList.addFirst(student1);
        studentList.addFirst(student2);
        studentList.addFirst(student3);
        studentList.addFirst(student4);
        studentList.addFirst(student5);
        
    SinglyLinkedList<Student> studentListClone = new SinglyLinkedList<>();
        studentListClone= copyStudentList(studentList);
       
        System.out.println("studentList " + studentList);
        System.out.println("studentListClone " + studentListClone);
    }
    
}
