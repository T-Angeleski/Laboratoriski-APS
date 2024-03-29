package Kol2;

import DadeniKodovi.Kodovi.SLL;
import DadeniKodovi.Kodovi.SLLNode;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ChangeListSLL {

	//Site jazli pomali od X da se premestat pred jazli >= X
	private static void changeList(SLL<Integer> list, int x) {
		SLLNode<Integer> tmp = list.getFirst();
		int length = list.getLength();


		for (int i = 0; i < length; i++) {
			if (tmp.element >= x) {
				list.insertLast(tmp.element);
				list.delete(tmp);
			}
			tmp = tmp.succ;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		SLL<Integer> list = new SLL<>();
		IntStream.range(0, n).mapToObj(i -> sc.nextInt()).forEach(list::insertLast);
		int x = sc.nextInt();
		changeList(list, x);
		System.out.println(list);
	}
}
