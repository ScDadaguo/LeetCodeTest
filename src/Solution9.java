/** 
* @Description: 258.各位相加
* @Param:  
* @return:  
* @Author: 文兆杰
* @Date: 2019/4/4 
*/ 
public class Solution9 {
    public int addDigits(int num) {
        int sum=0;

        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        if (sum < 10) {
            return sum;
        } else {
            num=sum;
            sum=0;
            addDigits(num);
            return sum;
        }
    }
}
