package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.AbsSavedState;

public class DrawerLayout$SavedState
  extends AbsSavedState
{
  public static final Parcelable.Creator CREATOR;
  int a = 0;
  int b;
  int c;
  int d;
  int e;
  
  static
  {
    DrawerLayout.SavedState.1 local1 = new android/support/v4/widget/DrawerLayout$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public DrawerLayout$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    int i = paramParcel.readInt();
    this.a = i;
    i = paramParcel.readInt();
    this.b = i;
    i = paramParcel.readInt();
    this.c = i;
    i = paramParcel.readInt();
    this.d = i;
    i = paramParcel.readInt();
    this.e = i;
  }
  
  public DrawerLayout$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    int i = this.a;
    paramParcel.writeInt(i);
    i = this.b;
    paramParcel.writeInt(i);
    i = this.c;
    paramParcel.writeInt(i);
    i = this.d;
    paramParcel.writeInt(i);
    i = this.e;
    paramParcel.writeInt(i);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\DrawerLayout$SavedState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */