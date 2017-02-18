package lab2;

import java.util.ArrayList;
import java.util.List;

public class College {
    private List<Course> courses;
    
    public College(){
        courses = new ArrayList();
    }
    
    public void addCourse(Course course){
        courses.add(course);
        System.out.println("Course has been added.");
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
