package basic.algorithm2021.month07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_16199 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int dy=-Integer.parseInt(st.nextToken());
        int dm=-Integer.parseInt(st.nextToken());
        int dd=-Integer.parseInt(st.nextToken());

        st=new StringTokenizer(br.readLine());
        dy+=Integer.parseInt(st.nextToken());
        dm+=Integer.parseInt(st.nextToken());
        dd+=Integer.parseInt(st.nextToken());

        //만 나이
        if(dm>0) System.out.println(dy);
        else if(dm<0) System.out.println(dy-1);
        else {
            if(dd>=0) System.out.println(dy);
            else System.out.println(dy-1);
        }

        //세는 나이
        System.out.println(dy+1);

        //연나이
        System.out.println(dy);
    }
}
