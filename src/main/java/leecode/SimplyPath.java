package leecode;

import java.util.Stack;

public class SimplyPath {
    public static void main(String[] args) {
        String path="/a/b/../c/./d";
        Stack<String> stack = new Stack<String>();
        for(int i=0;i<path.length();i++){
            String name = "";
            while(i<path.length()&&path.charAt(i)=='/'){
                i++;
            }
            while(i<path.length()&&path.charAt(i)!='/'){
                name +=path.charAt(i);
                i++;
            }
            if(!name.equals(".")&&!name.equals("..")){
                stack.push(name);
            }
            if(!stack.isEmpty()&&name.equals("..")){
                stack.pop();
            }
        }
        String simplyPath = "";
        String t = "";
        while (!stack.isEmpty()){
            t  = stack.pop();
            simplyPath = "/" + t + simplyPath;
;
        }
        System.out.println(simplyPath);
    }
}
