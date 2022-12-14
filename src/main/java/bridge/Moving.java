package bridge;

public enum Moving {
    UP(1,"U"),
    DOWN(0,"D");
    int numericValue;
    String symbol;
    Moving(int numericValue, String symbol){
        this.numericValue = numericValue;
        this.symbol = symbol;
    }
    public int getNumericValue(){
        return numericValue;
    }
    public String getSymbol(){
        return symbol;
    }
}
