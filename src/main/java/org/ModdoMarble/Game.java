package org.ModdoMarble;

import java.util.ArrayList;
import java.util.List;

public class Game {
    // 모든 플레이어들 리스트
    private List<Player> players = new ArrayList<Player>();
    // 모든 도시 리스트
    private List<City> cities = new ArrayList<City>();


    // 게임 시작
    public void startGame(){

    }

    // 플레이어가 한 턴씩 진행하도록 하는 메서드
    // ["규현","장미","나영","현주","정은"]
    public Player playTurn(int playerIdx){
        playerIdx += 1; // 현재 플레이어의 다음 순서 index
        if (playerIdx > players.size()){
            // 현재 플레이어 index가 모든 플레이어의 수보다 크면 처음부터
            return players.get(0);
        } else {
            // 현재 플레이어의 다음 index의 플레이어를 return
            return players.get(playerIdx);
        }
    }

    // 게임의 종료 조건을 확인하는 메서드
    public void checkGameStatus(){

    }
}
