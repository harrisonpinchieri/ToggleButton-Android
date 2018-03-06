package togglebutton.cursoandroid.com.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleButton;
    private TextView textoExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toggleButton = findViewById(R.id.toggleButtonId);
        textoExibicao= findViewById(R.id.textoExibicaoId);

//         Associa um evento ao toggleButton
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                textoExibicao.setText("");
//                se for true, vai mostrar o texto
                if(b){
                    textoExibicao.setText("mostrar...");
                }

            }
        });


    }
}
