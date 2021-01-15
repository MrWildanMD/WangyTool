package com.willmd.wangytool;

import androidx.appcompat.app.AppCompatActivity;
import androidx.emoji.bundled.BundledEmojiCompatConfig;
import androidx.emoji.text.EmojiCompat;
import androidx.emoji.widget.EmojiEditText;
import androidx.emoji.widget.EmojiTextView;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EmojiEditText edit1, edit2;
    private Button bt1, bt2;
    private EmojiTextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EmojiCompat.Config config = new BundledEmojiCompatConfig(this);
        EmojiCompat.init(config);
        setContentView(R.layout.activity_main);

        edit1 = (EmojiEditText) findViewById(R.id.field_nama);
        edit2 = (EmojiEditText) findViewById(R.id.hasil);

        textView = (EmojiTextView) findViewById(R.id.titles);

        bt1 = (Button) findViewById(R.id.template1);
        bt2 = (Button) findViewById(R.id.salintext);

        textView.setHorizontallyScrolling(true);
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView.setSingleLine();
        textView.setSelected(true);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String nama = edit1.getText().toString().trim();
                edit2.setText(nama + " " + nama + " " + nama + " " + "❤️ ❤️ ❤️ WANGI WANGI WANGI WANGI HU HA HU HA HU HA, aaaah baunya rambut " + nama + " wangi aku mau nyiumin aroma wanginya " + nama + " AAAAAAAAH ~ Rambutnya.... aaah rambutnya juga pengen aku elus-elus ~~~~ AAAAAH " + nama + " keluar pertama kali di anime juga manis ❤️ ❤️ ❤️ banget AAAAAAAAH " + nama + " AAAAA LUCCUUUUUUUUUUUUUUU............ " + nama + " AAAAAAAAAAAAAAAAAAAAGH ❤️ ❤️ ❤️ apa ? " + nama + " itu gak nyata ? Cuma HALU katamu ? nggak, ngak ngak ngak ngak NGAAAAAAAAK GUA GAK PERCAYA ITU DIA NYATA NGAAAAAAAAAAAAAAAAAK PEDULI BANGSAAAAAT !! GUA GAK PEDULI SAMA KENYATAAN POKOKNYA GAK PEDULI. ❤️ ❤️ ❤️ " + nama + " gw ..." + nama + " di laptop ngeliatin gw, " + nama + " .. kamu percaya sama aku ? aaaaaaaaaaah syukur " + nama + " aku gak mau merelakan " + nama + " aaaaaah ❤️ ❤️ ❤️ YEAAAAAAAAAAAH GUA MASIH PUNYA " + nama + " SENDIRI PUN NGGAK SAMA AAAAAAAAAAAAAAH'");
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String hasil = edit2.getText().toString().trim();
                ClipboardManager clipboard = (ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Text", hasil);
                clipboard.setPrimaryClip(clip);
                Toast.makeText(MainActivity.this, "Text Disalin", Toast.LENGTH_SHORT).show();
            }
        });
    }
}