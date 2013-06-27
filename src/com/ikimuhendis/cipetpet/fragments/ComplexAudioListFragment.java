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
public class ComplexAudioListFragment extends SherlockFragment {

	private static ComplexAudioListFragment fragment;

	public static ComplexAudioListFragment getInstance() {
		if (fragment == null) {
			fragment = new ComplexAudioListFragment();
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
				R.array.audio_complex_list);
		final ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				getActivity(), android.R.layout.simple_list_item_1, audio_list);
		listview.setAdapter(adapter);
		listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				int resourceId = -1;
				if (position == 0) {
					resourceId = R.raw.comp_aniya_3_kiya_4_cer_4_liooo_1;
				} else if (position == 1) {
					resourceId = R.raw.comp_bicinik_2;
				} else if (position == 2) {
					resourceId = R.raw.comp_cak_4;
				} else if (position == 3) {
					resourceId = R.raw.comp_cap_2;
				} else if (position == 4) {
					resourceId = R.raw.comp_cel_3;
				} else if (position == 5) {
					resourceId = R.raw.comp_cer_4;
				} else if (position == 6) {
					resourceId = R.raw.comp_ci_1_pet_5;
				} else if (position == 7) {
					resourceId = R.raw.comp_ci_pet_6x5_cibili_3_sak_6;
				} else if (position == 8) {
					resourceId = R.raw.comp_cibili_2_sak_6;
				} else if (position == 9) {
					resourceId = R.raw.comp_cibili_3_sak_6;
				} else if (position == 10) {
					resourceId = R.raw.comp_cipet_2;
				} else if (position == 11) {
					resourceId = R.raw.comp_cipi_2_sak_5_kis_4_eyav_3_cer_5;
				} else if (position == 12) {
					resourceId = R.raw.comp_cipi_4_sak_8_vijio_1;
				} else if (position == 13) {
					resourceId = R.raw.comp_cipi_4;
				} else if (position == 14) {
					resourceId = R.raw.comp_cirling_2_pirr_1_cak_4_bicinik_2_aniya_1_zirr_1;
				} else if (position == 15) {
					resourceId = R.raw.comp_cirling_2;
				} else if (position == 16) {
					resourceId = R.raw.comp_eyav_3;
				} else if (position == 17) {
					resourceId = R.raw.comp_kaf_2;
				} else if (position == 18) {
					resourceId = R.raw.comp_kah_2;
				} else if (position == 19) {
					resourceId = R.raw.comp_kis_3;
				} else if (position == 20) {
					resourceId = R.raw.comp_kis_5;
				} else if (position == 21) {
					resourceId = R.raw.comp_kiya_2;
				} else if (position == 22) {
					resourceId = R.raw.comp_sak_5;
				} else if (position == 23) {
					resourceId = R.raw.comp_vayis_3;
				} else if (position == 24) {
					resourceId = R.raw.comp_vec_3_sak_3;
				} else if (position == 25) {
					resourceId = R.raw.comp_vec_3;
				} else if (position == 26) {
					resourceId = R.raw.comp_veris_3_sak_3;
				} else if (position == 27) {
					resourceId = R.raw.comp_veris_3;
				} else if (position == 28) {
					resourceId = R.raw.comp_veste_3_sak_3;
				}

				else if (position == 29) {
					resourceId = R.raw.comp_veste_3;
				}
				MediaPlayerUtil.playAudioFromList(getActivity(), resourceId);
			}
		});

		return relativeLayout;
	}
}
