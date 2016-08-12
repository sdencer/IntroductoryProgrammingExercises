package com.jinli.Code;

/**
 * Created by jinli on 8/2/16.
 */
public class Diamond {

    public String test1(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<n;i++){
            for (int j=n-i-1;j>0;j--){
                sb.append(" ");
            }
            for (int k=0;k<2*i+1;k++){
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public String test2(int n) {

        StringBuffer sb = new StringBuffer();
        for (int i=0;i<n;i++){
            for (int j=n-i-1;j>0;j--){
                sb.append(" ");
            }
            for (int k=0;k<2*i+1;k++){
                sb.append("*");
            }
            sb.append("\n");
        }

        for (int i=0;i<n-1;i++){
            for (int j=0;j<i+1;j++){
                sb.append(" ");
            }
            for (int k=0;k<n-2*i;k++){
                sb.append("*");
            }
            sb.append("\n");
        }

        return sb.toString();

    }

    public String test3(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<n;i++){
            for (int j=n-i-1;j>0;j--){
                sb.append(" ");
            }
            for (int k=0;k<2*i+1;k++){
                if (n==i+1){
                    sb.append("Sdencer");
                    break;
                }else {
                    sb.append("*");
                }

            }
            sb.append("\n");
        }

        for (int i=0;i<n-1;i++){
            for (int j=0;j<i+1;j++){
                sb.append(" ");
            }
            for (int k=0;k<n-2*i;k++){
                sb.append("*");
            }
            sb.append("\n");
        }

        return sb.toString();

    }
}
