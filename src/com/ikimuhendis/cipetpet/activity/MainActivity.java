package com.ikimuhendis.cipetpet.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.Window;
import android.widget.ArrayAdapter;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.OnNavigationListener;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.ikimuhendis.cipetpet.R;
import com.ikimuhendis.cipetpet.fragments.ComplexAudioListFragment;
import com.ikimuhendis.cipetpet.fragments.SevketAudioListFragment;
import com.ikimuhendis.cipetpet.fragments.SimpleAudioListFragment;

public class MainActivity extends SherlockFragmentActivity {

	private MainActivity mActivity = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
		setContentView(R.layout.activity_main);
		mActivity = this;

		/*
		 * action bar settings
		 */
		ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayShowTitleEnabled(false);
		actionBar.setDisplayHomeAsUpEnabled(false);
		actionBar.setDisplayUseLogoEnabled(true);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
		setSupportProgressBarIndeterminateVisibility(false);

		/*
		 * action bar nav settings
		 */

		/*
		 * frame Layout
		 */

		final String[] nav_actions = getResources().getStringArray(
				R.array.action_nav_menu);
		final ActionBar.OnNavigationListener nav_Listener = new OnNavigationListener() {
			@Override
			public boolean onNavigationItemSelected(int itemPosition,
					long itemId) {
				if (itemPosition == 0) {
					FragmentTransaction ft = getSupportFragmentManager()
							.beginTransaction();
					ft.replace(R.id.frameLayout,
							ComplexAudioListFragment.getInstance());
					ft.commit();
				} else if (itemPosition == 1) {
					FragmentTransaction ft = getSupportFragmentManager()
							.beginTransaction();
					ft.replace(R.id.frameLayout,
							SimpleAudioListFragment.getInstance());
					ft.commit();
				} else if (itemPosition == 2) {
					FragmentTransaction ft = getSupportFragmentManager()
							.beginTransaction();
					ft.replace(R.id.frameLayout,
							SevketAudioListFragment.getInstance());
					ft.commit();
				}
				return false;
			}
		};
		final ArrayAdapter<String> nav_adapter = new ArrayAdapter<String>(
				mActivity, R.layout.sherlock_spinner_item, nav_actions);
		getSupportActionBar().setListNavigationCallbacks(nav_adapter,
				nav_Listener);
		nav_adapter
				.setDropDownViewResource(R.layout.sherlock_spinner_dropdown_item);
	}

}
