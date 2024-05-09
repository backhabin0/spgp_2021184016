package com.example.cookingcraze;
import com.example.cookingcraze.R;
import com.example.cookingcraze.framework.objects.VertScrollBackground;
import com.example.cookingcraze.framework.scene.Scene;
public class MainScene extends Scene{
    public enum Layer {
        bg, COUNT,player
    }
    public MainScene() {
        initLayers(Layer.COUNT);

        add(Layer.bg, new VertScrollBackground(R.mipmap.background, 0.0f));
        //add(Layer.player, new Pizza());


    }
}
