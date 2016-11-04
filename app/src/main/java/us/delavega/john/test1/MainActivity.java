package us.delavega.john.test1;

import android.app.Activity;
import android.os.Bundle;

import android.util.Log;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;
import android.widget.SeekBar;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, menu);
        Button button = (Button) findViewById(R.id.button);

        final TextView textView  = (TextView) findViewById(R.id.textViewRandom);

        final SeekBar seekBar  = (SeekBar) findViewById(R.id.seekBar1);

        //textView.setText("test");

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
          //      Toast.makeText(MainActivity.this, "Button Clicked",	Toast.LENGTH_SHORT).show();
                double x = Math.random();

                textView.setText(Double.toString(x)); // requires final declaration

                seekBar.setMax(100);
                seekBar.setProgress((int)(x*100)); // random int 0 to 99
                //seekBar.setProgress(50); // OK

             //   System.out.print("test1");
              //  android.util.Log.d ("test1");
                Log.d("random = ", Double.toString(x));

            }

        });
        return true;
    }




}
