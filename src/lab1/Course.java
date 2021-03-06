package lab1;

public abstract class Course{
    private String courseName;
    private String courseNumber;
    private double credits;
    private OutputService outputService = new OutputService();

    public String getCourseName() {
        return courseName;
    }
    
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            outputService.doOutput("Error: courseName cannot be null of empty string");
        }
        this.courseName = courseName;
    }
    
    public String getCourseNumber() {
        return courseNumber;
    }
    
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            outputService.doOutput("Error: courseNumber cannot be null of empty string");
        }
        this.courseNumber = courseNumber;
    }
    
    public double getCredits() {
        return credits;
    }
    
    public abstract void setCredits(double credits);
}
