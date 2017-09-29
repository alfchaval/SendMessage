package com.example.usuario.sendmessage.pojo;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Clase pojo y tal
 *
 * @author Alfonso Chamorro Valle
 */

public class Message implements Serializable{

    private String message, user;

    public Message(String message, String user) {
        this.message = message;
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        //si se va a devolver una variable 'result', solo debería haber un return.
        boolean result = true;
        if(this != o) {
            if(o == null || getClass() != o.getClass()) {
                result = false;
            }
            else {
                Message message1 = (Message) o;
                if(!message.equals(message1.message) || !user.equals(message1.user)) {
                    result = false;
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return user + ": " + message;
    }
}
