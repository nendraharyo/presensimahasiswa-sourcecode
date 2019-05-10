package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.AbsSavedState;
import android.util.SparseArray;

public class CoordinatorLayout$SavedState
  extends AbsSavedState
{
  public static final Parcelable.Creator CREATOR;
  SparseArray a;
  
  static
  {
    CoordinatorLayout.SavedState.1 local1 = new android/support/design/widget/CoordinatorLayout$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public CoordinatorLayout$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    int i = paramParcel.readInt();
    int[] arrayOfInt = new int[i];
    paramParcel.readIntArray(arrayOfInt);
    Parcelable[] arrayOfParcelable = paramParcel.readParcelableArray(paramClassLoader);
    SparseArray localSparseArray1 = new android/util/SparseArray;
    localSparseArray1.<init>(i);
    this.a = localSparseArray1;
    int j = 0;
    localSparseArray1 = null;
    while (j < i)
    {
      SparseArray localSparseArray2 = this.a;
      int k = arrayOfInt[j];
      Parcelable localParcelable = arrayOfParcelable[j];
      localSparseArray2.append(k, localParcelable);
      j += 1;
    }
  }
  
  public CoordinatorLayout$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 0;
    super.writeToParcel(paramParcel, paramInt);
    Object localObject = this.a;
    int j;
    if (localObject != null)
    {
      localObject = this.a;
      j = ((SparseArray)localObject).size();
    }
    int[] arrayOfInt;
    Parcelable[] arrayOfParcelable;
    for (int k = j;; k = 0)
    {
      paramParcel.writeInt(k);
      arrayOfInt = new int[k];
      arrayOfParcelable = new Parcelable[k];
      while (i < k)
      {
        j = this.a.keyAt(i);
        arrayOfInt[i] = j;
        localObject = (Parcelable)this.a.valueAt(i);
        arrayOfParcelable[i] = localObject;
        i += 1;
      }
    }
    paramParcel.writeIntArray(arrayOfInt);
    paramParcel.writeParcelableArray(arrayOfParcelable, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\CoordinatorLayout$SavedState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */