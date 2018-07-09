package com.zph.three360panorama.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zph.glpanorama.GLPanorama;
import com.zph.three360panorama.R;

/**
 * Created by 張鵬輝 on 2017/8/29.
 * <p>
 * E-mail: 1344670918@qq.com
 * <p>
 * CSDN: http://blog.csdn.net/QingTianGG
 * <p>
 * 有问题欢迎随时来找我共同解决
 */
public class OpenGLActivity extends AppCompatActivity {

    private GLPanorama mGLPanorama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_gl);
        mGLPanorama = (GLPanorama) findViewById(R.id.mGLPanorama);
        //传入全景图片
        mGLPanorama.setGLPanorama(R.drawable.imggugong);
    }

}
