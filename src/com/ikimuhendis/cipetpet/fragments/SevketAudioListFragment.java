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
public class SevketAudioListFragment extends SherlockFragment {

	private static SevketAudioListFragment fragment;

	public static SevketAudioListFragment getInstance() {
		if (fragment == null) {
			fragment = new SevketAudioListFragment();
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
				R.array.audio_sevket_list);
		final ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				getActivity(), android.R.layout.simple_list_item_1, audio_list);
		listview.setAdapter(adapter);
		listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				int resourceId = -1;
				if (position == 0) {
					resourceId = R.raw.sevket_amatoru_egelendirir;
				} else if (position == 1) {
					resourceId = R.raw.sevket_atarlar_disari;
				} else if (position == 2) {
					resourceId = R.raw.sevket_baska;
				} else if (position == 3) {
					resourceId = R.raw.sevket_bunlar_kus_degil;
				} else if (position == 4) {
					resourceId = R.raw.sevket_hadi_yavrum_bir_daha_vur;
				} else if (position == 5) {
					resourceId = R.raw.sevket_herseyin_bir_makami_var;
				} else if (position == 6) {
					resourceId = R.raw.sevket_lezzetli_cipetpet_degil;
				} else if (position == 7) {
					resourceId = R.raw.sevket_lezzetli_cipetpet;
				} else if (position == 8) {
					resourceId = R.raw.sevket_mesela;
				} else if (position == 9) {
					resourceId = R.raw.sevket_otuyo_mu_otuyo;
				} else if (position == 10) {
					resourceId = R.raw.sevket_yuru_derler;
				}
				MediaPlayerUtil.playAudioFromList(getActivity(), resourceId);
			}
		});

		return relativeLayout;
	}

}
