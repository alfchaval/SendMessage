package com.example.usuario.sendmessage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.example.usuario.sendmessage.pojo.Message;

/**
 * Esta clase recibe un mensaje y lo muestra en pantalla.
 *
 * @author Alfonso Chamorro Valle
 */

public class ViewMessageActivity extends AppCompatActivity {

    private TextView txvViewUser, txvViewMessage;

    private static final String TAG = "com.example.sendmessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_message);

        txvViewUser = (TextView) findViewById(R.id.txvViewUser);
        txvViewMessage = (TextView) findViewById(R.id.txvViewMessage);

        EscribirMensaje();

        Log.d(TAG, "ViewMessage: OnCreate()");
    }

    private void EscribirMensaje() {
        txvViewUser.setText(String.format(getResources().getString(R.string.el_usuario_te_ha_mandado_el_siguiente_mensaje), ((Message) getIntent().getExtras().getSerializable("message")).getUser().trim()));
        txvViewMessage.setText(((Message) getIntent().getExtras().getSerializable("message")).getMessage().trim());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ViewMessage: OnStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ViewMessage: OnResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ViewMessage: OnPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ViewMessage: OnStop()");
    }
}
