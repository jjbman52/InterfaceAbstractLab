package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      Jordan Rehbein
 * @version     1.00
 */
public class AdvancedJavaCourse extends Course{
    private double credits;
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        super(courseName, courseNumber);
        this.credits = credits;
        this.prerequisites = prerequisites;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
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
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 3.0 to 5.0");
            System.exit(0);
        }
        this.credits = credits;
    }
}
