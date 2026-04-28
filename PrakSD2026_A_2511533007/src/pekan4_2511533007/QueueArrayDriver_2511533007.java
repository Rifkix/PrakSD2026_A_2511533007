package pekan4_2511533007;

public class QueueArrayDriver_2511533007 {
	public static void main(String[] args) {
		QueueArray_2511533007 queue_3007 = new QueueArray_2511533007(1000);
		queue_3007.enqueue_3007(10);
		queue_3007.enqueue_3007(20);
		queue_3007.enqueue_3007(30);
		queue_3007.enqueue_3007(40);
		System.out.println("Item di depan " + queue_3007.front_3007());
		System.out.println("item paling belakang " + queue_3007.rear_3007());
		System.out.println("tampilan queue");
		queue_3007.display_3007();
		System.out.println();
		System.out.println(queue_3007.dequeue_3007() + " dihapus dari queue");
		System.out.println("item di depan:" + queue_3007.front_3007());
		System.out.println("item dibelakang: " + queue_3007.rear_3007());
		System.out.println("tampilan queue setelah satu data dihapus");
		queue_3007.display_3007();
	}

}
