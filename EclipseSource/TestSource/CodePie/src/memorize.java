//대학생인 지혜는 영어공부를 하기 위해 영어학원에 등록했다. 
//첫 수업은 선생님이 영어단어를 말하면 뜻을 대답하는 시간이다. 
//지혜는 총 N개 단어의 뜻을 머릿속으로 암기하고 있을 수 있다. 
//만약 선생님이 물어본 단어가 머릿속에 있는 단어라면 1초에 대답할 수 
//있지만, 머릿속에 암기하고 있지 않은 단어이면 
//사전을 찾아서 대답하는데 3초가 걸린다. 
//단어를 들을 때마다 머릿속에 빈 자리가 있다면 바로 암기할 수 있다. 
//만약 머릿속에 N개의 단어를 암기하고 있어 빈자리가 없다면, 
//가장 오래된 단어를 잊어버리고 새로운 단어를 암기한다. 
//하지만 잊어버려야 하는 단어가 외우고 있는 단어들의 평균 길이보다 
//길다면, 그 다음 오래된 단어를 잊어버린다. 만약 암기하고 있는 
//단어를 듣는다면, 해당 단어는 그 순간 새로 외운 것이 된다.
//(해당 단어의 암기 시점은 최신이 된다.) 
//
//지혜가 외울 수 있는 단어의 수와 선생님이 불러주는 영어단어 리스트가 
//주어질 때, 전체 영어단어를 대답하는데 걸리는 시간은 얼마일까?
//
//예제 – 암기 할 수 있는 단어가 3일 때, 단어가 { hello, hanwha, hi, ok, hello } 순으로 들어올경우.
//STEP 1 : 암기 {hello} < 단어 {hanwha, hi, ok, hello} - 3초
//STEP 2 : 암기 {hello, hanwha} < 단어 {hi, ok, hello} - 6초
//STEP 3 : 암기 {hello, hanwha, hi} < 단어 {ok, hello} - 9초
//STEP 4 : 암기 {hello, hanwha, ok} < 단어 {hello} - 12초
//STEP 5 : 암기 {hanwha, ok, hello} < 단어 { } - 13초
//
// 
//
//INPUT FORMAT
//-	입력은 표준입력으로 제공된다.
//-	입력은 여러 테스트 케이스가 포함될 수 있다.
//-	첫째 줄 에는 테스트 케이스의 개수를 나타내는 자연수 T 가 주어진다. 이후 차례로 T개의 테스트 케이스가 주어진다 (1 ≤ T ≤ 100)
//-	각 테스트 케이스 첫째 줄에는 암기할 수 있는 수 N과 단어의 수 W가 주어진다. (1 ≤ N ≤ 10, 10 ≤ W ≤ 100)
//-	각 테스트 케이스 둘째 줄에는 영어단어가 공백으로 구분되어 주어진다. 영어단어는 소문자로만 구성되어 있고 길이가 30자를 넘지
//	않는다.
//OUTPUT FORMAT
//-	각 테스트 케이스의 답을 표준출력으로 출력해야 한다.
//-	각 테스트 케이스의 첫째 줄에는 "Case #C"와 개행문자(newline) 출력하여야 한다. 이때 C는 테스트 케이스의 번호이다.
//-	각 테스트 케이스의 둘째 줄에는 대답에 걸린 시간을 초단위로 출력하고, 개행문자(newline) 출력한다.
//EXAMPLE
//입력	출력
//2
//3 10
//hi hello bye hi what bye good smart creative create
//3 5
//hello hanwha hi ok hello
//
//Case #1
//28
//Case #2
//13