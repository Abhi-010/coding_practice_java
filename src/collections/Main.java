package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();
        map.put("apple",5) ;
        map.put("banana",2) ;
        map.put("watermelon",1);
        map.put("orange",1);

        String[][] ans = sortMap(map);
        for(int i = 0 ; i < ans.length ; i++){
            System.out.print(ans[i][0] + " " + ans[i][1]);
            System.out.println();
        }
    }
    public static String[][] sortMap(HashMap<String,Integer> map){

        TreeMap<String, Integer> treeMap = new TreeMap<>(map);


        int n = treeMap.size() ;
        System.out.println("n : " + n);



        String[][] ans = new String[n][2];
        int i = 0 ;

        for(Map.Entry<String,Integer> entry : treeMap.entrySet()){
            ans[i][0] = entry.getKey();
            ans[i][1] = entry.getValue() + "" ;
            i++ ;
        }
        return ans ;
    }
}
