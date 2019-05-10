package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.AbsSavedState;

public class AppBarLayout$Behavior$SavedState
  extends AbsSavedState
{
  public static final Parcelable.Creator CREATOR;
  int a;
  float b;
  boolean c;
  
  static
  {
    AppBarLayout.Behavior.SavedState.1 local1 = new android/support/design/widget/AppBarLayout$Behavior$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public AppBarLayout$Behavior$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    int i = paramParcel.readInt();
    this.a = i;
    float f = paramParcel.readFloat();
    this.b = f;
    i = paramParcel.readByte();
    if (i != 0) {
      i = 1;
    }
    for (f = Float.MIN_VALUE;; f = 0.0F)
    {
      this.c = i;
      return;
      i = 0;
    }
  }
  
  public AppBarLayout$Behavior$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    int i = this.a;
    paramParcel.writeInt(i);
    float f = this.b;
    paramParcel.writeFloat(f);
    boolean bool = this.c;
    if (bool) {
      bool = true;
    }
    for (f = Float.MIN_VALUE;; f = 0.0F)
    {
      byte b1 = (byte)bool;
      paramParcel.writeByte(b1);
      return;
      b1 = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\AppBarLayout$Behavior$SavedState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */