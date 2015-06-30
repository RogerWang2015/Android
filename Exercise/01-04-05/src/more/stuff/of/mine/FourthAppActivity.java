package more.stuff.of.mine;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class FourthAppActivity extends Activity {
  TextView textView;
  CheckBox pepBox, cheeseBox;

  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.main);

      pepBox = 
          (CheckBox) findViewById(R.id.checkBox1);
      cheeseBox = 
          (CheckBox) findViewById(R.id.checkBox2);
      textView = 
          (TextView) findViewById(R.id.textView1);
  }

  public void onButton1Click(View view) {
    Intent intent = 
        new Intent(this, OtherActivity.class);
    intent.putExtra
        ("Pepperoni", pepBox.isChecked());
    intent.putExtra
        ("Extra cheese", cheeseBox.isChecked());
    startActivity(intent);
  }
}