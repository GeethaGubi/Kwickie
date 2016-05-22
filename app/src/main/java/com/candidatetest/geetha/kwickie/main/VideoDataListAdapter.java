package com.candidatetest.geetha.kwickie.main;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.candidatetest.geetha.kwickie.R;
import com.candidatetest.geetha.kwickie.video.VideoActivity;
import com.candidatetest.kwickie.retrofit.KwickieData;

import java.io.File;
import java.util.List;

/**
 * Created by geetha on 22/05/2016.
 */
public class VideoDataListAdapter extends RecyclerView.Adapter<VideoDataListAdapter.ViewHolder> {

    private List<KwickieData> kwickieDataList;
    private Context context;
    private final String TAG = "VideoDataListAdapter";

    public VideoDataListAdapter(Context context, List<KwickieData> kwickieDataList) {
        this.kwickieDataList = kwickieDataList;
        this.context = context;
    }

    @Override
    public void onViewRecycled(ViewHolder holder) {
        super.onViewRecycled(holder);

        holder.ausr.setText("");
        holder.qusr.setText("");
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_video_data,null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final KwickieData kwickieData = kwickieDataList.get(position);
        String qUsrString = context.getString(R.string.quser)+": "+kwickieData.getQuestionUser().getFirstName()+ " " + kwickieData.getQuestionUser().getLastName();
        String aUsrString = context.getString(R.string.auser)+": "+kwickieData.getAnswerUser().getFirstName()+" "+kwickieData.getAnswerUser().getLastName();
        holder.qusr.setText(qUsrString);
        holder.ausr.setText(aUsrString);
        String thumbUrl = kwickieData.getKwickieVideo().getThumbUrl();
        String extension = thumbUrl.substring(thumbUrl.length() - 4, thumbUrl.length());
        String filePath = context.getFilesDir().getAbsolutePath() + "/" + kwickieData.getKwickieVideo().getId() + extension;

        if(new File(filePath).exists()) {
            holder.thumbImg.setImageDrawable(Drawable.createFromPath(filePath));
        } else {
            Log.d(TAG,"thumbnail does not exist");
        }



        holder.playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, VideoActivity.class);
                intent.putExtra("videourl",kwickieData.getKwickieVideo().getProcessPlaylistUrl());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return kwickieDataList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }

        TextView qusr =  (TextView) itemView.findViewById(R.id.quser);
        TextView ausr = (TextView) itemView.findViewById(R.id.auser);
        ImageView thumbImg = (ImageView) itemView.findViewById(R.id.thumbImg);
        ImageView playButton = (ImageView) itemView.findViewById(R.id.play);


    }
}
