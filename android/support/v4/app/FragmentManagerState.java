package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class FragmentManagerState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  FragmentState[] a;
  int[] b;
  BackStackState[] c;
  int d = -1;
  int e;
  
  static
  {
    FragmentManagerState.1 local1 = new android/support/v4/app/FragmentManagerState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public FragmentManagerState() {}
  
  public FragmentManagerState(Parcel paramParcel)
  {
    Object localObject = FragmentState.CREATOR;
    localObject = (FragmentState[])paramParcel.createTypedArray((Parcelable.Creator)localObject);
    this.a = ((FragmentState[])localObject);
    localObject = paramParcel.createIntArray();
    this.b = ((int[])localObject);
    localObject = BackStackState.CREATOR;
    localObject = (BackStackState[])paramParcel.createTypedArray((Parcelable.Creator)localObject);
    this.c = ((BackStackState[])localObject);
    int i = paramParcel.readInt();
    this.d = i;
    i = paramParcel.readInt();
    this.e = i;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.a;
    paramParcel.writeTypedArray((Parcelable[])localObject, paramInt);
    localObject = this.b;
    paramParcel.writeIntArray((int[])localObject);
    localObject = this.c;
    paramParcel.writeTypedArray((Parcelable[])localObject, paramInt);
    int i = this.d;
    paramParcel.writeInt(i);
    i = this.e;
    paramParcel.writeInt(i);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\FragmentManagerState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */