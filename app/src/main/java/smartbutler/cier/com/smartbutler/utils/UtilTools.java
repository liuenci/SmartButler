package smartbutler.cier.com.smartbutler.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

public class UtilTools {

    //设置字体
    public static void setFont(Context mContext, TextView textview) {
        Typeface fontType = Typeface.createFromAsset(mContext.getAssets(), "fonts/FONT.TTF");
        textview.setTypeface(fontType);
    }
}
