package com.example.collaborationstation;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TodoFragment extends Fragment {

	public TodoFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_todo, container, false);

		//setContentView(R.layout.fragment_todo);
		return rootView;
	}

}
