
/**
 * SuccessOrFail 클래스의 설명을 작성하세요.
 *
 * @author (이수영)
 * @version (24.3.26)
 */
public class SuccessOrFail{
  public static void main (String[] args){
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("점수를 입력하시오: ");
      int score = scanner.nextInt();
      if (score >= 80)
          System.out.println("축하합니다! 합격입니다.");
      scanner.close();
    }
  }
