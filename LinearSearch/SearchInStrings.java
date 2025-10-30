package LinearSearch;

public class SearchInStrings{
    public static void main(String[] args){
        String SearchInString = "AniketSingh";
        char target = 'z';
        System.out.println(Search(SearchInString,target));
        //or 
        // for using fo each loop
        // System.out.println(Arrays.toString(SearchInString.toCharAray()));
    }
    static boolean Search(String str , char target){
        if (str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }

        }
          return false;  
        //use foreach loop 
        // for (char ch : str.toCharArray()) {
        //     if (ch == target){
        //         return true;
        //     }
            
        // }
        // return false;
             
    }
}