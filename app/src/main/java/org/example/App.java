package org.example;

public class App {
//Create a bunch of object
    public static void main(String[] args){
        Puppy puppy = new Puppy();
        Turtle turtle = new Turtle();
        Monkey monkey = new Monkey();
        
        // Create a queue data structure
        QueueTees queue = new QueueTees(3);
        
        // The size of the queue should equal zero since there are no objects in it
        queue.size();
        
        // Add the cuties to the queue
        queue.enqueue(puppy);
        queue.enqueue(turtle);
        queue.enqueue(monkey);
        
        // The size of the queue should equal three since there are three objects in it
        queue.size();
        
        // The first dequeue should return the puppy
        queue.dequeue();
        
        // The second dequeue should return the kitty
        queue.dequeue();
        
        // The first dequeue should return the pygmy marmoset
        queue.dequeue();
        }
}