package android.support.v7.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

class AppCompatDelegateImplV9$PanelFeatureState$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  int featureId;
  boolean isOpen;
  Bundle menuState;
  
  static
  {
    AppCompatDelegateImplV9.PanelFeatureState.SavedState.1 local1 = new android/support/v7/app/AppCompatDelegateImplV9$PanelFeatureState$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  static SavedState readFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    int i = 1;
    SavedState localSavedState = new android/support/v7/app/AppCompatDelegateImplV9$PanelFeatureState$SavedState;
    localSavedState.<init>();
    int j = paramParcel.readInt();
    localSavedState.featureId = j;
    j = paramParcel.readInt();
    if (j == i) {}
    for (;;)
    {
      localSavedState.isOpen = i;
      i = localSavedState.isOpen;
      if (i != 0)
      {
        localBundle = paramParcel.readBundle(paramClassLoader);
        localSavedState.menuState = localBundle;
      }
      return localSavedState;
      i = 0;
      Bundle localBundle = null;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = this.featureId;
    paramParcel.writeInt(i);
    int j = this.isOpen;
    if (j != 0) {
      j = 1;
    }
    for (;;)
    {
      paramParcel.writeInt(j);
      boolean bool = this.isOpen;
      if (bool)
      {
        localBundle = this.menuState;
        paramParcel.writeBundle(localBundle);
      }
      return;
      bool = false;
      Bundle localBundle = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatDelegateImplV9$PanelFeatureState$SavedState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */