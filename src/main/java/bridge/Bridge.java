package bridge;

import java.util.List;

public class Bridge {
    private int size;
    private List<Integer> bridgeInformation;
    public Bridge(String size){
        validateSize(size);
        this.size = Integer.parseInt(size);
    }
    public void makeBridge(){
        BridgeMaker bridgeMaker = new BridgeMaker(new BridgeRandomNumberGenerator());
    }
    public void makeCustomBridge (){

    }
    private void validateSize(String size) throws IllegalArgumentException{

    }

}
