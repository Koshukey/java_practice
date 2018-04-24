public class bubble_sort {

  static void bubble_sort(int d[]) {
    for (int i = d.length-1; i > 0; i --){

      for (int j = 0; j<i; j++){
        if (d[j] > d[j+1]){
          int box = d[j];
          d[j] = d[j+1];
          d[j+1] = box;
          System.out.println(d[j] + ":" +d[j+1]);
        } else {

        }

      }

    }

  }

  static void print_data(int d[]) {
    for (int i = 0; i < d.length; i++)System.out.println(d[i] + "");
  }

  public static void main (String[] args){
    int data[] = {5,10,3,1,2,98};
    print_data(data);  //print_dataメソッドで今の順番を見せる
    bubble_sort(data); //bubble_sortメソッドで比較する
    print_data(data);
  }

}
