package com.web;

public class QueueUsingArray {

	int[] queue;
	int front;
	int rear;
	public QueueUsingArray(int size) {
		this.queue=new int[size];
		this.front=-1;
		this.rear=-1;
	}
	
	public void push(int data)
	{
		if(queue.length==front)
		{
			System.out.println("queue is full");
			return;
					}
		
		front++;
		queue[front]=data;
		
	}
	
	public int pop()
	{
		if(front==rear)
		{
			System.out.println("Queue is empty");
			front=-1;
			rear=-1;
			return -1;
		}
		else
		{
			return queue[++rear];
		}
	}
	public static void main(String[] args) {
		QueueUsingArray q = new QueueUsingArray(5);
		q.push(10);
		q.push(15);
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		q.push(20);
		System.out.println(q.pop());

	}

}
