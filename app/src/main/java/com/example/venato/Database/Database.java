package com.example.venato.Database;

import android.content.Context;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Database {
    Context context;

    FirebaseDatabase database;
    DatabaseReference userInfoRef;
    String systemId;

    public Database(Context _context){
        context=_context;
        database = FirebaseDatabase.getInstance();
    }
    public void putIdInDatabase(){
        DBClass ele=new DBClass();
        userInfoRef=database.getReference("Users");
        try{
            userInfoRef.child(ele.systemId).setValue(ele);
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }


}
