package id.ac.ugm.presensi.presensimahasiswa.utils.Activities;

import android.os.IBinder;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

class b$5
  implements TextView.OnEditorActionListener
{
  b$5(b paramb, EditText paramEditText) {}
  
  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    int i = 1;
    if (paramKeyEvent != null)
    {
      int j = paramKeyEvent.getAction();
      if (j != i) {}
    }
    else
    {
      InputMethodManager localInputMethodManager = (InputMethodManager)this.b.getSystemService("input_method");
      IBinder localIBinder = this.a.getWindowToken();
      localInputMethodManager.hideSoftInputFromWindow(localIBinder, 0);
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasisw\\utils\Activities\b$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */