package xjyz.proguard;

import android.util.Log;

/**
 * Created by Administrator on 2018/5/22 0022.
 */

public class Member {
//    5.  静态代码块在类加载期间执行，而且只执行一次，且执行顺序为静态代码块  构造代码块   构造函数

    //1 静态代码块
    static {
        Log.e("tag", "-------静态代码块--------");
    }

    //2 构造代码块
    {
        Log.e("tag", "-------构造代码块--------");
    }

    //3 构造函数
    public Member() {
        Log.e("tag", "-------构造函数--------");
    }


//    6.  类中的成员包括成员变量，成员函数，构造函数，构造代码块，静态成员，静态代码块

    private String hobby;

    public void print() {
        Log.e("tag", "------hobby=" + hobby);
    }

    public static int growUp=10;

}
