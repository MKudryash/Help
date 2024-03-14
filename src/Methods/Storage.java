package Methods;

import Models.Students;

import java.util.ArrayList;

public class Storage {
    private ArrayList<Students> studentsArrayList;

    public Storage(ArrayList<Students> studentsArrayList) {
        this.studentsArrayList = studentsArrayList;
    }

    public void addElement(Students students) {
        studentsArrayList.add(students);
    }

    public void printStudents() {
        for (Students student : studentsArrayList)
            System.out.printf("Student{" +
                    "Id = " + student.getId_student() +
                    ", Surname = '" + student.getSurname() + '\'' +
                    ", Name = '" + student.getName() + '\'' +
                    ", Group = '" + student.getGroup() + '\'' +
                    ", Department = '" + student.getDepartment() + '\'' +
                    ", Discipline = '" + student.getDiscipline() + '\'' +
                    ", Mark = " + student.getMark() +
                    ", TeacherName = '" + student.getNameTeacher() + '\'' +
                    '}');
    }


    public ArrayList<Students> getStudentsArrayList() {
        return studentsArrayList;
    }

    public void setStudentsArrayList(ArrayList<Students> studentsArrayList) {
        this.studentsArrayList = studentsArrayList;
    }
}
