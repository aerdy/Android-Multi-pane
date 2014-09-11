package com.example.multipaneanna;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Activity_utama extends Fragment{
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	View tampil = inflater.inflate(R.layout.activity_utama, container,false);
	return tampil;
}
}
