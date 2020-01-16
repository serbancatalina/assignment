public class Exchange {
    private String symbol;

    public Exchange() {
    }

    public Exchange(String symbol) {
        this.symbol = symbol;
    }

    public String getUpperCaseSymbol() {
        return this.symbol.toUpperCase();
    }
}
