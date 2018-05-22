package xjyz.proguard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import xjyz.proguard.domain.Student;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Member member=new Member();
        member.print();
        Member member1=new Member();

    }
}
