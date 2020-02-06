package com.bedrock.opengl_es_2_demo.widget;

import java.nio.FloatBuffer;

/**
 * @author LiJiaqi
 * @date 2020/2/6
 * Description:
 */
public class Triangle {

    private FloatBuffer vertexBuffer;//顶点缓冲
    private final String vertexShaderCode =//顶点着色代码
            "attribute vec4 vPosition;" +
                    "void main() {" +
                    "  gl_Position = vPosition;" +
                    "}";
    private final String fragmentShaderCode =//片元着色代码
            "precision mediump float;" +
                    "uniform vec4 vColor;" +
                    "void main() {" +
                    "  gl_FragColor = vColor;" +
                    "}";


    private final int mProgram;


}






