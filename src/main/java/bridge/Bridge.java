package bridge;

import javax.naming.InsufficientResourcesException;
import java.util.Arrays;
import java.util.List;

public class Bridge {
    private int size;
    private List<String> bridgeInformation;
    public Bridge(String size){
        this.size = validateSize(size);
    }
    public void makeBridge(){
        BridgeMaker bridgeMaker = new BridgeMaker(new BridgeRandomNumberGenerator());
        bridgeInformation = bridgeMaker.makeBridge(this.size);
    }
    public void makeCustomBridge (List<String> bridgeInformation){
        this.bridgeInformation = bridgeInformation;
    }
    private int validateSize(String size) throws IllegalArgumentException{
        if(size.equals(null) || size.replaceAll("[^0-9]","").length() != size.length()){
            throw new IllegalArgumentException("숫자를 입력해주세요");
        }
        int sizeNumericValue = Integer.parseInt(size);
        if(sizeNumericValue<3 || sizeNumericValue>20){
            throw new IllegalArgumentException("3이상 20이하의 숫자를 입력해주세요");
        }
        return sizeNumericValue;
    }

}
