package ru.mirea.kirillov.mireaproject;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CalculateFragment#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class CalculateFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    EditText e1, e2;
    TextView t1;
    int num1, num2;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CalculateFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CalculateFragment newInstance(String param1, String param2) {
        CalculateFragment fragment = new CalculateFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public CalculateFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calculate, container, false);

        Button sum = (Button) view.findViewById(R.id.sum);
        sum.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (getNumbers()) {
                    int sum = num1 + num2;
                    t1.setText(Integer.toString(sum));
                }
            }
        });
        Button sub = (Button) view.findViewById(R.id.sub);
        sub.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {

                // get the input numbers
                if (getNumbers()) {
                    int sum = num1 - num2;
                    t1.setText(Integer.toString(sum));
                }
            }
        });
        Button pow = (Button) view.findViewById(R.id.pow);
        pow.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (getNumbers()) {
                    double sum = Math.pow(num1, num2);
                    t1.setText(Double.toString(sum));
                }
            }
        });
        Button mul = (Button) view.findViewById(R.id.mul);
        mul.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (getNumbers()) {
                    int sum = num1 * num2;
                    t1.setText(Integer.toString(sum));
                }
            }
        });
        Button div = (Button) view.findViewById(R.id.div);
        div.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (getNumbers()) {
                    double sum = num1 / (num2 * 1.0);
                    t1.setText(Double.toString(sum));
                }
            }
        });
        Button mod = (Button) view.findViewById(R.id.mod);
        mod.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (getNumbers()) {
                    double sum = num1 % num2;
                    t1.setText(Double.toString(sum));
                }
            }
        });
        return view;
    }

    public boolean getNumbers() {

        e1 = (EditText) getView().findViewById(R.id.num1);

        e2 = (EditText) getView().findViewById(R.id.num2);

        t1 = (TextView) getView().findViewById(R.id.result);

        String s1 = e1.getText().toString();

        String s2 = e2.getText().toString();

        if (s1.equals("") || s2.equals("")) {

            String result = "Please enter a value";
            t1.setText(result);

            return false;
        } else {
            // converting string to int.
            num1 = Integer.parseInt(s1);

            // converting string to int.
            num2 = Integer.parseInt(s2);
        }

        return true;
    }
}