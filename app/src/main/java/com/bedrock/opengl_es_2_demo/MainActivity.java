package com.bedrock.opengl_es_2_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bedrock.opengl_es_2_demo.openGL.GLView;

public class MainActivity extends AppCompatActivity {

    private GLView glView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        glView = findViewById(R.id.gl_view);

    }
}
