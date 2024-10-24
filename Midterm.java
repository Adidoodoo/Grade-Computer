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

        while(true){
        System.out.println("Exam score ceiling: ");
        int examScoreCeiling = sc.nextInt();
        if(examScoreCeiling == 0){//automatic perfect, meant for someone who is exempted at the exam or whatever scenario that fits this condition
            examObj.setScore(100);
            examObj.setCeiling(100);
            examObj.setExamPercentage();
            examObj.addExamPercentageWeight();
            break;  
        }else{
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
        }
        }

        while(true){
        System.out.println("Quiz score ceiling: ");
        int quizScoreCeiling = sc.nextInt();
        if(quizScoreCeiling == 0){//automatic perfect, meant for someone who is exempted at the quiz or whatever scenario that fits this condition
            quizObj.setScore(100);
            quizObj.setCeiling(100);
            quizObj.setQuizPercentage();
            quizObj.addQuizPercentageWeight();
            break;  
        }else{
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
        }
        }
        
        while(true){
        System.out.println("Exam score ceiling: ");
        int essayScoreCeiling = sc.nextInt();
        if(essayScoreCeiling == 0){//automatic perfect, meant for someone who is exempted at the essay or whatever scenario that fits this condition
            essayObj.setScore(100);
            essayObj.setCeiling(100);
            essayObj.setEssayPercentage();
            essayObj.addEssayPercentageWeight();
            break;  
        }else{   
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
        }
        }

        System.out.println("Exam's contribution to your grade is: " + examObj.getPercentage());
        System.out.println("Quiz's contribution to your grade is: " + quizObj.getQuizPercentage());
        System.out.println("Essay's contribution to your grade is: " + essayObj.getEssayPercentage());
        gcObj.setOverallGrade(examObj, quizObj, essayObj);
        System.out.print("Overall grade: "+ gcObj.getOverallGrade());
    }
}