package com.bedrock.opengl_es_2_demo.openGL;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

import com.bedrock.opengl_es_2_demo.render.GLRenderer;
import com.bedrock.opengl_es_2_demo.render.TriangleGLRender;

public class GLView extends GLSurfaceView {

    private GLRenderer mRender;
    private TriangleGLRender triangleGLRender;

    public GLView(Context context) {
        super(context);
    }

    public GLView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    private void init(){
        setEGLContextClientVersion(2);//设置为open gl es 2.0 context
        //mRender = new GLRenderer();
        triangleGLRender = new TriangleGLRender();
        setRenderer(triangleGLRender);//设置渲染器
    }

}




















