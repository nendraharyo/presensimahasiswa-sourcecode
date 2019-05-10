package android.support.design.widget;

import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.WithHint;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

public class n
  extends AppCompatEditText
{
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    InputConnection localInputConnection = super.onCreateInputConnection(paramEditorInfo);
    if (localInputConnection != null)
    {
      localObject = paramEditorInfo.hintText;
      if (localObject != null) {}
    }
    for (Object localObject = getParent();; localObject = ((ViewParent)localObject).getParent())
    {
      boolean bool = localObject instanceof View;
      if (bool)
      {
        bool = localObject instanceof WithHint;
        if (bool)
        {
          localObject = ((WithHint)localObject).getHint();
          paramEditorInfo.hintText = ((CharSequence)localObject);
        }
      }
      else
      {
        return localInputConnection;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */