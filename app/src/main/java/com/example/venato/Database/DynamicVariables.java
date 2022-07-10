package com.example.venato.Database;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class DynamicVariables {
    int weightOfFinancial;
    int weightOfBehavioural;
    Context context;

    public double weights[] = {0.1, 0.9};

    public DynamicVariables(Context _context) {
        context = _context;
    }

    public double[] returnWeights() {
        return weights;
    }


    public double[] calcCredit() {
        final double[] res = new double[1];
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Tweaks").child("Weights");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot i : snapshot.getChildren()) {
                    weights[0] = (double) i.getValue();
                    Log.i("Check weights", weights[0] + " ");

                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });
        return weights;
    }
}