package com.example.cocov2.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.cocov2.R;


public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private CardView construccion;
    private CardView carpinteria;
    private CardView pintura;
    private CardView plomeria;
    private CardView electricidad;
    private CardView aireAcondicionado;
    private CardView tapizAlfombrado;
    private CardView impermeabilizante;

    //----------------------Menu de Rubros----------------------------------------------------
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        construccion = (CardView) root.findViewById(R.id.idConstruccion);
        carpinteria = (CardView) root.findViewById(R.id.idCarpinteria);
        pintura = (CardView) root.findViewById(R.id.idPintura);
        plomeria = (CardView) root.findViewById(R.id.idPlomeria);
        electricidad = (CardView) root.findViewById(R.id.idElectricidad);
        aireAcondicionado = (CardView) root.findViewById(R.id.idAireAcondicionado);
        tapizAlfombrado = (CardView) root.findViewById(R.id.idTapizAlfombrado);
        impermeabilizante = (CardView) root.findViewById(R.id.idImpermeabilizante);

//----------------------------------------------------------------------------------------------------
        construccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), construccion_pisos.class);
                startActivity(intent);
            }
        });

        carpinteria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Carpinteria.class);
                startActivity(intent);
            }
        });

        pintura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Pintura.class);
                startActivity(intent);
            }
        });

        plomeria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Plomeria.class);
                startActivity(intent);
            }
        });

        electricidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Electricidad.class);
                startActivity(intent);
            }
        });

        aireAcondicionado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AireAcondicionado.class);
                startActivity(intent);
            }
        });

        tapizAlfombrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AlfombradoTapiceria.class);
                startActivity(intent);
            }
        });

        impermeabilizante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Impermeabilizante.class);
                startActivity(intent);
            }
        });

        //--------------------------------------------------------------------------------------------
        final TextView textView = root.findViewById(R.id.text_home);


        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}