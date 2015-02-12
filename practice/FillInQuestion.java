import java.util.Scanner;
public class FillInQuestion extends Question
{
    //"The inventor of Java was _James Gosling_"
    //parse the specified question into a question to display and
    // an answer to check:
    //question: the inventor of java was ____
    //answer: "james gosling"
    
    public FillInQuestion()
    {
       
    }   
    
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question += "_____" + parser.next();
        
        super.setText(question);
        super.setAnswer(question);        
    }

}
