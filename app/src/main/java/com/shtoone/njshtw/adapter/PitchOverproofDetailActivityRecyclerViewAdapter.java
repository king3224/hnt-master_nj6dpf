package com.shtoone.njshtw.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.shtoone.njshtw.R;
import com.shtoone.njshtw.bean.PitchProduceQueryDetailActivityData;
import com.shtoone.njshtw.bean.SC_chaxunItem_xq_data;
import com.socks.library.KLog;

import java.util.List;

/**
 * Created by gesangdianzi on 2016/9/6.
 */
public class PitchOverproofDetailActivityRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final String TAG = ProduceQueryDetailActivityRecyclerViewAdapter.class.getSimpleName();
    private Context context;
    private PitchProduceQueryDetailActivityData itemsData;
    private Resources mResources;
    private List<SC_chaxunItem_xq_data> lists;

    public PitchOverproofDetailActivityRecyclerViewAdapter(Context context, List<SC_chaxunItem_xq_data> lists) {
        super();
        this.context = context;
        this.lists = lists;
        KLog.e(TAG,"lists=:"+lists.toString());
        mResources = context.getResources();
    }

    @Override
    public int getItemCount() {

        if (lists !=null && lists.size() > 0) {
//            KLog.e(TAG,"======getItemCount======");
            return lists.size();
        }
        return 0;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {

            ItemViewHolder mItemViewHolder = (ItemViewHolder) holder;
            //    PitchProduceQueryDetailActivityData.DataEntity item = itemsData.get(position);
//            ViewGroup mViewGroup = (ViewGroup) mItemViewHolder.tv_material_name.getParent();
//
//          mViewGroup.setBackgroundColor(position % 2 == 0 ? mResources.getColor(R.color.material_teal_50) : mResources.getColor(R.color.material_blue_50));
        SC_chaxunItem_xq_data sc_chaxunItem_xq_data = lists.get(position);
        KLog.e(TAG,"sc_chaxunItem_xq_data=:"+sc_chaxunItem_xq_data.toString());
        KLog.e(TAG,"name=:"+sc_chaxunItem_xq_data.getName());
        mItemViewHolder.tv_material_name.setText(lists.get(position).getName());
        mItemViewHolder.tv_reality.setText(lists.get(position).getYongliang());
        mItemViewHolder.tv_matching.setText(lists.get(position).getShiji());
        mItemViewHolder.tv_deviation.setText(lists.get(position).getPeibi());
        mItemViewHolder.tv_deviation_rate.setText(lists.get(position).getWucha());
        KLog.e(TAG,"======onBindViewHolder======");
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        KLog.e(TAG,"======onCreateViewHolder======");
        return new ItemViewHolder(LayoutInflater.from(context).inflate(R.layout.item_recyclerview_produce_query_detail_activity, parent, false));
    }

    static class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView tv_material_name;
        TextView tv_reality;
        TextView tv_matching;
        TextView tv_deviation;
        TextView tv_deviation_rate;

        public ItemViewHolder(View view) {
            super(view);
            KLog.e(TAG,"======ItemViewHolder======");
            tv_material_name = (TextView) view.findViewById(R.id.tv_material_name_item_recyclerview_produce_query_detal_activity);
            tv_reality = (TextView) view.findViewById(R.id.tv_reality_item_recyclerview_produce_query_detal_activity);
            tv_matching = (TextView) view.findViewById(R.id.tv_matching_item_recyclerview_produce_query_detal_activity);
            tv_deviation = (TextView) view.findViewById(R.id.tv_deviation_item_recyclerview_produce_query_detal_activity);
            tv_deviation_rate = (TextView) view.findViewById(R.id.tv_deviation_rate_item_recyclerview_produce_query_detal_activity);
        }
    }
}
