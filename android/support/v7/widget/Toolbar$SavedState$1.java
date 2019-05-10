package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

final class Toolbar$SavedState$1
  implements Parcelable.ClassLoaderCreator
{
  public Toolbar.SavedState createFromParcel(Parcel paramParcel)
  {
    Toolbar.SavedState localSavedState = new android/support/v7/widget/Toolbar$SavedState;
    localSavedState.<init>(paramParcel, null);
    return localSavedState;
  }
  
  public Toolbar.SavedState createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    Toolbar.SavedState localSavedState = new android/support/v7/widget/Toolbar$SavedState;
    localSavedState.<init>(paramParcel, paramClassLoader);
    return localSavedState;
  }
  
  public Toolbar.SavedState[] newArray(int paramInt)
  {
    return new Toolbar.SavedState[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\Toolbar$SavedState$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */