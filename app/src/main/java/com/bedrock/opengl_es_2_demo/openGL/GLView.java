package com.bedrock.opengl_es_2_demo.openGL;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

import com.bedrock.opengl_es_2_demo.render.GLRenderer;

public class GLView extends GLSurfaceView {

    private GLRenderer mRender;

    public GLView(Context context) {
        super(context);
    }

    public GLView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    private void init(){
        setEGLContextClientVersion(2);//设置为open gl es 2.0 context
        mRender = new GLRenderer();
        setRenderer(mRender);//设置渲染器
    }

}




















