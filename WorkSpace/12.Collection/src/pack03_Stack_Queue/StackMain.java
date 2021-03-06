package pack03_Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		//Coin에 있는 private으로 만든 value를 
		//접근해서 출력하시오.
		//Coin coin = new Coin();
		//error ->?Coin coin = new Coin();
		
		//Stack 자료구조 
		Stack<Coin> stackCoin = new Stack<Coin>();
		//push라는 메소드를 이용해 데이터를 삽입
		stackCoin.push(new Coin(100));
		stackCoin.push(new Coin(50));
		stackCoin.push(new Coin(500));
		stackCoin.push(new Coin(10));
		//LIFO = Last In First Out
		//후입선출 = 마지막에 들어온 데이터가 제일 먼저 나감
		//Stack Push기능을 통해 데이터를 삽입하고 Pop기능을 통해 데이터를 뽑아온다.
		//ex)프링글스 
		while(!stackCoin.isEmpty()) {
			Coin coin = stackCoin.pop(); 
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
		
		//Que는 LinkedList를 사용함 
		//FIFO = First In First Out
		//선입 선출 
		//먼저 들어온 데이터가 먼저 나감
		//offer라는 기능을 이용해 데이터를 삽입 poll이라는 기능을 통해 데이터를 빼옴 
		Queue<Coin> queueCoin = new LinkedList<Coin>();
		queueCoin.offer(new Coin(100));
		queueCoin.offer(new Coin(50));
		queueCoin.offer(new Coin(500));
		queueCoin.offer(new Coin(10));
		
		while (!queueCoin.isEmpty()) {
			Coin coin = queueCoin.poll(); //데이터를 빼올때 
			System.out.println("Que꺼내온 동전 : " + coin.getValue() + "원");
		}
		
		Deque<Coin> dequeCoin = new ArrayDeque<Coin>();
		//데크 , 데큐 
		//양쪽다 접근이 가능
		//순차적으로 쌓여있는 맨처음 데이터와 맨끝 데이터 둘다 접근이 가능한구조
		dequeCoin.push(new Coin(100));
		dequeCoin.offer(new Coin(50));
		dequeCoin.push(new Coin(500));
		dequeCoin.offer(new Coin(10));
		while (!dequeCoin.isEmpty()) {
			Coin coin = dequeCoin.poll();
			System.out.println("데큐로 꺼내온 동전 " + coin.getValue());
			
		}
		
		
		
	}
}
