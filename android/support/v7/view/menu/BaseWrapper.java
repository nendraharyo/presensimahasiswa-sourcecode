package android.support.v7.view.menu;

class BaseWrapper
{
  final Object mWrappedObject;
  
  BaseWrapper(Object paramObject)
  {
    if (paramObject == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Wrapped Object can not be null.");
      throw localIllegalArgumentException;
    }
    this.mWrappedObject = paramObject;
  }
  
  public Object getWrappedObject()
  {
    return this.mWrappedObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\BaseWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */