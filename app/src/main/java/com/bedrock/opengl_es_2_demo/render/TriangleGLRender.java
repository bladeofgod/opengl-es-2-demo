package com.bedrock.opengl_es_2_demo.render;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

import com.bedrock.opengl_es_2_demo.widget.Triangle;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * @author LiJiaqi
 * @date 2020/2/6
 * Description:
 */
public class TriangleGLRender implements GLSurfaceView.Renderer {

    private Triangle mTriangle;

    public static int loadShader(int type,String shaderCode){
        int shader = GLES20.glCreateShader(type);//创建着色器
        GLES20.glShaderSource(shader, shaderCode);//添加着色器 代码
        GLES20.glCompileShader(shader);//编译
        return shader;
    }


    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eglConfig) {
        GLES20.glClearColor(1.0f, 0.0f, 0.0f, 1.0f);
        mTriangle = new Triangle();

    }

    @Override
    public void onSurfaceChanged(GL10 gl10, int i, int i1) {
        GLES20.glViewport(0,0,i,i1);//GL 视口

    }

    @Override
    public void onDrawFrame(GL10 gl10) {
        //清除颜色缓存和深度缓存
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT | GLES20.GL_DEPTH_BUFFER_BIT);
        mTriangle.draw();

    }
}
