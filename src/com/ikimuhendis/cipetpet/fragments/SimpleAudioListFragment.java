package com.ikimuhendis.cipetpet.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.actionbarsherlock.app.SherlockFragment;
import com.ikimuhendis.cipetpet.R;
import com.ikimuhendis.cipetpet.util.MediaPlayerUtil;

@SuppressLint("ValidFragment")
public class SimpleAudioListFragment extends SherlockFragment {

	private static SimpleAudioListFragment fragment;

	public static SimpleAudioListFragment getInstance() {
		if (fragment == null) {
			fragment = new SimpleAudioListFragment();
		}
		return fragment;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		final RelativeLayout relativeLayout = (RelativeLayout) inflater
				.inflate(R.layout.fragment_audiolist, container, false);

		final ListView listview = (ListView) relativeLayout
				.findViewById(R.id.listView);
		final String[] audio_list = getResources().getStringArray(
				R.array.audio_simple_list);
		final ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				getActivity(), android.R.layout.simple_list_item_1, audio_list);
		listview.setAdapter(adapter);
		listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				int resourceId = -1;
				if (position == 0) {
					resourceId = R.raw.simp_caca;
				} else if (position == 1) {
					resourceId = R.raw.simp_cak;
				} else if (position == 2) {
					resourceId = R.raw.simp_cap;
				} else if (position == 3) {
					resourceId = R.raw.simp_cel;
				} else if (position == 4) {
					resourceId = R.raw.simp_cer;
				} else if (position == 5) {
					resourceId = R.raw.simp_cipi;
				} else if (position == 6) {
					resourceId = R.raw.simp_criling;
				} else if (position == 7) {
					resourceId = R.raw.simp_eyav;
				} else if (position == 8) {
					resourceId = R.raw.simp_kaf;
				} else if (position == 9) {
					resourceId = R.raw.simp_kah;
				} else if (position == 10) {
					resourceId = R.raw.simp_kis;
				} else if (position == 11) {
					resourceId = R.raw.simp_kiya;
				} else if (position == 12) {
					resourceId = R.raw.simp_kiyak;
				} else if (position == 13) {
					resourceId = R.raw.simp_liooo;
				} else if (position == 14) {
					resourceId = R.raw.simp_pirrr;
				} else if (position == 15) {
					resourceId = R.raw.simp_vayis;
				} else if (position == 16) {
					resourceId = R.raw.simp_vec;
				} else if (position == 17) {
					resourceId = R.raw.simp_veris;
				} else if (position == 18) {
					resourceId = R.raw.simp_veste;
				} else if (position == 19) {
					resourceId = R.raw.simp_vijio;
				} else if (position == 20) {
					resourceId = R.raw.simp_zirrr;
				} else if (position == 21) {
					resourceId = R.raw.simp_bicinik;
				} else if (position == 22) {
					resourceId = R.raw.simp_cibili;
				} else if (position == 23) {
					resourceId = R.raw.simp_pet;
				} else if (position == 24) {
					resourceId = R.raw.simp_ci;
				} else if (position == 25) {
					resourceId = R.raw.simp_cipetpet;
				} else if (position == 26) {
					resourceId = R.raw.simp_sak;
				}
				MediaPlayerUtil.playAudioFromList(getActivity(), resourceId);
			}
		});

		return relativeLayout;
	}

}
