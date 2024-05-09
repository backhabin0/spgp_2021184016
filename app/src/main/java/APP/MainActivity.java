package APP;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import com.example.cookingcraze.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //@Override
    //public boolean onTouchEvent(MotionEvent event) {
    //    if (event.getAction() == MotionEvent.ACTION_DOWN) {
    //        startActivity(new Intent(this, pizzagameActivity.class));
    //    }
    //    return false;
    //}
    public void onBtnStartGame(View view){
        startActivity(new Intent(this,pizzagameActivity.class));
    }
}