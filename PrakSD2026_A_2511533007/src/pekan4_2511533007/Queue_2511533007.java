package pekan4_2511533007;

public class Queue_2511533007 {
	int front_3007, rear_3007, size_3007;
	int max_3007;
	int array_3007[];
	
	public Queue_2511533007(int capacity_3007) {
		this.max_3007 = capacity_3007;
		front_3007 = this.size_3007 = 0;
		rear_3007 = capacity_3007 - 1;
		array_3007 = new int [this.max_3007];
	}
	
	boolean isFull_3007(Queue_2511533007 queue_3007) {
		return (queue_3007.size_3007 == queue_3007.max_3007);
	}
	
	boolean isEmpty_3007(Queue_2511533007 queue_3007) {
		return (queue_3007.size_3007 == 0);
	}
	
	void enqueue_3007(int item_3007 ) {
		if (isFull_3007(this))
			return;
		this.rear_3007 = (this.rear_3007 + 1) % this.max_3007;
		this.array_3007[this.rear_3007] = item_3007;
		this.size_3007 = this.size_3007 + 1;
		System.out.println(item_3007 + " enqueued to queue");
	}
	int dequeue_3007() {
		if (isEmpty_3007(this))
			return Integer.MIN_VALUE;
		int item_3007 = this.array_3007[this.front_3007];
		this.front_3007 = (this.front_3007 + 1) % this.max_3007;
		this.size_3007 = this.size_3007 - 1;
		return item_3007;
	}
	int front_3007() {
		if (isEmpty_3007(this))
			return Integer.MIN_VALUE;
		
		return this.array_3007[this.front_3007];
	}
	int rear_3007() {
		if (isEmpty_3007(this))
			return Integer.MIN_VALUE;
		return this.array_3007[this.rear_3007];
	}
	//mencetak elemen antrian
	void display_3007() {
		int i;
		if (front_3007 == rear_3007) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		//kunjungi dari belakang dan cetak
		for (i = front_3007; i < rear_3007; i++) {
			System.out.printf(" %d <-- ", array_3007[i]);
		}
		return;
	}

}
