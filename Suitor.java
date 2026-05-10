/*
 * Sara Sunny - Lab 10 - Problem 2
 */
package sunny_lab10_prob2;

/**
 *
 * @author slbru
 */
public class Suitor {
    private Suitor link;
    private int count;
    
    public Suitor(int count, Suitor next){
        this.link = next;
        this.count = count;
    }
    public void setCount(int count){
        this.count = count;
    }
    public void setLink(Suitor link){
        this.link = link;
    }
    public int getCount(){
        return count;
    }
    public Suitor getLink(){
        return link;
    }
    
}
