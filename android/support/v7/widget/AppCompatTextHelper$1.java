package android.support.v7.widget;

import android.graphics.Typeface;
import android.support.v4.a.a.b.a;
import java.lang.ref.WeakReference;

class AppCompatTextHelper$1
  extends b.a
{
  AppCompatTextHelper$1(AppCompatTextHelper paramAppCompatTextHelper, WeakReference paramWeakReference) {}
  
  public void onFontRetrievalFailed(int paramInt) {}
  
  public void onFontRetrieved(Typeface paramTypeface)
  {
    AppCompatTextHelper localAppCompatTextHelper = this.this$0;
    WeakReference localWeakReference = this.val$textViewWeak;
    AppCompatTextHelper.access$000(localAppCompatTextHelper, localWeakReference, paramTypeface);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AppCompatTextHelper$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */