package week05;

public class AsteriskLogger implements Logger {

  @Override
  public void log(String log) {
    System.out.println("***" + log + "***");
    
    
  }

  @Override
  public void error(String error) {
    int errorLength = error.length();
    StringBuilder asterisks = new StringBuilder();
    
    for (int i=0; i < errorLength + 13; i++) {
      asterisks.append("*");
    }
    
    System.out.println(asterisks);
    System.out.println("***Error: " + error + "***");
    System.out.println(asterisks);
    
  }

}
