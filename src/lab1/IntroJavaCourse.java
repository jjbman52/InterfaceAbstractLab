package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      Jordan Rehbein
 * @version     1.00
 */
public class IntroJavaCourse extends Course{
    private double credits;
    private String prerequisites;
    private OutputService outputService = new OutputService();


    public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
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
        if(credits < 0.5 || credits > 4.0) {
            outputService.doOutput("Error: credits must be in the range 0.5 to 4.0");
        }
        this.credits = credits;
    }
}
