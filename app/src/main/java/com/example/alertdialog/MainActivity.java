package com.example.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.ic_is)
                .setTitle("Be Alert!")
                .setMessage("Follow Social Distancing")
                .setNeutralButton("OK", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();
                    }
                }).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}