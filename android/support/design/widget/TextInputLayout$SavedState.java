package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.AbsSavedState;
import android.text.TextUtils;

class TextInputLayout$SavedState
  extends AbsSavedState
{
  public static final Parcelable.Creator CREATOR;
  CharSequence a;
  boolean b;
  
  static
  {
    TextInputLayout.SavedState.1 local1 = new android/support/design/widget/TextInputLayout$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  TextInputLayout$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    CharSequence localCharSequence = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    this.a = localCharSequence;
    int j = paramParcel.readInt();
    if (j == i) {
      j = i;
    }
    for (;;)
    {
      this.b = j;
      return;
      j = 0;
      localCharSequence = null;
    }
  }
  
  TextInputLayout$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("TextInputLayout.SavedState{");
    Object localObject = Integer.toHexString(System.identityHashCode(this));
    localStringBuilder = localStringBuilder.append((String)localObject).append(" error=");
    localObject = this.a;
    return localObject + "}";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    CharSequence localCharSequence = this.a;
    TextUtils.writeToParcel(localCharSequence, paramParcel, paramInt);
    int i = this.b;
    if (i != 0) {
      i = 1;
    }
    for (;;)
    {
      paramParcel.writeInt(i);
      return;
      int j = 0;
      localCharSequence = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\TextInputLayout$SavedState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */