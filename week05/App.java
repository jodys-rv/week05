package week05;

public class App {

  public static void main(String[] args) {
    
    Logger logs = new AsteriskLogger();
    logs.log("Oops!");
    logs.error("checking the length");
    
    Logger logCheck = new SpacedLogger();
    logCheck.log("hello");
    logCheck.error("spaces");

  }

}
