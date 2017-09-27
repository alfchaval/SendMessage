package com.example.usuario.sendmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SendMessageActivity extends AppCompatActivity {

    private EditText edtUser, edtMessage;
    private Button btnOK1, btnOK2;

    /*
        btnOK1 tiene onClick en el layout, mientras que btnOK2 usa un OnClickListener.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);

        edtUser = (EditText) findViewById(R.id.edtUser);
        edtMessage = (EditText) findViewById(R.id.edtMessage);
        btnOK1 = (Button)findViewById(R.id.btnOK1);
        btnOK2 = (Button)findViewById(R.id.btnOK1);

        btnOK2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MostrarMensaje();
            }
        });
    }

    public void getOnClick(View view) {
        switch (view.getId()) {
            case R.id.btnOK1:
                MostrarMensaje();
                break;
        }
    }

    private void MostrarMensaje() {
        Bundle bundle = new Bundle();
        bundle.putString("strUser", edtUser.getText().toString());
        bundle.putString("strMessage", edtMessage.getText().toString());
        Intent intent = new Intent(SendMessageActivity.this, ViewMessageActivity.class);
        startActivity(intent);
    }
}
