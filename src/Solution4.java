import java.util.Stack;

/**
* @Description: 逆序栈  不用其他数据结构  只用递归
* @Param:  
* @return:  
* @Author: 文兆杰
* @Date: 2019/4/3 
*/ 
public class Solution4 {
    /** 
    * @Description: 取出栈底元素，并保持原栈其他元素顺序不变
    * @Param: [stack] 
    * @return: int 
    * @Author: 文兆杰
    * @Date: 2019/4/3 
    */ 
    public static  int getAndRemoveLastElement(Stack<Integer> stack) {
        int result=stack.pop();
        if (stack.isEmpty()) {
            return result;
        } else {
            int last = getAndRemoveLastElement(stack);
            stack.push(result);
            return last;
        }
    }

    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int i = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(i);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        reverse(stack);
        System.out.println(stack);
    }


}
