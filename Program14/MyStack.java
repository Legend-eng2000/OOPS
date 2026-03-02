package Program14;
public class MyStack<T> {
    int len,top=-1;
    T[] arr;
    @SuppressWarnings("unchecked")
    MyStack(int len){
        this.len=len;
        arr=(T[]) new Object[len];
    }    
    void push(T element){
        if (top == len-1) {
            System.out.println("Stack Overflow!");
            return;
        }
        arr[++top]=element;
    }
    T pop(){
        if(top == -1){
            System.out.println("Stack Underflow!");
            return null;
        }
        return arr[top--];
    }
    void display(){
        if(top == -1){
            System.out.println("Stack Underflow!");
            return;
        }
        for (int i=top; i>=0;i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
