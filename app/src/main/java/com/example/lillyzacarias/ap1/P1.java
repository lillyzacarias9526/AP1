package com.example.lillyzacarias.ap1; /*indica el nombre del paquete donde se encuentra la clase*/

/*los imports que se encuentran aqui son lo que vamos a necesitar para trabajar dentro de la clase*/

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

   public class P1 extends Activity {

       /*el P1.java es la actividad de la aplicacion, en esta clase es donde se van
    a definir los metodos y llamadas a otras clases, asi como el funcionamiento de layout*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p1);

        /*
         * el parametro R.layout.activity_p1 corresponde al
         * fichero activity_p1.xml y a los objetos contenidos
         * en el.
         */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

         /* en esta parte se colocan las acciones concretas que el usuario en algun momento pueda solicitar, como
        ajustes, about, buscar etc.*/

        getMenuInflater().inflate(R.menu.activity_p1, menu);
        return true;
    }
    //metodo que llama a otro Activity
    public boolean onOptionsItemSelected(MenuItem mi){
        //evalua la opcionelejida al presionar la tecla menu
        //recibe como parametro un objeto de tipo MenuItem.

        switch(mi.getItemId()) {
            case R.id.menu_settings:
                /*si la opcion seleccionada corresponde al parametro
                 * R.id.menu_settings , entonces crea un nuevo
                 * Intent el cual recibe dos parametros de entrada,
                 * el primero corresponde a la clase actual P1.this, y
                 * el segundo a la clase a la que se desea acceder
                 * P2.class, la cual es un Activity*/
                Intent miIntent1 = new Intent(P1.this, P2.class);
                /*este metodo inicia la ejecucion del Activity, y
                 * recibe como parametro de entrada un Intent*/
                startActivity(miIntent1);
                break;
        }
        return true;
    }
}

