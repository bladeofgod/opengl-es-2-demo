package com.bedrock.opengl_es_2_demo.render;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * @author LiJiaqi
 * @date 2020/2/6
 * Description:
 */
public class GLRenderer implements GLSurfaceView.Renderer {
    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eglConfig) {
        GLES20.glClearColor(1.0f, 0.0f, 0.0f, 1.0f);//rbga

    }

    @Override
    public void onSurfaceChanged(GL10 gl10, int i, int i1) {
        // i : width    ---  i1 : height
        GLES20.glViewport(0,0,i,i1);

    }

    @Override
    public void onDrawFrame(GL10 gl10) {
        //清除颜色缓存和深度缓存
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT | GLES20.GL_DEPTH_BUFFER_BIT);

    }
}
