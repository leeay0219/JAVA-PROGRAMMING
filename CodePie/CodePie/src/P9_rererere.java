import java.util.*; 
public class P9_rererere {

	public static void main(String[] args) {
		
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		
		node1.addNeighbour(node2, node3);
		node2.addNeighbour(node4, node5);
		node3.addNeighbour(node6, node7);
		
		
		List<Node> list = new ArrayList<>();
		list.add(node1);
		list.add(node2);
		list.add(node3);
		list.add(node4);
		list.add(node5);
		list.add(node6);
		list.add(node7);
		
		Queue<Node> test = new LinkedList<>();
		test.offer(new Node(1));
		test.offer(new Node(2));
		test.offer(new Node(3));
		test.offer(new Node(4));
		test.offer(new Node(5));
		test.offer(new Node(6));
		test.offer(new Node(7));
		test.poll(); //startnode제외
		
		boolean result = BFS.isTraversal(test, node1);
		System.out.println(result);
	}
	
	
	static class Node {
		int data;
		List <Node> neighbourList = new ArrayList<>();
		Node(int data, Node...nodes) {
			this.data = data; 
			for (Node node : nodes) {
				neighbourList.add(node);
			}
		}
		
		void addNeighbour(Node...nodes) {
			for (Node node : nodes) {
				neighbourList.add(node);
			}
		}
		
		@Override
		public boolean equals(Object obj) {
			Node node = (Node) obj;
			return data == node.data;
		}
		
		@Override
		public int hashCode() {
			return data;  // 문자열이면 return data.hashCode()
		}
	}
	
	static class BFS {
		static void traversal(Node node) {
			Queue<Node>q = new LinkedList<>();
			q.offer(node);
			while (!q.isEmpty()) {
				node = q.poll();
				System.out.println(node.data + " ");
				if (node.neighbourList.size() != 0) {
					for (Node neighbour : node.neighbourList) {
						q.offer(neighbour); 
					}
				}
			}
		}
		static boolean isTraversal(Queue<Node>test,Node...nodes) {
			if (test.isEmpty()) return true; 
			List<Node>neighbourList = getNeighbourList(nodes);
			for (int i=0; i<neighbourList.size(); i++) {
				Node testNode = test.poll();
				if (!neighbourList.contains(testNode)) {
					return false;
				}
			}
			return isTraversal(test, neighbourList.toArray(new Node[0]));
		}

		private static List<Node> getNeighbourList(Node...nodes) {
			List <Node> list = new ArrayList<>();
			for (Node node : nodes) {
				for (Node neighbour : node.neighbourList) {
					list.add(neighbour);
				}
			}
			return list; 
		}
	}

}
