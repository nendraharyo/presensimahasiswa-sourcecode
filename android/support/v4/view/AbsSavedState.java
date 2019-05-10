package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public abstract class AbsSavedState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final AbsSavedState EMPTY_STATE;
  private final Parcelable mSuperState;
  
  static
  {
    Object localObject = new android/support/v4/view/AbsSavedState$1;
    ((AbsSavedState.1)localObject).<init>();
    EMPTY_STATE = (AbsSavedState)localObject;
    localObject = new android/support/v4/view/AbsSavedState$2;
    ((AbsSavedState.2)localObject).<init>();
    CREATOR = (Parcelable.Creator)localObject;
  }
  
  private AbsSavedState()
  {
    this.mSuperState = null;
  }
  
  protected AbsSavedState(Parcel paramParcel)
  {
    this(paramParcel, null);
  }
  
  protected AbsSavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    Object localObject = paramParcel.readParcelable(paramClassLoader);
    if (localObject != null) {}
    for (;;)
    {
      this.mSuperState = ((Parcelable)localObject);
      return;
      localObject = EMPTY_STATE;
    }
  }
  
  protected AbsSavedState(Parcelable paramParcelable)
  {
    if (paramParcelable == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("superState must not be null");
      throw ((Throwable)localObject);
    }
    Object localObject = EMPTY_STATE;
    if (paramParcelable != localObject) {}
    for (;;)
    {
      this.mSuperState = paramParcelable;
      return;
      paramParcelable = null;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final Parcelable getSuperState()
  {
    return this.mSuperState;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Parcelable localParcelable = this.mSuperState;
    paramParcel.writeParcelable(localParcelable, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\AbsSavedState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */