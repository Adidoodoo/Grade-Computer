public class Exam{
    private String message; 
    private int score;
    private int ceiling;
    private double percentage;

    public void setMessage(){
        this.message = "Good luck!";
    }

    public String getMessage(){
        return this.message;
    }

    public void setScore(int score){
        this.score = score;
    }

    public void setCeiling(int ceiling){
        this.ceiling = ceiling;
    }

    public int getScore(){
        return score;
    }

    public int getCeiling(){
        return ceiling;
    }

    public void setExamPercentage(){
        this.percentage = ((double) score/ceiling) * 100;
    }

    public void addExamPercentageWeight(){
        this.percentage = percentage * .5;
    }

    public double getPercentage(){
        return percentage;
    }
}
