

public abstract class Stack {

    public int size(){ return myStack.size(); };
    abstract public boolean isEmpty(); //Returns true if stack is empty
    abstract public void push(Object o); //Adds an item to the top of stack
    abstract public Object pop();//Removes and returns the item from the top of stack

    public static void main(String[] args) {
        Stack s = new StudentNameStack();
        s.push("Manee");
        s.push("Mana");
        System.out.println("Study Name: " +s.pop());
        Sytem.out.println("Study Name: " +s.pop());
    
    }

}