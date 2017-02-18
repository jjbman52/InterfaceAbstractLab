package lab2;

/**
 *
 * @author jordanrehbein
 */
public abstract class ProgrammingCourse implements Course{
    private String courseCategory;
    private String courseName;
    private String courseNumber;
    private double credits;
    private OutputService outputService = new OutputService();
    
    @Override
    public String getCourseCategory(){
        return courseCategory;
    }
    
    @Override
    public final void setCourseCategory(String courseCategory){
        if(courseCategory == null || courseCategory.length() == 0) {
            outputService.doOutput("Error: courseCategory cannot be null of empty string");
        }
        this.courseCategory = courseCategory;
    }

    @Override
    public String getCourseName() {
        return courseName;
    }
    
    @Override
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            outputService.doOutput("Error: courseName cannot be null of empty string");
        }
        this.courseName = courseName;
    }
    
    @Override
    public String getCourseNumber() {
        return courseNumber;
    }
    
    @Override
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            outputService.doOutput("Error: courseNumber cannot be null of empty string");
        }
        this.courseNumber = courseNumber;
    }
    
    @Override
    public double getCredits() {
        return credits;
    }
    
    @Override
    public abstract void setCredits(double credits);
}
