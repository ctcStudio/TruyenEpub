package com.ctcstudio.truyenepub.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.ctcstudio.truyenepub.entities.SettingBook;
import com.ctcstudio.truyenepub.fragment.ContentChapFragment;

import java.util.ArrayList;

/**
 * Created by HungHN on 5/10/2015.
 */
public class SlidePagerAdapter extends FragmentStatePagerAdapter {

    private ArrayList<String> listPage = new ArrayList<String>();

    private SettingBook settingBook;

    public SlidePagerAdapter(FragmentManager fm, ArrayList<String> lst, SettingBook setting) {
        super(fm);
        listPage = lst;
        settingBook = setting;
    }

    public ArrayList<String> getListPage() {
        return listPage;
    }

    public void setListPage(ArrayList<String> listPage) {
        this.listPage = listPage;
    }

    public SettingBook getSettingBook() {
        return settingBook;
    }

    public void setSettingBook(SettingBook settingBook) {
        this.settingBook = settingBook;
    }

    public int getItemPosition(Object item) {
        return POSITION_NONE;
    }

    @Override
    public Fragment getItem(int position) {

        return ContentChapFragment.create(listPage.get(position), settingBook);
    }

    @Override
    public int getCount() {
        return listPage.size();
    }
}

