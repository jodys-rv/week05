package week05;

public class SpacedLogger implements Logger{

  @Override
  public void log(String log) {
    System.out.println(spacer(log));
    
  }

  @Override
  public void error(String error) {
    System.out.println("Error: " + spacer(error));
    
  }
  
  public StringBuilder spacer(String word) {
    char[] letters = word.toCharArray();
    StringBuilder output = new StringBuilder();
    for (char letter : letters) {
      output.append(letter);
      output.append(' ');
    }
    return output.deleteCharAt(output.length()-1);
  }

}
