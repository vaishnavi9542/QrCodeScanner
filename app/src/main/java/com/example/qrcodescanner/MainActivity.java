package com.example.qrcodescanner;

import android.graphics.Bitmap;

import android.os.Bundle;

import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

import com.google.zxing.*;

import androidx.activity.result.ActivityResultLauncher;

import com.journeyapps.barcodescanner.ScanContract;

import com.journeyapps.barcodescanner.ScanOptions;
import com.google.zxing.common.BitMatrix;

import com.journeyapps.barcodescanner.*;

public class MainActivity
        extends AppCompatActivity {

    Button scan;

    Button create;

    TextView result;

    EditText input;

    ImageView qr;

    @Override
    protected void onCreate(
            Bundle savedInstanceState
    ){

        super.onCreate(
                savedInstanceState
        );

        setContentView(
                R.layout.activity_main
        );

        scan=
                findViewById(
                        R.id.scanBtn
                );

        create=
                findViewById(
                        R.id.createBtn
                );

        result=
                findViewById(
                        R.id.result
                );

        input=
                findViewById(
                        R.id.input
                );

        qr=
                findViewById(
                        R.id.qrImage
                );

        scan.setOnClickListener(
                v->{

                    ScanOptions options=
                            new ScanOptions();

                    options.setPrompt(
                            "Scan QR"
                    );

                    options.setBeepEnabled(
                            true
                    );

                    scanner.launch(
                            options
                    );

                });

        create.setOnClickListener(
                v->{

                    try{

                        String text=
                                input
                                        .getText()
                                        .toString();

                        BitMatrix matrix=

                                new MultiFormatWriter()

                                        .encode(

                                                text,

                                                BarcodeFormat.QR_CODE,

                                                600,

                                                600

                                        );

                        Bitmap bmp=

                                Bitmap.createBitmap(

                                        600,

                                        600,

                                        Bitmap.Config.RGB_565

                                );

                        for(
                                int x=0;
                                x<600;
                                x++
                        ){

                            for(
                                    int y=0;
                                    y<600;
                                    y++
                            ){

                                bmp.setPixel(

                                        x,

                                        y,

                                        matrix.get(
                                                x,
                                                y
                                        )

                                                ?

                                                0xFF000000

                                                :

                                                0xFFFFFFFF

                                );

                            }

                        }

                        qr.setImageBitmap(
                                bmp
                        );

                    }

                    catch(
                            Exception e
                    ){

                        e.printStackTrace();

                    }

                });

    }

    ActivityResultLauncher
            <ScanOptions>

            scanner=

            registerForActivityResult(

                    new ScanContract(),

                    result->{

                        if(
                                result
                                        .getContents()
                                        !=null
                        ){

                            this.result
                                    .setText(

                                            result
                                                    .getContents()

                                    );

                        }

                    }

            );

}