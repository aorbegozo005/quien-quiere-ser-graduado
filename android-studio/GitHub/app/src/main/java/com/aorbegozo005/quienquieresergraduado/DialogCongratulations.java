package com.aorbegozo005.quienquieresergraduado;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;

/**
 * Created by Ander on 2015/03/17.
 */
public class DialogCongratulations extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder eldialogo = new AlertDialog.Builder(getActivity());
        eldialogo.setTitle(getString(R.string.congratulations));
        eldialogo.setMessage(getString(R.string.congratulations_msg));
        eldialogo.setPositiveButton(getString(R.string.aceptar),new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ((JuegoActivity)getActivity()).nuevaPartida();
            }
        });
        eldialogo.setNegativeButton(getString(R.string.no), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });
        return eldialogo.create();
    }
}
