/** 
* @Description: 括号匹配问题 
* @Param:  
* @return:  
* @Author: 文兆杰
* @Date: 2019/4/3 
*/ 
public class Solution3  {
    public static  boolean isValid(String str) {
        int count=0;
        if (str == null || str.equals("")) {
            return false;
        }
        char[] chas=str.toCharArray();
        for (int i = 0; i <chas.length ; i++) {
            if (chas[i] == '(') {
                count++;
            }
            if (chas[i] == ')') {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count==0;
    }

    public static void main(String[] args) {
        String s = "()(";
        System.out.println(isValid(s));
    }
}
