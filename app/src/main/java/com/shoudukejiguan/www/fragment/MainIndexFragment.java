package com.shoudukejiguan.www.fragment;

import android.view.View;

import com.shoudukejiguan.www.R;
import com.shoudukejiguan.www.adapter.GridViewCenterAdapter;
import com.shoudukejiguan.www.view.MaxGridView;
import com.shoudukejiguan.www.view.RotationRelativeLayout;
import com.shoudukejiguan.www.view.TipView;

import java.util.ArrayList;
import java.util.List;


/**
 */
public class MainIndexFragment extends MainBaseFragment {
    private RotationRelativeLayout layout_rotation;
    private MaxGridView gv_center;
    private TipView tip_notice;
    private String[] titles = {"新闻资讯", "票务预订", "参观指引", "扫一扫"};
    private int[] images = {R.mipmap.index_menu_news, R.mipmap.index_menu_booktic, R.mipmap.index_menu_map, R.mipmap.index_menu_sao};

    @Override
    protected boolean isInit() {
        return true;
    }

    @Override
    protected void initData() {
        List<String> urlList = new ArrayList<String>();
        urlList.add("http://cdn.duitang.com/uploads/item/201412/04/20141204163409_Tdusf.thumb.700_0.jpeg");
        urlList.add("http://img1.v.tmcdn.net/img/h000/h08/img20120822145108301270.jpg");
        urlList.add("http://p1.gexing.com/shaitu/20120729/1434/5014d993268f5.jpg");
        urlList.add("http://img5.duitang.com/uploads/item/201411/29/20141129233121_GQPWn.thumb.700_0.jpeg");
        layout_rotation.setUrls(urlList);
        gv_center.setAdapter(new GridViewCenterAdapter(getContext(), titles, images));
        tip_notice.setTipList(urlList);
    }

    @Override
    protected void initView(View view) {
        gv_center = (MaxGridView) view.findViewById(R.id.gv_center);
        layout_rotation = (RotationRelativeLayout) view.findViewById(R.id.layout_rotation);
        tip_notice = (TipView) view.findViewById(R.id.tip_notice);
    }

    @Override
    protected int getRid() {
        return R.layout.fragment_main_index;
    }

    @Override
    protected String getTitleBarTitle() {
        return "首都科学技术馆";
    }
}
