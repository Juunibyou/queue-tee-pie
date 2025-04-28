package org.example;

import java.util.ArrayList;

public class QueueTees {
    private ArrayList<Cutie> queue;
    int maxsize;

    public QueueTees(int maxsize){
        this.queue = new ArrayList<>();
        this.maxsize = maxsize;
    }

    public int size(){
        System.out.println("Queue size: " + queue.size());
        return queue.size();
    }

    //ENQUEUE
    public void enqueue(Cutie cutie){
        if(queue.size() < maxsize){
            queue.add(cutie);
            System.out.println("Enqueue: " + cutie.description());
            System.out. println("Cuteness Rating: " + cutie.cutenessRating() + "/10");
        }
        else{
            System.out.println("Queue is full...");
        }
    }

    //DEQUEUE
    public Cutie dequeue(){
        if(queue.isEmpty()){
            System.out.println("Queue is empty...");
            return null;
        }

        Cutie previous = queue.remove(0);
        System.out.println("Dequeued: " + previous.description());
        System.out. println("Cuteness Rating: " + previous.cutenessRating() + "/10");
        return previous;
    }

}
