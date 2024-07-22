import java.time.LocalDateTime;

public class Car {
    private String codes;
    Route fixRoute;
    private int maxCapacity;
    //private boolean isCodeReversed;


    public Car(String codes, Route fixRoute, int maxCapacity) {
        this.codes = codes;
        this.fixRoute = fixRoute;
        this.maxCapacity = maxCapacity;
       // this.isCodeReversed = checkReversedCode(codes);
    }

    public String getCodes() {
        return codes;
    }
    public void setCodes(String codes) {
        this.codes = codes;
    }

    public Route getFixRoute() {
        return fixRoute;
    }

    public void setFixRoute(Route fixRoute) {
        this.fixRoute = fixRoute;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

     /*private boolean checkReversedCode(String code) {
        StringBuilder strBuild = new StringBuilder(code);
        String reversedCode = strBuild.reverse().toString();
        return code.equals(reversedCode);
    }*/
   /* public boolean isCodeReversed() {
        return isCodeReversed;
    }*/


}