package com.example.eazybill;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NewUserAddition extends AppCompatActivity {

    EditText mobileNumber,Name,Address;
    Button AddButton;
    TextView errorText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user_addition);
        initComponents();
    }

    private void initComponents(){
        mobileNumber = findViewById(R.id.mobileNo);
        Name = findViewById(R.id.name);
        Address = findViewById(R.id.address);
        AddButton = findViewById(R.id.addCustomer);
        errorText = findViewById(R.id.ErrorText);

        mobileNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

               if(charSequence.length() == 10){
                    validateMobileNumber(charSequence.toString());
               }
               else{
                   AddButton.setVisibility(View.INVISIBLE);
                   errorText.setVisibility(View.INVISIBLE);
               }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

    private void validateMobileNumber(String mobileNo){
        if (mobileNo.equals("9443098845")){
            errorText.setText("Already Exists");
            errorText.setTextColor(Color.RED);
            errorText.setVisibility(View.VISIBLE);
        }
        else{
            AddButton.setVisibility(View.VISIBLE);
        }
    }
}