package com.example.pcp.as1;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class fragmentContainerActivity extends AppCompatActivity {
    FragmentManager fm; // fragment manager

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_container);
        fm = getSupportFragmentManager();
        moveToButtonsFragment(); // display 3 buttons
    }

    // 3 Buttons fragment
    public void moveToButtonsFragment(){
        ThreeOperationsFragment threeOperationsFragment = new ThreeOperationsFragment();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.activity_fragment_container,threeOperationsFragment);
        ft.commit();
    }


}
