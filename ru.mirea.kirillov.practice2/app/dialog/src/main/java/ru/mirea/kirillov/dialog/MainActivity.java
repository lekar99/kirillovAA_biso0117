package ru.mirea.kirillov.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickShowDialog(View view) {
        AlertDialogFragment dialogFragment = new AlertDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }
    public void onClickTime(View view) {
        MyTimeDialogFragment timeFragment = new MyTimeDialogFragment();
        timeFragment.show(getSupportFragmentManager(),"mirea");
    }
    public void onClickDate(View view) {
        MyDateDialogFragment dateFragment = new MyDateDialogFragment();
        dateFragment.show(getSupportFragmentManager(),"mirea");
    }
    public void onClickProgress(View view) {
        MyProgressDialogFragment progressFragment = new MyProgressDialogFragment();
        progressFragment.show(getSupportFragmentManager(),"mirea");
    }
    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }
}