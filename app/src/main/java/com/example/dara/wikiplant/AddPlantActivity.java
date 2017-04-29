package com.example.dara.wikiplant;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AddPlantActivity extends AppCompatActivity {

    @BindView(R.id.imageView)
    ImageView imageView;
    @BindView(R.id.editText_name)
    EditText editTextName;
    @BindView(R.id.editText_genus)
    EditText editTextGenus;
    @BindView(R.id.editText_taxonomy)
    EditText editTextTaxonomy;
    @BindView(R.id.button_add)
    Button buttonAdd;
    @BindView(R.id.editText_description)
    EditText editTextDescription;
    private DatabaseReference mDatabase;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_plant);
        ButterKnife.bind(this);


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

    }

}
