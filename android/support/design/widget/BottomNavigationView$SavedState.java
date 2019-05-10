package android.support.design.widget;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.AbsSavedState;

class BottomNavigationView$SavedState
  extends AbsSavedState
{
  public static final Parcelable.Creator CREATOR;
  Bundle a;
  
  static
  {
    BottomNavigationView.SavedState.1 local1 = new android/support/design/widget/BottomNavigationView$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public BottomNavigationView$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    a(paramParcel, paramClassLoader);
  }
  
  public BottomNavigationView$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  private void a(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    Bundle localBundle = paramParcel.readBundle(paramClassLoader);
    this.a = localBundle;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    Bundle localBundle = this.a;
    paramParcel.writeBundle(localBundle);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\BottomNavigationView$SavedState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */