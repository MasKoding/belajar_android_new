package com.example.belajarandroidactivity

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageButton
import android.widget.ImageView

class OpenCameraActivity : AppCompatActivity() {
//    deklarasikan variabel
    var ibCamera: ImageButton? = null
    var ivSample: ImageView? = null
    var pic_id = 123

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_camera)
//        isi datanya pakai fungsi findViewById()
        ibCamera = findViewById(R.id.ibCamera)
        ivSample = findViewById(R.id.ivSample)

//        action ketika image camera di klik
        ibCamera!!.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent,pic_id)
        }
    }
//    function kedua = onActivityResult
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
//    jika gambarnya ada
      if(requestCode == pic_id){
          val photo:Bitmap = data?.extras?.get("data") as Bitmap
          ivSample!!.setImageBitmap(photo)
      }

    }
}