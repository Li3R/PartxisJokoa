import java.util.Random;
public class Dadoa(){
  private int nAlde = 6;
  public int bota(){
    Random r = new Random();
    int tirada = r.nextInt(nAlde) + 1;
  return tirada;
  }
}
