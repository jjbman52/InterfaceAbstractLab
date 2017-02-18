package lab2;

import java.util.List;

public class Startup {
    public static void main(String[] args) {
        College college = new College();
        String programmingCourse = "Programming";
        
        IntroToProgrammingCourse itp = new IntroToProgrammingCourse("Intro to Programming", "1111", 2);
        itp.setCourseCategory(programmingCourse);
        
        college.addCourse(itp);
        
        IntroJavaCourse ijc = new IntroJavaCourse("Intro to Java Programming", "2222", 3, "Intro to Programming");
        ijc.setCourseCategory(programmingCourse);
        
        college.addCourse(ijc);
        
        AdvancedJavaCourse ajc = new AdvancedJavaCourse("Advanced Java Programming", "3333", 4, "Intro to Java Programming");
        ajc.setCourseCategory(programmingCourse);
        
        college.addCourse(ajc);
        
        List<Course> courses = college.getCourses();
        
        for(Course c: courses){
            System.out.println("Category: " + c.getCourseCategory());
            System.out.println("Name: " + c.getCourseName());
            System.out.println("Number: " + c.getCourseNumber());
            System.out.println("Credits: " + c.getCredits());
        }
    }
}
