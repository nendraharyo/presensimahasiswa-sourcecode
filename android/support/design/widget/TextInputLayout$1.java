package android.support.design.widget;

import android.text.Editable;
import android.text.TextWatcher;

class TextInputLayout$1
  implements TextWatcher
{
  TextInputLayout$1(TextInputLayout paramTextInputLayout) {}
  
  public void afterTextChanged(Editable paramEditable)
  {
    TextInputLayout localTextInputLayout1 = this.a;
    TextInputLayout localTextInputLayout2 = this.a;
    boolean bool = TextInputLayout.a(localTextInputLayout2);
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      localTextInputLayout1.a(bool);
      localTextInputLayout2 = this.a;
      bool = localTextInputLayout2.c;
      if (bool)
      {
        localTextInputLayout2 = this.a;
        int i = paramEditable.length();
        localTextInputLayout2.a(i);
      }
      return;
      bool = false;
      localTextInputLayout2 = null;
    }
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\TextInputLayout$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */