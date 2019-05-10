package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;
import android.widget.EditText;

final class zzjv$6
  implements DialogInterface.OnClickListener
{
  zzjv$6(JsPromptResult paramJsPromptResult, EditText paramEditText) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    JsPromptResult localJsPromptResult = this.zzOi;
    String str = this.zzOj.getText().toString();
    localJsPromptResult.confirm(str);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzjv$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */