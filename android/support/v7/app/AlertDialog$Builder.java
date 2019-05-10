package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;

public class AlertDialog$Builder
{
  private final AlertController.AlertParams P;
  private final int mTheme;
  
  public AlertDialog$Builder(Context paramContext)
  {
    this(paramContext, i);
  }
  
  public AlertDialog$Builder(Context paramContext, int paramInt)
  {
    AlertController.AlertParams localAlertParams = new android/support/v7/app/AlertController$AlertParams;
    ContextThemeWrapper localContextThemeWrapper = new android/view/ContextThemeWrapper;
    int i = AlertDialog.resolveDialogTheme(paramContext, paramInt);
    localContextThemeWrapper.<init>(paramContext, i);
    localAlertParams.<init>(localContextThemeWrapper);
    this.P = localAlertParams;
    this.mTheme = paramInt;
  }
  
  public AlertDialog create()
  {
    AlertDialog localAlertDialog = new android/support/v7/app/AlertDialog;
    Object localObject = this.P.mContext;
    int i = this.mTheme;
    localAlertDialog.<init>((Context)localObject, i);
    localObject = this.P;
    AlertController localAlertController = localAlertDialog.mAlert;
    ((AlertController.AlertParams)localObject).apply(localAlertController);
    boolean bool = this.P.mCancelable;
    localAlertDialog.setCancelable(bool);
    localObject = this.P;
    bool = ((AlertController.AlertParams)localObject).mCancelable;
    if (bool)
    {
      bool = true;
      localAlertDialog.setCanceledOnTouchOutside(bool);
    }
    localObject = this.P.mOnCancelListener;
    localAlertDialog.setOnCancelListener((DialogInterface.OnCancelListener)localObject);
    localObject = this.P.mOnDismissListener;
    localAlertDialog.setOnDismissListener((DialogInterface.OnDismissListener)localObject);
    localObject = this.P.mOnKeyListener;
    if (localObject != null)
    {
      localObject = this.P.mOnKeyListener;
      localAlertDialog.setOnKeyListener((DialogInterface.OnKeyListener)localObject);
    }
    return localAlertDialog;
  }
  
  public Context getContext()
  {
    return this.P.mContext;
  }
  
  public Builder setAdapter(ListAdapter paramListAdapter, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.P.mAdapter = paramListAdapter;
    this.P.mOnClickListener = paramOnClickListener;
    return this;
  }
  
  public Builder setCancelable(boolean paramBoolean)
  {
    this.P.mCancelable = paramBoolean;
    return this;
  }
  
  public Builder setCursor(Cursor paramCursor, DialogInterface.OnClickListener paramOnClickListener, String paramString)
  {
    this.P.mCursor = paramCursor;
    this.P.mLabelColumn = paramString;
    this.P.mOnClickListener = paramOnClickListener;
    return this;
  }
  
  public Builder setCustomTitle(View paramView)
  {
    this.P.mCustomTitleView = paramView;
    return this;
  }
  
  public Builder setIcon(int paramInt)
  {
    this.P.mIconId = paramInt;
    return this;
  }
  
  public Builder setIcon(Drawable paramDrawable)
  {
    this.P.mIcon = paramDrawable;
    return this;
  }
  
  public Builder setIconAttribute(int paramInt)
  {
    TypedValue localTypedValue = new android/util/TypedValue;
    localTypedValue.<init>();
    this.P.mContext.getTheme().resolveAttribute(paramInt, localTypedValue, true);
    AlertController.AlertParams localAlertParams = this.P;
    int i = localTypedValue.resourceId;
    localAlertParams.mIconId = i;
    return this;
  }
  
  public Builder setInverseBackgroundForced(boolean paramBoolean)
  {
    this.P.mForceInverseBackground = paramBoolean;
    return this;
  }
  
  public Builder setItems(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    AlertController.AlertParams localAlertParams = this.P;
    CharSequence[] arrayOfCharSequence = this.P.mContext.getResources().getTextArray(paramInt);
    localAlertParams.mItems = arrayOfCharSequence;
    this.P.mOnClickListener = paramOnClickListener;
    return this;
  }
  
  public Builder setItems(CharSequence[] paramArrayOfCharSequence, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.P.mItems = paramArrayOfCharSequence;
    this.P.mOnClickListener = paramOnClickListener;
    return this;
  }
  
  public Builder setMessage(int paramInt)
  {
    AlertController.AlertParams localAlertParams = this.P;
    CharSequence localCharSequence = this.P.mContext.getText(paramInt);
    localAlertParams.mMessage = localCharSequence;
    return this;
  }
  
  public Builder setMessage(CharSequence paramCharSequence)
  {
    this.P.mMessage = paramCharSequence;
    return this;
  }
  
  public Builder setMultiChoiceItems(int paramInt, boolean[] paramArrayOfBoolean, DialogInterface.OnMultiChoiceClickListener paramOnMultiChoiceClickListener)
  {
    AlertController.AlertParams localAlertParams = this.P;
    CharSequence[] arrayOfCharSequence = this.P.mContext.getResources().getTextArray(paramInt);
    localAlertParams.mItems = arrayOfCharSequence;
    this.P.mOnCheckboxClickListener = paramOnMultiChoiceClickListener;
    this.P.mCheckedItems = paramArrayOfBoolean;
    this.P.mIsMultiChoice = true;
    return this;
  }
  
  public Builder setMultiChoiceItems(Cursor paramCursor, String paramString1, String paramString2, DialogInterface.OnMultiChoiceClickListener paramOnMultiChoiceClickListener)
  {
    this.P.mCursor = paramCursor;
    this.P.mOnCheckboxClickListener = paramOnMultiChoiceClickListener;
    this.P.mIsCheckedColumn = paramString1;
    this.P.mLabelColumn = paramString2;
    this.P.mIsMultiChoice = true;
    return this;
  }
  
  public Builder setMultiChoiceItems(CharSequence[] paramArrayOfCharSequence, boolean[] paramArrayOfBoolean, DialogInterface.OnMultiChoiceClickListener paramOnMultiChoiceClickListener)
  {
    this.P.mItems = paramArrayOfCharSequence;
    this.P.mOnCheckboxClickListener = paramOnMultiChoiceClickListener;
    this.P.mCheckedItems = paramArrayOfBoolean;
    this.P.mIsMultiChoice = true;
    return this;
  }
  
  public Builder setNegativeButton(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    AlertController.AlertParams localAlertParams = this.P;
    CharSequence localCharSequence = this.P.mContext.getText(paramInt);
    localAlertParams.mNegativeButtonText = localCharSequence;
    this.P.mNegativeButtonListener = paramOnClickListener;
    return this;
  }
  
  public Builder setNegativeButton(CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.P.mNegativeButtonText = paramCharSequence;
    this.P.mNegativeButtonListener = paramOnClickListener;
    return this;
  }
  
  public Builder setNegativeButtonIcon(Drawable paramDrawable)
  {
    this.P.mNegativeButtonIcon = paramDrawable;
    return this;
  }
  
  public Builder setNeutralButton(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    AlertController.AlertParams localAlertParams = this.P;
    CharSequence localCharSequence = this.P.mContext.getText(paramInt);
    localAlertParams.mNeutralButtonText = localCharSequence;
    this.P.mNeutralButtonListener = paramOnClickListener;
    return this;
  }
  
  public Builder setNeutralButton(CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.P.mNeutralButtonText = paramCharSequence;
    this.P.mNeutralButtonListener = paramOnClickListener;
    return this;
  }
  
  public Builder setNeutralButtonIcon(Drawable paramDrawable)
  {
    this.P.mNeutralButtonIcon = paramDrawable;
    return this;
  }
  
  public Builder setOnCancelListener(DialogInterface.OnCancelListener paramOnCancelListener)
  {
    this.P.mOnCancelListener = paramOnCancelListener;
    return this;
  }
  
  public Builder setOnDismissListener(DialogInterface.OnDismissListener paramOnDismissListener)
  {
    this.P.mOnDismissListener = paramOnDismissListener;
    return this;
  }
  
