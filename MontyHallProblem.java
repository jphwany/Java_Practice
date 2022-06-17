public class MontyHallProblem {
    public static void main(String[] args) {
        int nonChange_win_rate = 0; // 바꾸지 않아서 이긴 횟수
        int nonChange_lose_rate = 0; // 바꾸지 않아서 진 횟수
        int change_win_rate = 0 ; // 바꿔서 이긴 횟수
        int change_lose_rate = 0; // 바꿔서 진 횟수

        for(int i = 0; i < 100000; i++){ // 총 10만 번 반복
            int reward = (int)(Math.random() * 3+1); // 주최자는 1~3중 정답을 하나 숨김
            int answer = (int)(Math.random() * 3+1); // 참가자는 1~3중 하나를 고름

            /*이때 주최자는 염소를 고른 뒤 참가자에게 바꿀지 말지 제안.*/

            //주최자는 참가자의 답과 보상이 아닌 것을 택함
            int val = (int)(Math.random() * 3+1);
            while(reward == val || answer == val){
                val = (int)(Math.random() * 3+1);
            }

            //바꾸지 않았을 시
            if(reward == answer) nonChange_win_rate++; //바꾸지 않아서 이겼을 경우 1승 추가
            else nonChange_lose_rate++; //바꾸지 않아서 졌을 경우 1패 추가

            //바꿨을 시
            int change = (int)(Math.random() * 3+1);
            while(val == change || answer == change){ //이때 참가자는 바꾸기로 결정
                change = (int)(Math.random() * 3+1);
            }
            if(reward == change) change_win_rate++; //바꿔서 이겼을 경우 1승 추가
            else change_lose_rate++; //바꿔서 졌을 경우 1패 추가

        }

        System.out.println("nonChange_win_rate : "+nonChange_win_rate); // 바꾸지 않아서 이긴 횟수 출력
        System.out.println("nonChange_lose_rate : "+nonChange_lose_rate); // 바꾸지 않아서 진 횟수 출력
        long nonChange_rate = (nonChange_win_rate * 100L)/(nonChange_win_rate+nonChange_lose_rate); //확률계산
        System.out.println("rate : "+nonChange_rate+"%"); //바꾸지 않아서 이길 확률
        System.out.println();

        System.out.println("change_win_rate : "+change_win_rate); // 바꿔서 이긴 횟수 출력
        System.out.println("change_lose_rate : "+change_lose_rate); // 바꿔서 진 횟수 출력
        long change_rate = (change_win_rate * 100L)/(change_win_rate+change_lose_rate); //확률계산
        System.out.println("rate : "+change_rate+"%"); //바꿔서 이길 확률

    }
}
