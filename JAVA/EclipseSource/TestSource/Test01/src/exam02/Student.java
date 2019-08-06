package exam02;

public class Student {
		int studentNo; 
		
		public Student(String string) {}

		@Override
		public int hashCode() {
			return Integer.hashCode(this.studentNo); 
		}
	

		@Override
		public boolean equals(Object o) {
			if (o instanceof Student) {
				Student s = (Student)o; 
				if (this.studentNo == s.studentNo) {
					return true; 
				}
			}
			return false; 
		}
}
