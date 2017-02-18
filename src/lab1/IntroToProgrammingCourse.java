package lab1;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      Jordan Rehbein
 * @version     1.00
 */
public class IntroToProgrammingCourse extends Course{
    private double credits;
    private OutputService outputService = new OutputService();


    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
        this.credits = credits;
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
