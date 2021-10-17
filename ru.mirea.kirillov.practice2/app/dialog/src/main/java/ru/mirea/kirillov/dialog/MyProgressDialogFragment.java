package ru.mirea.kirillov.dialog;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class MyProgressDialogFragment extends DialogFragment implements DialogInterface.OnShowListener {
    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new ProgressDialog(getActivity());
    }

    @Override
    public void onShow(DialogInterface dialogInterface) {

    }
}
