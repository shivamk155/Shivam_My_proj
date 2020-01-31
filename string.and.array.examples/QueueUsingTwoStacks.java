import java.util.Scanner;

public class QueueUsingTwoStacks {

    public static void main(String[] args) {
        QueueUsingStackImpl que = new QueueUsingStackImpl();
            Scanner sc = new Scanner(System.in);
            do{
                System.out.println("Enter the option");
                System.out.println("1. Push an Element");
                System.out.println("2. Pop an Element");
                System.out.println("3. Print Elements in Queue");
                int i = sc.nextInt();
                switch (i){
                    case 1:
                        System.out.println("Enter the element to push");
                        int k = sc.nextInt();
                        que.pushElement(k);
                        break;

                    case 2:
                        int j = que.popElement();
                        System.out.println("Popped element is:" + j);
                        break;

                    case 3:
                           que.printQueElements();
                        break;
                }

            }while(1==1);
    }
}
