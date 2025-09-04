package holdobjects;


import java.util.*;

class Command{
    String s;
    Command(String s){
        this.s = s;
    }
    void operation(){
        System.out.println(s);
    }
}

class CommandQueue{
    Queue<Command> fill(List<Command> commandList){
        Queue<Command> q = new LinkedList<>();
        Iterator it = commandList.iterator();
        while(it.hasNext()){
            Command c = (Command)it.next();
            q.offer(c);
        }
        return q;
    }
}
public class Exercise27 {
    public static void consumeCommands(Queue<Command> cq){
        while (cq.peek() != null) {
            cq.poll().operation();
        }
    }
    public static void main(String[] args) {
        Command c1 = new Command("move");
        Command c2 = new Command("fly");
        List<Command> l = new LinkedList<>(Arrays.asList(c1, c2));
        CommandQueue cq = new CommandQueue();
        consumeCommands(cq.fill(l));
    }
}
