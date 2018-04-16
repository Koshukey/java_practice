import java.util.ArrayList;

public class RemoveElementFromArrayListExample {

//javaのファイルが実行されると必ずmainメソッドが呼ばれる
//staticをつけることでインスタンス化しなくてもメソッドにアクセスできる
//string配列を引数にもつ
  public static void main(String[] args){

//java1.5以降<String>とか書かないと警告でるヽ(；▽；)ノ
    ArrayList<String> arraylist = new ArrayList<String>();
//addメソッドで要素を追加
    arraylist.add("1");
    arraylist.add("2");
    arraylist.add("3");

//指定された位置にある要素をs削除
//arraylistという配列からremoveしてobjというObject型にぶち込む
    Object obj = arraylist.remove(1);

    System.out.println(obj + "is removed from Arraylist");
    System.out.println("Arraylist contains...");

    //sizeメソッドはリスト内にある要素の数を返す
  for(int index =0; index < arraylist.size(); index++){
      System.out.println(arraylist.get(index));
     }

  }
}
