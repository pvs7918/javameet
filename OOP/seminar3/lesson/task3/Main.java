package OOP.seminar3.lesson.task3;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {


		LinkedList<String> list = new LinkedList<>();
		list.add("qwe");
		list.add("asd");
		list.add("zxc");
		Iterator<String> it = list.descendingIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
