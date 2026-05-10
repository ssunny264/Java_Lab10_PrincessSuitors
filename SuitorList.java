/*
 * Sara Sunny - Lab 10 - Problem 2
 */
package sunny_lab10_prob2;

/**
 *
 * @author slbru
 */
public class SuitorList {
    private Suitor head;
    private Suitor tail;
    private Suitor previous;
    
    public SuitorList(){
        head = null;
        tail = null;
        previous = null;
    }
    public void createSuitor(int count){
        if(head == null){                               //tail = head to create circular linklist
            head = new Suitor(count, head);
            tail = head;
        }
        else{
            head = new Suitor(count, head);
            tail.setLink(head);
        }
    }
    public Suitor getHead(){
        return head;
    }
    
    public int findSuitor(){
        Suitor position = head;     
        previous = tail;
        int count = 1;
        while (position.getLink() != null){         //while next link is not null
            
            while (count < 3){    
                count++;                            //count up to 3
                previous = position;
                position = position.getLink();
               
            } 
            previous.setLink(position.getLink());   //delete third link
            position = previous.getLink();          
            if (position.getCount() == position.getLink().getCount()){ //if position and next position are equal then set position to null to prevent infinity loop
                position.setLink(null);
            }
            count = 1;                              //restart count
            
        }
        return position.getCount();
    }
    public void displayWinner(){
        System.out.println("Suitor number " + findSuitor() + " wins Eve's hand in marriage! ");
    }
}
