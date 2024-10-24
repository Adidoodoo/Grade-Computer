public class Quiz extends Exam{
    private double percentage;
    
    public void setQuizPercentage(){
        this.percentage = ((double) getScore()/getCeiling()) * 100;
    }

    public void addQuizPercentageWeight(){
        this.percentage = percentage * .2;
    }

    public double getQuizPercentage(){
        return percentage;
    }
}