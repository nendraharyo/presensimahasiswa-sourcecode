package android.support.design.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

class BottomNavigationPresenter$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  int a;
  
  static
  {
    BottomNavigationPresenter.SavedState.1 local1 = new android/support/design/internal/BottomNavigationPresenter$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  BottomNavigationPresenter$SavedState() {}
  
  BottomNavigationPresenter$SavedState(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    this.a = i;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = this.a;
    paramParcel.writeInt(i);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\internal\BottomNavigationPresenter$SavedState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */