package org.example;

public class App {
//Create a bunch of object
Puppy puppy = new Puppy();
Turtle kitty = new Turtle();
Monkey monkey = new Monkey();
 
// Create a queue data structure
QueueTees queue = new QueueTees();
 
// The size of the queue should equal zero since there are no objects in it
queue.size();
 
// Add the cuties to the queue
queue.enqueue(puppy);
queue.enqueue(kitty);
queue.enqueue(marmoset);
 
// The size of the queue should equal three since there are three objects in it
queue.size();
 
// The first dequeue should return the puppy
queue.dequeue();
 
// The second dequeue should return the kitty
queue.dequeue();
 
// The first dequeue should return the pygmy marmoset
queue.dequeue();
}
