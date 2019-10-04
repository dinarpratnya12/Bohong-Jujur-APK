package com.dinar.studikasus;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentSatu extends Fragment {

    View view;
    EditText edtText1;
    TextView viewText1;
    Button button1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_fragment_satu,container,false);
        edtText1 = view.findViewById(R.id.edtText1);
        viewText1 = view.findViewById(R.id.viewText1);
        button1 = view.findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = edtText1.getText().toString();
                String[] aData = data.split(" ");

                String hasil = "";
                for (int i = aData.length-1; i>0; i--){
                    if (aData[i].equals("Bohong")){
                        if (aData[i-1].equals("Bohong")){
                            aData[i-1] = "Jujur";
                        }else if (aData[i].equals("Jujur")){
                            aData[i-1] = "Bohong";
                        }else {
                            aData[i-1] = "Bohong";
                        }
                    }
                }
                hasil = aData[0];
                viewText1.setText(hasil);
            }
        });
        return view;
    }
}
