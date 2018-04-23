//importによっtw異なるパッケージに属するクラスを使用することを宣言
import mypackage.MyAp;
import mypackage.sub.SubAp;

public class MyMain {
  public static void main (String[] args){
    MyAp ap = new MyAp();
    SubAp subap = new SubAp();
    ap.print(); //MyApクラスでprintメソッドを定義したので使える
    subap.print(); //SubApクラスでprintメソッドを定義したので使える
  }
}
