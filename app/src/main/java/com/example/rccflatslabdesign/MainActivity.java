package com.example.rccflatslabdesign;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final int STORAGE_PERMISSION_CODE = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        checkPermission(
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                STORAGE_PERMISSION_CODE);
    }

    public void function1(View view) {
        startActivity(new Intent(MainActivity.this, FlatSlabRectangularCol.class));
    }

    public void function2(View view) {
        startActivity(new Intent(MainActivity.this, FlatSlabRectangularDrop.class));
    }

    public void function3(View view) {
        startActivity(new Intent(MainActivity.this, FlatSlabCircularDrop.class));
    }

    public void function4(View view) {
        startActivity(new Intent(MainActivity.this, FlatSlabCircularCol.class));
    }

    public void downloadpdf(View view) {
        copyReadAssets();
    }

    private void copyReadAssets() {
        AssetManager assetManager = getAssets();

        InputStream in = null;
        OutputStream out = null;
        Random r = new Random();
        String name = String.valueOf((char) 'a' + r.nextInt('z' - 'a')) + ".pdf";
        String strDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + File.separator + "Pdfs";
        File fileDir = new File(strDir);
        fileDir.mkdirs();   // crear la ruta si no existe
        File file = new File(fileDir, name);

        try {
            in = assetManager.open("book.pdf");  //leer el archivo de assets
            out = new BufferedOutputStream(new FileOutputStream(file)); //crear el archivo

            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e) {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        Uri uri = FileProvider.getUriForFile(MainActivity.this, BuildConfig.APPLICATION_ID + ".provider", new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + File.separator + "Pdfs" + "/" + name));
        intent.setDataAndType(uri, "application/pdf");
        startActivity(intent);
    }

    private void copyFile(InputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[1024];
        int read;
        while ((read = in.read(buffer)) != -1) {
            out.write(buffer, 0, read);
        }
    }

    // Function to check and request permission
    public void checkPermission(String permission, int requestCode) {

        // Checking if permission is not granted
        if (ContextCompat.checkSelfPermission(
                MainActivity.this,
                permission)
                == PackageManager.PERMISSION_DENIED) {
            ActivityCompat
                    .requestPermissions(
                            MainActivity.this,
                            new String[]{permission},
                            requestCode);
        } else {

        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           @NonNull String[] permissions,
                                           @NonNull int[] grantResults)
    {
        super
                .onRequestPermissionsResult(requestCode,
                        permissions,
                        grantResults);


       if (requestCode == STORAGE_PERMISSION_CODE) {
            if (grantResults.length > 0
                    && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(MainActivity.this,
                        "Storage Permission Granted",
                        Toast.LENGTH_SHORT)
                        .show();
            }
            else {
                Toast.makeText(MainActivity.this,
                        "Storage Permission Denied",
                        Toast.LENGTH_SHORT)
                        .show();
            }
        }
    }

}