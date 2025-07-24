
class Main{
    static class Queue{
        int front,rear,capacity;
        int[] queue;
        
        Queue(int c){
            front=rear=0;
            capacity = c;
            this.queue = new int[capacity];
        }
        
        void enqueue(int x){
            if(rear==capacity){
                System.out.println("Queue is full");
            }
            else{
                queue[rear++]=x;
            }
        }
        void dequeue(){
            if(front==rear){
                System.out.println("Queue is Empty");
            }
            else{
                for(int i=0;i<rear-1;i++){
                    queue[i] = queue[i+1];
                }
                rear--;
            }
        }
        void display(){
            if(front==rear){
                System.out.println("Queue is Empty");
            }
            else{
              for(int i=front;i<rear;i++){
                System.out.print(queue[i]+" <-- ");
            }
            System.out.println();
          }
        }
        void queuefront(){
            if(front==rear){
                System.out.println("Queue is Empty");
            }
            else{
                System.out.println("Front element is "+queue[front]); 
            }    
        }
    }
    
    public static void main(String[] args){
        Queue q = new Queue(4);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();
        q.dequeue();
        q.dequeue();
        System.out.println("After deleting the element from the queue");
        q.display();
        q.queuefront();
    }
}
