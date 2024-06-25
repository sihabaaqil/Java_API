package Demo;

public class Position_Array {

    public static void main(String[] args) {
            int[] a ={1,2,3,4,5,6,7,8,9,78,77};
            int a_n = 2;
        int s = find_position(a,a_n);
        System.out.println(""+s);
    }

    public static int find_position(int[] s, int d){
      for (int i =0;i<s.length;i++){
          if (s[i] == d){
              return i;
          }
      }
      return -1;
    }


}
