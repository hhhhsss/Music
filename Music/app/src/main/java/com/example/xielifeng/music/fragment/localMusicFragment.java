package com.example.xielifeng.music.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.xielifeng.music.MainActivity;
import com.example.xielifeng.music.R;

public class localMusicFragment extends Fragment implements View.OnClickListener {
    private String TAG="Music";
    private ImageView mAddLikeMusicButton;
    private ImageView mSingleCycleMusicButton;
    private ImageView mPlayModeButton;
    private ImageButton mPrevMusicButton;
    private ImageButton mPlayMusicButton;
    private ImageButton mNextMusicButton;
    private TextView mPlayMusicStartTimeTextView;
    private TextView mPlayMusicStopTimeTextView;
    private SeekBar mPlayMusicSeekBar;
    public static boolean isPlay=false;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.localmusic,container,false);
        mAddLikeMusicButton = (ImageView)view.findViewById(R.id.addLikeMusicButton);
        mSingleCycleMusicButton = (ImageView)view.findViewById(R.id.singleCycleMusicButton);
        mPlayModeButton = (ImageView)view.findViewById(R.id.playModeButton);
        mPrevMusicButton = (ImageButton)view.findViewById(R.id.prevMusicButton);
        mPlayMusicButton = (ImageButton)view.findViewById(R.id.playMusicButton);
        mNextMusicButton = (ImageButton)view.findViewById(R.id.nextMusicButton);
        mPlayMusicStartTimeTextView = (TextView)view.findViewById(R.id.playMusicStartTimeTextView);
        mPlayMusicStopTimeTextView = (TextView)view.findViewById(R.id.playMusicStopTimeTextView);
        mPlayMusicSeekBar = (SeekBar)view.findViewById(R.id.playMusicSeekBar);
        mPlayMusicButton.setOnClickListener(this);//设置点击播放按钮事件
       return view;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.playMusicButton:
                if(!isPlay){
                mPlayMusicButton.setBackgroundResource(R.drawable.pause_image);
                isPlay=true;
            }else{
                mPlayMusicButton.setBackgroundResource(R.drawable.play_music);
                isPlay=false;
            }
            break;
            default:break;
        }
    }
}
