public class gradeComputer extends Exam{
    private double overallGrade;

    public void setOverallGrade(Exam exgrade, Quiz qgrade, Essay essgrade){
        this.overallGrade = exgrade.getPercentage() + qgrade.getQuizPercentage() + essgrade.getEssayPercentage();
    }
    public double getOverallGrade(){
        return overallGrade;
    }
}