package com.example.usuario.sendmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.usuario.sendmessage.pojo.Message;

/**
 * Esta clase envía un mensaje a otra.
 *
 * @author Alfonso Chamorro Valle
 */

public class SendMessageActivity extends AppCompatActivity {

    private EditText edtUser, edtMessage;
    private Button btnOK1, btnOK2;

    private static final String TAG = "com.example.sendmessage";

    /*
        btnOK1 tiene onClick en el layout, mientras que btnOK2 usa un OnClickListener.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);

        edtUser = (EditText) findViewById(R.id.edtUser);
        edtMessage = (EditText) findViewById(R.id.edtMessage);
        btnOK1 = (Button) findViewById(R.id.btnOK1);
        btnOK2 = (Button) findViewById(R.id.btnOK2);

        btnOK2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MostrarMensaje();
            }
        });

        Log.d(TAG, "SendMessage: OnCreate()");
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
        Message message = new Message(edtUser.getText().toString(), edtMessage.getText().toString());
        bundle.putSerializable("message", message);
        Intent intent = new Intent(SendMessageActivity.this, ViewMessageActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "SendMessage: OnStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "SendMessage: OnResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "SendMessage: OnPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "SendMessage: OnStop()");
    }
}