package lab2;

/**
 * Describe responsibilities here.
 *
 * @author      Jordan Rehbein
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse{
    private double credits;
    private String prerequisites;
    private OutputService outputService = new OutputService();


    public AdvancedJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
        this.credits = credits;
        this.prerequisites = prerequisites;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            outputService.doOutput("Error: prerequisites cannot be null of empty string");
        }
        this.prerequisites = prerequisites;
    }

    @Override
    public double getCredits() {
        return credits;
    }

    @Override
    public void setCredits(double credits) {
        if(credits < 3.0 || credits > 5.0) {
            outputService.doOutput("Error: credits must be in the range 3.0 to 5.0");
        }
        this.credits = credits;
    }
}
