package com.example.myapplication;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by flynn on 09/03/2017.
 */

class CustomPagerAdapter extends PagerAdapter {


    Context mContext;
    //LayoutInflater mLayoutInflater;

     CustomPagerAdapter(Context context){
        this.mContext = context;
        //mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount(){
        return mResources.length;
    }
    int [] mResources = {
            R.drawable.athlonecastle,
            R.drawable.birrcastle,
            R.drawable.brunaboinne,
            R.drawable.castleleslie,
            R.drawable.cavanburrenpark,
            R.drawable.crafttolace,
            R.drawable.curragh,
            R.drawable.glendalough,
            R.drawable.hilloftara,
            R.drawable.hillofuisneach,
            R.drawable.ironageroad,
            R.drawable.powerscourtestate,
            R.drawable.proposalstones,
            R.drawable.rebelgeneral,
            R.drawable.silentstonewatchmen,
            R.drawable.studgardens,
            R.drawable.temporarytomb,
            R.drawable.wicklowgaol,
            R.drawable.wonderfulwomen,
            R.drawable.loughgur,
            R.drawable.rockofcashel,
            R.drawable.dunmorecaves,
            R.drawable.kilkennymedevilmile,
            R.drawable.borrishousesonofaking,
            R.drawable.jerpointabbeyfindingsanta,
            R.drawable.dunbrodyfamineship,
            R.drawable.waterfordvikingtriangle,
            R.drawable.tinternabbeywilliamm,
            R.drawable.hooklighthouse,
            R.drawable.corkmerchantcity,
            R.drawable.crosshavencorktreasure,
            R.drawable.titanicexperiencecobh,
            R.drawable.cobhharbor
    };


    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((ImageView)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container,int position){

        ImageView mImageView = new ImageView(mContext);
        mImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        mImageView.setImageResource(mResources[position]);
        ((ViewPager)container).addView(mImageView,0);
        return mImageView;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        ((ViewPager)container).removeView((ImageView)object);
    }

}
