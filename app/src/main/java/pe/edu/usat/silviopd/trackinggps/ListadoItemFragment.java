package pe.edu.usat.silviopd.trackinggps;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pe.edu.usat.silviopd.trackinggps.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListadoItemFragment extends Fragment {


    public ListadoItemFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_listado_item, container, false);
    }

}
