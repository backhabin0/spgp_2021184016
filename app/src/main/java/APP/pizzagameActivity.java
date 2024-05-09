package APP;
import android.os.Bundle;
import com.example.cookingcraze.framework.scene.Scene;
import com.example.cookingcraze.MainScene;
import com.example.cookingcraze.framework.activity.GameActivity;
import com.example.cookingcraze.BuildConfig;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
public class pizzagameActivity extends GameActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        new MainScene().push();
    }
}
