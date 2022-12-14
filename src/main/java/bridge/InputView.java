package bridge;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public String readBridgeSize() {
        System.out.println("다리 건너기 게임을 시작합니다."+"\n");
        System.out.println("다리의 길이를 입력해주세요.");
        String bridgeSize = Console.readLine();
        return bridgeSize;
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        return null;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }
}
