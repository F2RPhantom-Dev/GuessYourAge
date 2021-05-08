import java.util.*;
class GuessYourAge
    {
    public static void main ()
    {
     Scanner obj =new Scanner(System.in);
     System.out.println("hello there! Lets guess your age! ( ͝° ͜ʖ͡°) \n");
     int a,b,c,d,e,f,g;char ch;a=1;
     System.out.println("Once a statement is displayed press x to go to the next one \n");
     System.out.println("Ok so first multiply 10 to your age (press x to go to next statement)\n");
     ch = obj.next().charAt(0);
     if(ch=='x'|| ch == 'X')
     System.out.println("Add 15 to the result\n");
     ch = obj.next().charAt(0);
     if(ch=='x'|| ch == 'X')
     System.out.println("divide the result by 5\n");
     ch = obj.next().charAt(0);
     if(ch=='x'|| ch == 'X')
     System.out.println("Multiply 3 to the result\n");
     ch = obj.next().charAt(0);
     if(ch=='x'|| ch == 'X')
     System.out.println("Subtract 9\n");
     ch = obj.next().charAt(0);
     if(ch=='x'|| ch == 'X')
     {System.out.println("Now enter the number which you got\n");
    
     a=obj.nextInt();
     System.out.println("press x\n");
     }
     ch = obj.next().charAt(0);
     if(ch=='x'|| ch == 'X')
     System.out.println("Now divide the number by 6\n");
     b=a/6;
     ch = obj.next().charAt(0);
     if(ch=='x'|| ch == 'X')
     System.out.println("Hmm let me think...🤔... Is your age.... " + b + "?(press x)\n");
     ch = obj.next().charAt(0);
     if(ch=='x'|| ch == 'X')
     System.out.println("Its correct right!!(press x - I know you are shocked! ༼ᕗຈل͜ຈ༽)\n");
     ch = obj.next().charAt(0);
     if(ch=='x'|| ch == 'X')
     System.out.println("Hehe thanks for your valuable time. BBYE!!\n");
     
     
     }
    }

