package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

final class DrawerLayout$SavedState$1
  implements Parcelable.ClassLoaderCreator
{
  public DrawerLayout.SavedState a(Parcel paramParcel)
  {
    DrawerLayout.SavedState localSavedState = new android/support/v4/widget/DrawerLayout$SavedState;
    localSavedState.<init>(paramParcel, null);
    return localSavedState;
  }
  
  public DrawerLayout.SavedState a(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    DrawerLayout.SavedState localSavedState = new android/support/v4/widget/DrawerLayout$SavedState;
    localSavedState.<init>(paramParcel, paramClassLoader);
    return localSavedState;
  }
  
  public DrawerLayout.SavedState[] a(int paramInt)
  {
    return new DrawerLayout.SavedState[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\DrawerLayout$SavedState$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */