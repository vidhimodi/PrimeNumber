package com.example.modi.primenumber;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends Activity {
    Random rand = new Random();
    int number = rand.nextInt(1000)+1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface myTypeface_text = Typeface.createFromAsset(getAssets(),"Pacifico.ttf");
        TextView textView_welcome = (TextView)findViewById(R.id.textView);
        textView_welcome.setTypeface(myTypeface_text);

        Typeface myTypeface_button = Typeface.createFromAsset(getAssets(),"Capture_it.ttf");
        Button button_continue = (Button)findViewById(R.id.continuButton);
        button_continue.setTypeface(myTypeface_button);
    }



    public void onClickYes(View view) {
        int temp;
        boolean isPrime = true;
        for(int i=2;i<=number/2;i++)
        {
            temp=number%i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
        }
        if (isPrime == true) {
            Toast.makeText(getApplicationContext(), "Yohoo!! Correct Answer :D", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Wrong Answer :(", Toast.LENGTH_SHORT).show();
        }
    }
    public void onClickNo(View view) {
        int temp;
        boolean isPrime = true;
        for(int i=2;i<=number/2;i++)
        {
            temp=number%i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
        }
        if (isPrime == true) {
            Toast.makeText(getApplicationContext(), "Wrong Answer :(", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Yohoo!! Correct Answer :D", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickNext(View view) {

        number = rand.nextInt(1000)+1;
        TextView myText = (TextView)findViewById(R.id.textView3);
        String myString = String.valueOf(number);
        myText.setText(myString);

    }

    public void showQuesMenu(View view)
    {
       setContentView(R.layout.prime_ques);
        number = rand.nextInt(1000)+1;
        Typeface myTypeface_text = Typeface.createFromAsset(getAssets(),"Pacifico.ttf");
        TextView textView_primeques = (TextView)findViewById(R.id.textView2);
        textView_primeques.setTypeface(myTypeface_text);

        TextView textView_primenum = (TextView)findViewById(R.id.textView3);
        textView_primenum.setTypeface(myTypeface_text);

        Typeface myTypeface_button = Typeface.createFromAsset(getAssets(),"Capture_it.ttf");
        Button button_yes = (Button)findViewById(R.id.yesButton);
        button_yes.setTypeface(myTypeface_button);

        Button button_no = (Button)findViewById(R.id.noButton);
        button_no.setTypeface(myTypeface_button);

        Button button_next = (Button)findViewById(R.id.nextButton);
        button_next.setTypeface(myTypeface_button);


        TextView myText = (TextView)findViewById(R.id.textView3);
        String myString = String.valueOf(number);
        myText.setText(myString);


    }


}
