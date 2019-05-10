package android.support.v7.widget;

import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

class SearchView$AutoCompleteTextViewReflector
{
  private Method doAfterTextChanged;
  private Method doBeforeTextChanged;
  private Method ensureImeVisible;
  private Method showSoftInputUnchecked;
  
  SearchView$AutoCompleteTextViewReflector()
  {
    Object localObject = AutoCompleteTextView.class;
    String str = "doBeforeTextChanged";
    int i = 0;
    Class[] arrayOfClass = null;
    try
    {
      arrayOfClass = new Class[0];
      localObject = ((Class)localObject).getDeclaredMethod(str, arrayOfClass);
      this.doBeforeTextChanged = ((Method)localObject);
      localObject = this.doBeforeTextChanged;
      bool = true;
      ((Method)localObject).setAccessible(bool);
    }
    catch (NoSuchMethodException localNoSuchMethodException3)
    {
      boolean bool;
      for (;;) {}
    }
    localObject = AutoCompleteTextView.class;
    str = "doAfterTextChanged";
    i = 0;
    arrayOfClass = null;
    try
    {
      arrayOfClass = new Class[0];
      localObject = ((Class)localObject).getDeclaredMethod(str, arrayOfClass);
      this.doAfterTextChanged = ((Method)localObject);
      localObject = this.doAfterTextChanged;
      bool = true;
      ((Method)localObject).setAccessible(bool);
    }
    catch (NoSuchMethodException localNoSuchMethodException2)
    {
      for (;;) {}
    }
    localObject = AutoCompleteTextView.class;
    str = "ensureImeVisible";
    i = 1;
    try
    {
      arrayOfClass = new Class[i];
      Class localClass = Boolean.TYPE;
      arrayOfClass[0] = localClass;
      localObject = ((Class)localObject).getMethod(str, arrayOfClass);
      this.ensureImeVisible = ((Method)localObject);
      localObject = this.ensureImeVisible;
      bool = true;
      ((Method)localObject).setAccessible(bool);
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException1)
    {
      for (;;) {}
    }
  }
  
  void doAfterTextChanged(AutoCompleteTextView paramAutoCompleteTextView)
  {
    Method localMethod = this.doAfterTextChanged;
    if (localMethod != null) {}
    try
    {
      localMethod = this.doAfterTextChanged;
      Object[] arrayOfObject = null;
      arrayOfObject = new Object[0];
      localMethod.invoke(paramAutoCompleteTextView, arrayOfObject);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  void doBeforeTextChanged(AutoCompleteTextView paramAutoCompleteTextView)
  {
    Method localMethod = this.doBeforeTextChanged;
    if (localMethod != null) {}
    try
    {
      localMethod = this.doBeforeTextChanged;
      Object[] arrayOfObject = null;
      arrayOfObject = new Object[0];
      localMethod.invoke(paramAutoCompleteTextView, arrayOfObject);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  void ensureImeVisible(AutoCompleteTextView paramAutoCompleteTextView, boolean paramBoolean)
  {
    Method localMethod = this.ensureImeVisible;
    if (localMethod != null) {}
    try
    {
      localMethod = this.ensureImeVisible;
      int i = 1;
      Object[] arrayOfObject = new Object[i];
      Boolean localBoolean = Boolean.valueOf(paramBoolean);
      arrayOfObject[0] = localBoolean;
      localMethod.invoke(paramAutoCompleteTextView, arrayOfObject);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\SearchView$AutoCompleteTextViewReflector.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */