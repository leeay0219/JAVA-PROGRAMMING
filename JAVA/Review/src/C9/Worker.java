package C9;

public class Worker {
	public void start() {
		System.out.println("rest");
	}
}

class Anonymous {
	Worker field = new Worker() {
		@Override
		public void start() {
			System.out.println("designing");
		}
	};
	
	void method() {
		Worker localVar = new Worker() {
			@Override
			public void start() {
				System.out.println("developing");
			}
		};
		localVar.start();
	}
	
	void method2(Worker worker) {
		worker.start();
	}
}
