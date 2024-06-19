// MainActivity.java
package com.cookandroid.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onImageClicked(View view) {
        Intent intent;
        int viewId = view.getId();

        if (viewId == R.id.imageViewMenu) {
            intent = new Intent(this, com.cookandroid.finalproject.MenuActivity.class);
        } else if (viewId == R.id.imageViewTools) {
            intent = new Intent(this, com.cookandroid.finalproject.ToolsActivity.class);
        } else if (viewId == R.id.imageViewVariety) {
            intent = new Intent(this, com.cookandroid.finalproject.VarietyActivity.class);
        } else if (viewId == R.id.imageViewFranchise) {
            intent = new Intent(this, com.cookandroid.finalproject.FranchiseActivity.class);
        } else {
            return;
        }
        startActivity(intent);
    }

}
