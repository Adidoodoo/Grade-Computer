import java.util.*;
public class Midterm{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Exam examObj = new Exam();
        Quiz quizObj = new Quiz();
        Essay essayObj = new Essay();
        gradeComputer gcObj = new gradeComputer();
        examObj.setMessage();
        System.out.println("Exams has started...");
        System.out.println(examObj.getMessage());

        System.out.println("Exam score ceiling: ");
        int examScoreCeiling = sc.nextInt();
        while(true){         
            System.out.print("Exam score: ");
            int examScore = sc.nextInt();
            if(examScore > examScoreCeiling || examScore < 0){
                System.out.println("Score ceiling exceeded...");
            }else{
                examObj.setScore(examScore);
                examObj.setCeiling(examScoreCeiling);
                examObj.setExamPercentage();
                examObj.addExamPercentageWeight();     
                break;
            }
        }

        System.out.println("Quiz score ceiling: ");
        int quizScoreCeiling = sc.nextInt();
        while(true){          
            System.out.print("Quiz score: ");
            int quizScore = sc.nextInt();
            if(quizScore > quizScoreCeiling || quizScore < 0){
                System.out.println("Score ceiling exceeded...");
            }else{
                quizObj.setScore(quizScore);
                quizObj.setCeiling(quizScoreCeiling);
                quizObj.setQuizPercentage();
                quizObj.addQuizPercentageWeight();              
                break;
            }
            }
    
        System.out.println("Essay score ceiling: ");
        int essayScoreCeiling = sc.nextInt();    
        while(true){ 
            System.out.print("Essay score: ");
            int essayScore = sc.nextInt();
            if(essayScore > essayScoreCeiling || essayScore < 0){
                System.out.println("Score ceiling exceeded...");
            }else{
                essayObj.setScore(essayScore);
                essayObj.setCeiling(essayScoreCeiling);
                essayObj.setEssayPercentage();
                essayObj.addEssayPercentageWeight(); 
                break;
            }
            }

        System.out.println("Exam's contribution to your grade is: " + examObj.getPercentage());
        System.out.println("Quiz's contribution to your grade is: " + quizObj.getQuizPercentage());
        System.out.println("Essay's contribution to your grade is: " + essayObj.getEssayPercentage());
        gcObj.setOverallGrade(examObj, quizObj, essayObj);
        System.out.print("Overall grade: "+ gcObj.getOverallGrade());
    }
}