package hoo.hcute.chapter11.matter7;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(rand.nextInt(i+10));
        }
        printQ(priorityQueue);
    }

    static void printQ(Queue queue){
        while (queue.peek() != null){
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }
}
