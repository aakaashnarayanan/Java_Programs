class Queue {
    protected int arr[];
    protected int front, rear, size, length;

    Queue(int n) {
        size = n;
        length = 0;
        front = -1;
        rear = -1;
        arr = new int[size];
    }

    boolean isEmpty() {
        return (size == 0);
    }

    boolean isFull() {
        return (size == length);
    }

    void insert(int data) {
        if (isFull()) {
            System.out.println("the queue is full!");
            System.exit(1);
        }
        if (rear == -1) {
            front = 0;
            rear = 0;
            arr[rear] = data;
        } else if (rear + 1 < size) {
            arr[++rear] = data;
        }
        length++;
    }

    void delete() {
        if (isEmpty()) {
            System.out.println("the queue is empty!");
            System.exit(1);
        }
        length--;
        int temp = arr[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front++;
        }
        System.out.println("the deleted element is:" + temp);
    }

    void display() {
        if (front == -1) {
            System.out.println("the queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}

public class QueueDemo {
    public static void main(String args[]) {
        Queue q = new Queue(2);
        q.display();
        q.insert(20);
        q.insert(30);
        q.insert(40);
        q.display();
    }
}
