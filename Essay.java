public class Essay extends Exam{
    private double percentage;

    public void setEssayPercentage(){
        this.percentage = ((double) getScore()/getCeiling()) * 100;
    }
    
    public void addEssayPercentageWeight(){
        this.percentage = percentage * .3;
    }

    public double getEssayPercentage(){
        return percentage;
    }
}