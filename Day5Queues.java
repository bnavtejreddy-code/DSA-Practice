
public class Day5Queues {

    int[] arr;
    int front = -1;
    int rear = -1;

    public Day5Queues(int size) {
        arr = new int[size];
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public boolean isFull() {
        return rear == arr.length - 1;
    }

    public void enqueue(int data) {

        if(isFull()) {
            System.out.println("Queue is Full");
            return;
        }

        if(isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
        }

        arr[rear] = data;
    }

    public void dequeue() {

        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        if(front == rear) {
            front = rear = -1;
            return;
        }

        for(int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }

        rear--;
    }

    public void displayQueue() {

        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue: ");

        for(int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Day5Queues q = new Day5Queues(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.displayQueue();

        q.dequeue();
        q.dequeue();

        q.displayQueue();
    }
}

/*


Circular Queue using Array


class CircularQueue {

    int[] arr;
    int front = -1;
    int rear = -1;

    public CircularQueue(int size) {
        arr = new int[size];
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public boolean isFull() {
        return (rear + 1) % arr.length == front;
    }

    public void enqueue(int data) {

        if(isFull()) {
            System.out.println("Queue is Full");
            return;
        }

        if(isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % arr.length;
        }

        arr[rear] = data;
    }

    public int dequeue() {

        if(isEmpty()) {
            return -1;
        }

        int removed = arr[front];

        if(front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % arr.length;
        }

        return removed;
    }

    public void printQueue() {

        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        int i = front;

        while(true) {

            System.out.print(arr[i] + " ");

            if(i == rear) {
                break;
            }

            i = (i + 1) % arr.length;
        }

        System.out.println();
    }
}

Example:

CircularQueue cq = new CircularQueue(3);

cq.enqueue(10);
cq.enqueue(20);
cq.enqueue(30);

cq.dequeue();

cq.enqueue(40);

cq.printQueue();

Output:
20 30 40

*/