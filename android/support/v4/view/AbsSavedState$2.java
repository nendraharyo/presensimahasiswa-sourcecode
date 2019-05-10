package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

final class AbsSavedState$2
  implements Parcelable.ClassLoaderCreator
{
  public AbsSavedState a(Parcel paramParcel)
  {
    return a(paramParcel, null);
  }
  
  public AbsSavedState a(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    Object localObject = paramParcel.readParcelable(paramClassLoader);
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("superState must be null");
      throw ((Throwable)localObject);
    }
    return AbsSavedState.EMPTY_STATE;
  }
  
  public AbsSavedState[] a(int paramInt)
  {
    return new AbsSavedState[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\AbsSavedState$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */