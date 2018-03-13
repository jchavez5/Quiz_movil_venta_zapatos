package com.jose.taller_zapatos;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText cantidad;
    private TextView resultado;
    private Resources recursos;
    private Spinner genero_spinner,tipo_spinner,marca_spinner;
    private String genero[],tipo[],marca[];
    private Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cantidad=findViewById(R.id.id_cantidad);
        resultado=findViewById(R.id.id_total);
        recursos=this.getResources();

        genero_spinner=findViewById(R.id.id_genero);
        tipo_spinner=findViewById(R.id.id_tipo);
        marca_spinner=findViewById(R.id.id_marca);

        genero=recursos.getStringArray(R.array.lista_genero);
        ArrayAdapter<String> adapter= new ArrayAdapter(this,android.R.layout.simple_spinner_item,genero);
        genero_spinner.setAdapter(adapter);

        tipo=recursos.getStringArray(R.array.lista_tipo);
        ArrayAdapter<String> adapter1 =new ArrayAdapter(this,android.R.layout.simple_spinner_item,tipo);
        tipo_spinner.setAdapter(adapter1);

        marca=recursos.getStringArray(R.array.lista_marca);
        ArrayAdapter<String> adapter2 =new ArrayAdapter(this,android.R.layout.simple_spinner_item,marca);
        marca_spinner.setAdapter(adapter2);

        boton=findViewById(R.id.id_boton);

    }
    public void calculo(View v){
        if (validar()){

            double cant, valor=0;
            resultado.setText("");/*setear la caja*/
            int opciones_genero,opciones_tipo,opciones_marca;
            cant=Double.parseDouble(cantidad.getText().toString());



            opciones_genero  = genero_spinner.getSelectedItemPosition();
            opciones_tipo  = tipo_spinner.getSelectedItemPosition();
            opciones_marca=marca_spinner.getSelectedItemPosition();

            switch (opciones_genero){
                case 0:/*hombre*/
                    switch (opciones_tipo){
                        case 0:/*zapatilla*/
                            switch (opciones_marca){
                                case 0:/*nike*/
                                    valor=metodo.total_pago(cant,120000    );
                                    break;
                                case 1:/*adiddas*/
                                    valor=metodo.total_pago(cant,140000    );
                                    break;
                                case 2:/*puma*/
                                    valor=metodo.total_pago(cant,130000    );
                                    break;
                            }
                            break;
                        case 1:/*clasico*/
                            switch (opciones_marca){
                                case 0:/*nike*/
                                    valor=metodo.total_pago(cant,50000    );
                                    break;
                                case 1:/*adiddas*/
                                    valor=metodo.total_pago(cant,80000  );
                                    break;
                                case 2:/*puma*/
                                    valor=metodo.total_pago(cant,100000  );
                                    break;
                            }
                            break;
                    }

                    break;
                case 1:/*mujer*/
                    switch (opciones_tipo){
                        case 0:/*zapatilla*/
                            switch (opciones_marca){
                                case 0:/*nike*/
                                    valor=metodo.total_pago(cant,110000    );
                                    break;
                                case 1:/*adiddas*/
                                    valor=metodo.total_pago(cant,130000 );
                                    break;
                                case 2:/*puma*/
                                    valor=metodo.total_pago(cant,110000 );
                                    break;
                            }
                            break;
                        case 1:/*clasico*/
                            switch (opciones_marca){
                                case 0:/*nike*/
                                    valor=metodo.total_pago(cant,60000 );
                                    break;
                                case 1:/*adiddas*/
                                    valor=metodo.total_pago(cant,70000  );
                                    break;
                                case 2:/*puma*/
                                    valor=metodo.total_pago(cant,120000  );
                                    break;
                            }
                            break;
                    }

                    break;
            }
            resultado.setText(""+String.format("%.2f",valor));

        }


    }

    public boolean validar(){
        if (cantidad.getText().toString().equals("")){
            cantidad.requestFocus();
            cantidad.setError(recursos.getString(R.string.error));
            return false;
        }
        if (){

        }
        return true;
    }

}
