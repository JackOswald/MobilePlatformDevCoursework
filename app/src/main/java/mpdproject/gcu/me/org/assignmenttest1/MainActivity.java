///// Jack Oswald - S1312968 /////

package mpdproject.gcu.me.org.assignmenttest1;

import android.content.Intent;
import android.support.annotation.BoolRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public Button cIButton;
    public Button pRButton;

    public static Boolean isCI;
    public static Boolean isPR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cIButton = (Button) findViewById(R.id.cIButton);
        cIButton.setOnClickListener(this);
        pRButton = (Button) findViewById(R.id.pRButton);
        pRButton.setOnClickListener(this);
    }

    public void onClick(View theView)
    {
        Intent theIntent;
        if (theView == cIButton)
        {
            isCI = true;
            isPR = false;
            theIntent = new Intent(getApplicationContext() ,RSSData.class);
            startActivity(theIntent);

        }
        else if (theView == pRButton)
        {
            isCI = false;
            isPR = true;
            theIntent = new Intent(getApplicationContext() ,RSSData.class);
            startActivity(theIntent);
        }
    }

    public static Boolean getIsCI()
    {
        return isCI;
    }


    public static Boolean getIsPR()
    {
        return isPR;
    }



}