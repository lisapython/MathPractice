package com.lisa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueLearn {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
        queue.offer("string"); // add
        System.out.println(queue.poll());
        System.out.println(queue.remove());
        System.out.println(queue.size());
        
        List list = new ArrayList();
        
        
	}

}
