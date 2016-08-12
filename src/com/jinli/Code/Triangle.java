package com.jinli.Code;

/**
 * Created by jinli on 8/2/16.
 */
public class Triangle {

    public String test1(){
        System.out.print("*");
        return "*";
    }

    public String test2(int n){
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<n;i++){
            sb.append("*");
        }
        return sb.toString();
    }

    public String test3(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i ++) {
            sb.append("*\n");
        }
        return sb.toString();
    }

    public String test4(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                sb.append("*");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
