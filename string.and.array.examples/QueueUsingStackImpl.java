import java.util.List;
import java.util.Stack;

public class QueueUsingStackImpl {
     Stack<Integer> mainQueue = new Stack<Integer>();
     Stack<Integer> helpingQueue = new Stack<Integer>();

     public void printQueElements(){

         int i = mainQueue.size() - 1;
          while (i > -1 )
               System.out.print(mainQueue.get(i--));
     }

     public void pushElement(int i){
          while(!mainQueue.isEmpty()){
               helpingQueue.push(mainQueue.pop());
          }
          mainQueue.push(i);
          while(!helpingQueue.isEmpty()){
               mainQueue.push(helpingQueue.pop());
          }
     }

     public int popElement(){

          if(null != mainQueue.peek()){
               return mainQueue.pop();
          }else{
               return -1;
          }
     }
}
