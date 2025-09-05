/**
 * if you want to move any pointer(front or rear) ahead(forward) then use
 * x=(x+1)%size [x could be both front or rear] formula
 * and if you want to move the pointer backwards then use
 * x=(x-1+size)%size
 * and condition for full deque is (rear+1)%size==front

 WE ARE USING A FIXED SIZE CIRULAR ARRAY TO IMPLEMENT A DOUBLE ENDED QUEUE
 */




class MyCircularDeque {
    int arr[];
    int front;
    int rear;
    int size; 

    public MyCircularDeque(int k) {
        arr = new int[k]; // our circular array
        front = -1;
        rear = -1;
        size = k;// size of deque is fixed which is equals to the size of circular array

    }

    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            front = rear = 0; // inserting first element.
        }
        else { // in other cases
            front = (front - 1 + size) % size; // when we insert at front then we have to move front pointer backwards so
                                               // for that this formual is used
        }
        arr[front] = value;

        return true;

    }

    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) { // inserting the first element
            front = rear = 0;
        }
        else {
            rear = (rear + 1) % size; // if we are performing insert at last then if it happens then the rear would move
                                      // in forward direction.
        }
        arr[rear] = value;

        return true;

    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        if (front == rear) { // only single element is left and we want to delete it then our deque would
                             // become empty and both front and rear would start pointing to -1
            front = rear = -1;
        }
         else {
            front = (front + 1) % size;// if del front happens then front would move 1 index ahead
        }

        return true;

    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        if (front == rear) { // same single element case
            front = rear = -1;
        } else {
            rear = (rear - 1 + size) % size; // rear would move in backwards direction
        }

        return true;

    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];

    }

    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return arr[rear];

    }

    public boolean isEmpty() {
        return front == -1;

    }

    public boolean isFull() {
        return (rear + 1) % size == front; // condition for full

    }
}



/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */