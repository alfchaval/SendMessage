package com.example.usuario.sendmessage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Esta clase recibe un mensaje y lo muestra en pantalla.
 * @author Alfonso Chamorro Valle
 */

public class ViewMessageActivity extends AppCompatActivity {

    TextView txvViewUser, txvViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_message);

        txvViewUser = (TextView) findViewById(R.id.txvViewUser);
        txvViewMessage = (TextView) findViewById(R.id.txvViewMessage);

        EscribirMensaje();
    }

    private void EscribirMensaje() {
        txvViewUser.setText(String.format(getResources().getString(R.string.el_usuario_te_ha_mandado_el_siguiente_mensaje), getIntent().getExtras().getString("strUser").trim()));
        txvViewMessage.setText(getIntent().getExtras().getString("strMessage").trim());
    }
}
