package DSA.Stack;

public class StackMain {
    public static void main(String[] args) throws StackExeption {
        DynamicStack stack = new DynamicStack(5); //if we use custom stack here the length of the stack will be finite.

        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);

        System.out.println(stack.pop()); //since it throws a exeption you must add signature
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