  public Builder setOnItemSelectedListener(AdapterView.OnItemSelectedListener paramOnItemSelectedListener)
  {
    this.P.mOnItemSelectedListener = paramOnItemSelectedListener;
    return this;
  }
  
  public Builder setOnKeyListener(DialogInterface.OnKeyListener paramOnKeyListener)
  {
    this.P.mOnKeyListener = paramOnKeyListener;
    return this;
  }
  
  public Builder setPositiveButton(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    AlertController.AlertParams localAlertParams = this.P;
    CharSequence localCharSequence = this.P.mContext.getText(paramInt);
    localAlertParams.mPositiveButtonText = localCharSequence;
    this.P.mPositiveButtonListener = paramOnClickListener;
    return this;
  }
  
  public Builder setPositiveButton(CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.P.mPositiveButtonText = paramCharSequence;
    this.P.mPositiveButtonListener = paramOnClickListener;
    return this;
  }
  
  public Builder setPositiveButtonIcon(Drawable paramDrawable)
  {
    this.P.mPositiveButtonIcon = paramDrawable;
    return this;
  }
  
  public Builder setRecycleOnMeasureEnabled(boolean paramBoolean)
  {
    this.P.mRecycleOnMeasure = paramBoolean;
    return this;
  }
  
  public Builder setSingleChoiceItems(int paramInt1, int paramInt2, DialogInterface.OnClickListener paramOnClickListener)
  {
    AlertController.AlertParams localAlertParams = this.P;
    CharSequence[] arrayOfCharSequence = this.P.mContext.getResources().getTextArray(paramInt1);
    localAlertParams.mItems = arrayOfCharSequence;
    this.P.mOnClickListener = paramOnClickListener;
    this.P.mCheckedItem = paramInt2;
    this.P.mIsSingleChoice = true;
    return this;
  }
  
  public Builder setSingleChoiceItems(Cursor paramCursor, int paramInt, String paramString, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.P.mCursor = paramCursor;
    this.P.mOnClickListener = paramOnClickListener;
    this.P.mCheckedItem = paramInt;
    this.P.mLabelColumn = paramString;
    this.P.mIsSingleChoice = true;
    return this;
  }
  
  public Builder setSingleChoiceItems(ListAdapter paramListAdapter, int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.P.mAdapter = paramListAdapter;
    this.P.mOnClickListener = paramOnClickListener;
    this.P.mCheckedItem = paramInt;
    this.P.mIsSingleChoice = true;
    return this;
  }
  
  public Builder setSingleChoiceItems(CharSequence[] paramArrayOfCharSequence, int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.P.mItems = paramArrayOfCharSequence;
    this.P.mOnClickListener = paramOnClickListener;
    this.P.mCheckedItem = paramInt;
    this.P.mIsSingleChoice = true;
    return this;
  }
  
  public Builder setTitle(int paramInt)
  {
    AlertController.AlertParams localAlertParams = this.P;
    CharSequence localCharSequence = this.P.mContext.getText(paramInt);
    localAlertParams.mTitle = localCharSequence;
    return this;
  }
  
  public Builder setTitle(CharSequence paramCharSequence)
  {
    this.P.mTitle = paramCharSequence;
    return this;
  }
  
  public Builder setView(int paramInt)
  {
    this.P.mView = null;
    this.P.mViewLayoutResId = paramInt;
    this.P.mViewSpacingSpecified = false;
    return this;
  }
  
  public Builder setView(View paramView)
  {
    this.P.mView = paramView;
    this.P.mViewLayoutResId = 0;
    this.P.mViewSpacingSpecified = false;
    return this;
  }
  
  public Builder setView(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.P.mView = paramView;
    this.P.mViewLayoutResId = 0;
    this.P.mViewSpacingSpecified = true;
    this.P.mViewSpacingLeft = paramInt1;
    this.P.mViewSpacingTop = paramInt2;
    this.P.mViewSpacingRight = paramInt3;
    this.P.mViewSpacingBottom = paramInt4;
    return this;
  }
  
  public AlertDialog show()
  {
    AlertDialog localAlertDialog = create();
    localAlertDialog.show();
    return localAlertDialog;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AlertDialog$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */