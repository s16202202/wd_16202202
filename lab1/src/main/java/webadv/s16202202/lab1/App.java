package webadv.s16202202.lab1;

import org.apache.commons.codec.digest.DigestUtils;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import static org.apache.commons.codec.digest.DigestUtils.sha256Hex;

public class App {
	public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        //账号密码
        System.out.print("输入账号：");
        Scanner input = new Scanner(System.in);
        String account = input.next();
        System.out.print("输入密码：");
        String mima = input.next();

        //读取文件里的用户名，密码
        String temp = "";
        try {

            FileReader file = new FileReader("Account.txt");
            BufferedReader reader = new BufferedReader(file);
            try {
                while ((temp = reader.readLine()) != null) {
                    temp = temp.substring(temp.indexOf(":") + 1, temp.length()); //读取“：”的内容
                    list.add(temp);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //获得文件里的用户名、密码
        String account1 = list.get(0);
        String mima1 = list.get(1);
        
        //对输入密码进行加密
        mima = sha256Hex(mima);
        
        //System.out.println(mima);

        //账号、密码匹配
        if(account1.equals(account)  && mima1.equals(mima)){
            System.out.println("登录成功");
        }

        else {
            System.out.println("密码错误");
        }

    }
    public static String sha256hex(String input) {
        return sha256Hex(input);
    }


}
