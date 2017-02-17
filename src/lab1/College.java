package lab1;

import java.util.ArrayList;
import java.util.List;

public class College {
    private List<Course> courses;
    
    public College(){
        courses = new ArrayList();
    }
    
    public void addCourse(Course course){
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
