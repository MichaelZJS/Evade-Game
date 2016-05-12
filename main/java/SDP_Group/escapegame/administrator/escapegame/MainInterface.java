package SDP_Group.escapegame.administrator.escapegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainInterface extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_interface);

        ///Creating the button & set onClickListener
        Button button1 = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToStartScreen();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToRankScreen();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToStaffScreen();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToHelpScreen();
            }
        });

    }
    ///Intent is used for switching Screen
    private void goToStartScreen(){
        Intent intent = new Intent(this, start.class);
        startActivity(intent);
    }
    private void goToRankScreen(){
        Intent intent = new Intent(this, rank.class);
        startActivity(intent);
    }

    private void goToStaffScreen(){
        Intent intent = new Intent(this, staff.class);
        startActivity(intent);
    }

    private void goToHelpScreen(){
        Intent intent = new Intent(this, help.class);
        startActivity(intent);
    }
}
