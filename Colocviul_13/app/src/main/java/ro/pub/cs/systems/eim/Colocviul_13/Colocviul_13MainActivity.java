package ro.pub.cs.systems.eim.Colocviul_13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Colocviul_13MainActivity extends AppCompatActivity {

    private Button north_button;
    private Button west_button;
    private Button east_button;
    private Button south_button;
    private TextView textView;


    private GenericButtonClickListener genericButtonClickListener = new GenericButtonClickListener();
    private class GenericButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            textView.setAlpha(1);
            textView.setText(textView.getText().toString() + ((Button)view).getText().toString() + ", ");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colocviul_13_main);

        textView = (TextView)findViewById(R.id.text_view);

        north_button = (Button)findViewById(R.id.north_button);
        north_button.setOnClickListener(genericButtonClickListener);

        west_button = (Button)findViewById(R.id.west_button);
        west_button.setOnClickListener(genericButtonClickListener);

        east_button = (Button)findViewById(R.id.east_button);
        east_button.setOnClickListener(genericButtonClickListener);

        south_button = (Button)findViewById(R.id.south_button);
        south_button.setOnClickListener(genericButtonClickListener);
    }
}
