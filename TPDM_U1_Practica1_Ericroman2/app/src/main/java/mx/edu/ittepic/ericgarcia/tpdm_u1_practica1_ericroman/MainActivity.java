package mx.edu.ittepic.ericgarcia.tpdm_u1_practica1_ericroman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.txt1);
        num2 = findViewById(R.id.txt2);
        text = findViewById(R.id.textcolor);
    }
    public void cambiarcolor(View v){
        //text.setTextColor(@);
    }
    public void sumarnumeros(View v){
        String mensaje = (Integer.parseInt(num1.getText().toString())+Integer.parseInt(num2.getText().toString()))+"  Es el resultado";
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();
    }
    public void multiplicarnumeros(View v){
        String mensaje = (Integer.parseInt(num1.getText().toString())*Integer.parseInt(num2.getText().toString()))+"  Es el resultado";
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();
    }
    public void compararnumeros(View v){
        String mensaje = Integer.parseInt(num2.getText().toString())+"  Es el mayor";
        if(Integer.parseInt(num1.getText().toString())>Integer.parseInt(num2.getText().toString())){
            mensaje = Integer.parseInt(num1.getText().toString())+"  Es el mayor";
        }
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();
    }
}