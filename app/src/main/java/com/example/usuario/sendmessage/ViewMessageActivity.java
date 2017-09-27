package com.example.usuario.sendmessage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

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
        Intent intent = getIntent();
        txvViewUser.setText("El usuario " + intent.getExtras().getString("strUser").trim() + " te ha mandado el siguiente mensaje");
        txvViewMessage.setText(intent.getExtras().getString("strMessage").trim());
    }
}
