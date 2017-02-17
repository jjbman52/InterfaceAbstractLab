package lab1;

public class Startup {
    public static void main(String[] args) {
        College college = new College();
        IntroToProgrammingCourse itp = new IntroToProgrammingCourse("Intro to Programming", "2222");
        itp.setCredits(2);
        
        college.addCourse(itp);
        
        IntroJavaCourse ijc = new IntroJavaCourse("Intro to Java Programming", "1111");
        ijc.setCredits(0);
        
        college.addCourse(ijc);
        
        AdvancedJavaCourse ajc = new AdvancedJavaCourse("Advanced Java Programming", "3333");
        ajc.setCredits(4);
        
        college.addCourse(ajc);
    }
}
