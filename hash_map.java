import java.util.HashMap;
import java.util.Map;

public class hash_map {

  public static void main(String[] args){

    Map<String, String> map = new HashMap<>();
    // putメソッドによって連想配列に要素を追加
    // put(key, value)
    map.put("name","KosukeYoshimura");
    map.put("hobby", "programming");
    //entrySetメソッド→mapクラスのメソッドでマップのコレクションを返す
    //拡張for文 for (データ型 変数名: コレクション){}
    for ( Map.Entry<String, String> entry :map.entrySet() ){
      System.out.println(entry.getKey() + " : " +entry.getValue());
    }

    int data[] = {85 ,72, 89};

    for (int seiseki: data){
      System.out.println(seiseki);

    }
  }
}

/**
 *  コメントの説明文
 *  @param ←これ使ってみる
 *  この@はjavadocにより使える
 */
