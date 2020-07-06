package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView mTextView;
    Button mTopButton;
    Button mBottomButton;
    int mStoryIndex=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
            mTextView=findViewById(R.id.storyTextView);
            mTopButton=findViewById(R.id.buttonTop);
            mBottomButton=findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
            mTopButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("Destini", "Top Button Pressed");

                    if (mStoryIndex == 1 ) {
                        mTextView.setText(R.string.T3_Story);
                        mTopButton.setText(R.string.T3_Ans1);
                        mBottomButton.setText(R.string.T3_Ans2);
                        mStoryIndex = 3;
                    } else if (mStoryIndex == 3) {
                        mTextView.setText(R.string.T6_End);
                        mTopButton.setVisibility(view.GONE);
                        mBottomButton.setVisibility(view.GONE);
                    } else if (mStoryIndex==2){
                        mTextView.setText(R.string.T3_Story);
                        mTopButton.setText(R.string.T3_Ans1);
                        mBottomButton.setText(R.string.T3_Ans2);
                        mStoryIndex = 3;
                    }
                }
            });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
            mBottomButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("destini", "bottom Button Pressed");
                    if (mStoryIndex == 1) {
                        mTextView.setText(R.string.T2_Story);
                        mTopButton.setText(R.string.T2_Ans1);
                        mBottomButton.setText(R.string.T2_Ans2);
                        mStoryIndex = 2;
                    } else if (mStoryIndex == 3) {
                        mTextView.setText(R.string.T5_End);
                        mTopButton.setVisibility(view.GONE);
                        mBottomButton.setVisibility(view.GONE);
                    } else if (mStoryIndex==2){
                        mTextView.setText(R.string.T4_End);
                        mTopButton.setVisibility(view.GONE);
                        mBottomButton.setVisibility(view.GONE);
                    }
                }
            });

    }
}
