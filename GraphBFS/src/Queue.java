public class Queue
{
    private final int SIZE = 20;
    private int[] queArray;
    private int front;
    private int rear;

    public Queue()
    {
        queArray = new int[SIZE];
        front = 0;
        rear = -1;
    }

    public void insert(int j) // insert elements in the end of queue
    {
        if(rear == SIZE-1)
        {
            rear = -1;
        }
        queArray[++rear] = j;
    }

    public int remove() // remove elem in the begin of queue
    {
        int temp = queArray[front++];
        if(front == SIZE)
        {
            front = 0;
        }
        return temp;
    }

    public boolean isEmpty() // true, if queue is empty
    {
        return (rear+1 == front || (front+SIZE-1 == rear));
    }
}