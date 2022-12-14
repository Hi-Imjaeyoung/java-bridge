package bridge;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String readBridgeSize() {
        System.out.println("다리 건너기 게임을 시작합니다."+"\n");
        System.out.println("다리의 길이를 입력해주세요.");
        String bridgeSize = Console.readLine();
        return bridgeSize;
    }

    public String readMoving() {
        System.out.println("이동할 칸을 선택해주새요. (위: U, 아래: D)");
        return Console.readLine();
    }

    public String readGameCommand() {
        System.out.println("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)");
        return Console.readLine();
    }
}
