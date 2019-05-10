package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.AbsSavedState;

public class Toolbar$SavedState
  extends AbsSavedState
{
  public static final Parcelable.Creator CREATOR;
  int expandedMenuItemId;
  boolean isOverflowOpen;
  
  static
  {
    Toolbar.SavedState.1 local1 = new android/support/v7/widget/Toolbar$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public Toolbar$SavedState(Parcel paramParcel)
  {
    this(paramParcel, null);
  }
  
  public Toolbar$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    int i = paramParcel.readInt();
    this.expandedMenuItemId = i;
    i = paramParcel.readInt();
    if (i != 0) {}
    for (i = 1;; i = 0)
    {
      this.isOverflowOpen = i;
      return;
    }
  }
  
  public Toolbar$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    int i = this.expandedMenuItemId;
    paramParcel.writeInt(i);
    int j = this.isOverflowOpen;
    if (j != 0) {}
    int k;
    for (j = 1;; k = 0)
    {
      paramParcel.writeInt(j);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\Toolbar$SavedState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */