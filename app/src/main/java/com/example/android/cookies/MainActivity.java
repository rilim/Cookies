package com.example.android.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.android.cookies.R.id.status_text_view;
import static com.example.android.cookies.R.string.reset;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the button
        Button eat = (Button) findViewById(R.id.button_1);

        // Set a click listener on that View
        eat.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                //TODO: Find a reference to the ImageView in the layout. Change the image.
                    ImageView hungry = (ImageView) findViewById(R.id.android_cookie_image_view);
                  hungry.setImageResource(R.drawable.after_cookie);

                // TODO: Find a reference to the TextView in the layout. Change the text.
                  TextView statusTextView = (TextView) findViewById(status_text_view);
                    statusTextView.setText(R.string.full);

                /**
                 * changes button title from "Eat Cookie" to "Reset"
                 */
                   TextView button = (TextView) findViewById(R.id.button_1);
                 button.setText(reset);

            }

        });



                // Find the button
           //    Button reset = (Button) findViewById(R.id.button_2);

                // Set a click listener on that View
            //   reset.setOnClickListener(new View.OnClickListener() {
                    // The code in this method will be executed when the numbers View is clicked on.
            //       @Override
            //     public void onClick(View view) {
                        //TODO: Find a reference to the ImageView in the layout. Change the image.
              //        ImageView hungry = (ImageView) findViewById(R.id.android_cookie_image_view);
              //        hungry.setImageResource(R.drawable.before_cookie);

                        // TODO: Find a reference to the TextView in the layout. Change the text.
               //       TextView statusTextView = (TextView) findViewById(status_text_view);
               //      statusTextView.setText(R.string.hungry);

                        /**
                         * changes button title from "Reset" to "Eat_Cookie"
                         */
              //       TextView button = (TextView) findViewById(R.id.button_1);
              //        button.setText(eat_cookie);
                    }
          //    });

            }




    /**
     * Called when the cookie should be eaten.
     */
       // public void eatCookie(View view) {
            // TODO: Find a reference to the ImageView in the layout. Change the image.
        //    ImageView hungry = (ImageView) findViewById(android_cookie_image_view);
         //   hungry.setImageResource(R.drawable.after_cookie);

            // TODO: Find a reference to the TextView in the layout. Change the text.
         //   TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
       //     statusTextView.setText(R.string.full);

            /**
             * changes button title from "Eat Cookie" to "Reset"
             */
       //     TextView button = (TextView) findViewById(R.id.button_1);
        //    button.setText(R.string.reset);


     //   }



    //  public void reset(View View) {
      //  ImageView hungry = (ImageView) findViewById(R.id.android_cookie_image_view);
     //    hungry.setImageResource(R.drawable.before_cookie);

     //   TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
   //     statusTextView.setText(R.string.hungry);
  //  }

}