package ir.veisi.pedram.sunshine.fragments;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ir.veisi.pedram.sunshine.R;


/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);

        Intent intent = getActivity().getIntent();
        String dayForecast = intent.getStringExtra(Intent.EXTRA_TEXT);

        TextView forecastTextView = (TextView) rootView.findViewById(R.id.detail_forecast_textview);
        forecastTextView.setText(dayForecast);

        return rootView;
    }
}
