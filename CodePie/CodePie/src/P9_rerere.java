import java.util.*;

public class P9_rerere {

   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
   
      int caseNum = Integer.parseInt(scanner.nextLine());
      
      //입력
      int[] caseNodeNum = new int[caseNum];
      String[] caseNodeLine = new String[caseNum];
      String[] caseTest = new String[caseNum];
      for(int i = 0; i < caseNum; i++) {
         caseNodeNum[i] = Integer.parseInt(scanner.nextLine());
         String str = "";
         for(int k = 0; k < caseNodeNum[i]-1; k++) {
            str += scanner.nextLine();
            if(k < caseNodeNum[i]-2) {
               str += ",";
            }
         }
         caseNodeLine[i] = str;
         caseTest[i] = scanner.nextLine();
      }
      
      //출력
      for(int i = 0; i < caseNum; i++) {
         System.out.println("Case #" + (i+1));
         String result = "YES";
         
         Queue<String> queue = new LinkedList<>();
         String[] test = caseTest[i].split(" ");
         
         for(int k = 0; k < test.length-1; k++) {
            String node = test[k];
            String nextNode = test[k+1];
            
            List<String> childNodes = new ArrayList<>();
            String[] nodeLineArr = caseNodeLine[i].split(",");
            for(String nodeLine : nodeLineArr) {
               if(nodeLine.startsWith(node)) {
                  String childNode = nodeLine.replace(node + " ", "");
                  childNodes.add(childNode);
               }
            }
            
            if(childNodes.contains(nextNode)) {
               queue.add(nextNode);
               childNodes.remove(nextNode);
            } 
            for(String cnode : childNodes) {
               queue.add(cnode);
            }
         }
         
         for(int k=1; k<test.length; k++) {
            if(!test[k].equals(queue.poll())) {
               result = "NO";
            }
         }  
         System.out.println(result);
      }

   }

}