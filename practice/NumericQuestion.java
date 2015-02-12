public class NumericQuestion extends Question
{       
    private double answer;
    
    public NumericQuestion()
    { 
    }   
    
    public void setAnswer(double correctResponse)
    {
        answer = correctResponse;  
    }
    
    public boolean checkAnswer(String reponse)
    {
        double responseAsDouble = Double.parseDouble(reponse);
        return Math.abs(responseAsDouble - answer)<= 0.01;
    }
    
}
