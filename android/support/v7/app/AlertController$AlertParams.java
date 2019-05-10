package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;

public class AlertController$AlertParams
{
  public ListAdapter mAdapter;
  public boolean mCancelable;
  public int mCheckedItem = -1;
  public boolean[] mCheckedItems;
  public final Context mContext;
  public Cursor mCursor;
  public View mCustomTitleView;
  public boolean mForceInverseBackground;
  public Drawable mIcon;
  public int mIconAttrId = 0;
  public int mIconId = 0;
  public final LayoutInflater mInflater;
  public String mIsCheckedColumn;
  public boolean mIsMultiChoice;
  public boolean mIsSingleChoice;
  public CharSequence[] mItems;
  public String mLabelColumn;
  public CharSequence mMessage;
  public Drawable mNegativeButtonIcon;
  public DialogInterface.OnClickListener mNegativeButtonListener;
  public CharSequence mNegativeButtonText;
  public Drawable mNeutralButtonIcon;
  public DialogInterface.OnClickListener mNeutralButtonListener;
  public CharSequence mNeutralButtonText;
  public DialogInterface.OnCancelListener mOnCancelListener;
  public DialogInterface.OnMultiChoiceClickListener mOnCheckboxClickListener;
  public DialogInterface.OnClickListener mOnClickListener;
  public DialogInterface.OnDismissListener mOnDismissListener;
  public AdapterView.OnItemSelectedListener mOnItemSelectedListener;
  public DialogInterface.OnKeyListener mOnKeyListener;
  public AlertController.AlertParams.OnPrepareListViewListener mOnPrepareListViewListener;
  public Drawable mPositiveButtonIcon;
  public DialogInterface.OnClickListener mPositiveButtonListener;
  public CharSequence mPositiveButtonText;
  public boolean mRecycleOnMeasure;
  public CharSequence mTitle;
  public View mView;
  public int mViewLayoutResId;
  public int mViewSpacingBottom;
  public int mViewSpacingLeft;
  public int mViewSpacingRight;
  public boolean mViewSpacingSpecified = false;
  public int mViewSpacingTop;
  
  public AlertController$AlertParams(Context paramContext)
  {
    this.mRecycleOnMeasure = bool;
    this.mContext = paramContext;
    this.mCancelable = bool;
    LayoutInflater localLayoutInflater = (LayoutInflater)paramContext.getSystemService("layout_inflater");
    this.mInflater = localLayoutInflater;
  }
  
  private void createListView(AlertController paramAlertController)
  {
    int i = 16908308;
    int j = 1;
    Object localObject1 = null;
    Object localObject2 = this.mInflater;
    int k = paramAlertController.mListLayout;
    int m = 0;
    Object localObject3 = null;
    AlertController.RecycleListView localRecycleListView = (AlertController.RecycleListView)((LayoutInflater)localObject2).inflate(k, null);
    boolean bool1 = this.mIsMultiChoice;
    Object localObject4;
    label176:
    boolean bool2;
    if (bool1)
    {
      localObject2 = this.mCursor;
      if (localObject2 == null)
      {
        localObject2 = new android/support/v7/app/AlertController$AlertParams$1;
        localObject3 = this.mContext;
        int i2 = paramAlertController.mMultiChoiceItemLayout;
        localObject1 = this.mItems;
        localObject4 = this;
        ((AlertController.AlertParams.1)localObject2).<init>(this, (Context)localObject3, i2, i, (CharSequence[])localObject1, localRecycleListView);
        localObject4 = this.mOnPrepareListViewListener;
        if (localObject4 != null)
        {
          localObject4 = this.mOnPrepareListViewListener;
          ((AlertController.AlertParams.OnPrepareListViewListener)localObject4).onPrepareListView(localRecycleListView);
        }
        paramAlertController.mAdapter = ((ListAdapter)localObject2);
        int n = this.mCheckedItem;
        paramAlertController.mCheckedItem = n;
        localObject2 = this.mOnClickListener;
        if (localObject2 == null) {
          break label428;
        }
        localObject2 = new android/support/v7/app/AlertController$AlertParams$3;
        ((AlertController.AlertParams.3)localObject2).<init>(this, paramAlertController);
        localRecycleListView.setOnItemClickListener((AdapterView.OnItemClickListener)localObject2);
        localObject2 = this.mOnItemSelectedListener;
        if (localObject2 != null)
        {
          localObject2 = this.mOnItemSelectedListener;
          localRecycleListView.setOnItemSelectedListener((AdapterView.OnItemSelectedListener)localObject2);
        }
        bool2 = this.mIsSingleChoice;
        if (!bool2) {
          break label463;
        }
        localRecycleListView.setChoiceMode(j);
      }
    }
    for (;;)
    {
      paramAlertController.mListView = localRecycleListView;
      return;
      localObject4 = new android/support/v7/app/AlertController$AlertParams$2;
      Object localObject5 = this.mContext;
      Object localObject6 = this.mCursor;
      localObject3 = this;
      Object localObject7 = paramAlertController;
      ((AlertController.AlertParams.2)localObject4).<init>(this, (Context)localObject5, (Cursor)localObject6, false, localRecycleListView, paramAlertController);
      localObject2 = localObject4;
      break;
      bool2 = this.mIsSingleChoice;
      if (bool2) {}
      for (m = paramAlertController.mSingleChoiceItemLayout;; m = paramAlertController.mListItemLayout)
      {
        localObject2 = this.mCursor;
        if (localObject2 == null) {
          break label376;
        }
        localObject2 = new android/widget/SimpleCursorAdapter;
        localObject4 = this.mContext;
        localObject5 = this.mCursor;
        localObject7 = new String[j];
        Object localObject8 = this.mLabelColumn;
        localObject7[0] = localObject8;
        localObject8 = new int[j];
        localObject8[0] = i;
        localObject6 = localObject7;
        localObject1 = localObject8;
        ((SimpleCursorAdapter)localObject2).<init>((Context)localObject4, m, (Cursor)localObject5, (String[])localObject7, (int[])localObject8);
        break;
      }
      label376:
      localObject2 = this.mAdapter;
      if (localObject2 != null)
      {
        localObject2 = this.mAdapter;
        break;
      }
      localObject2 = new android/support/v7/app/AlertController$CheckedItemAdapter;
      localObject4 = this.mContext;
      localObject5 = this.mItems;
      ((AlertController.CheckedItemAdapter)localObject2).<init>((Context)localObject4, m, i, (CharSequence[])localObject5);
      break;
      label428:
      localObject2 = this.mOnCheckboxClickListener;
      if (localObject2 == null) {
        break label176;
      }
      localObject2 = new android/support/v7/app/AlertController$AlertParams$4;
      ((AlertController.AlertParams.4)localObject2).<init>(this, localRecycleListView, paramAlertController);
      localRecycleListView.setOnItemClickListener((AdapterView.OnItemClickListener)localObject2);
      break label176;
      label463:
      bool2 = this.mIsMultiChoice;
      if (bool2)
      {
        int i1 = 2;
        localRecycleListView.setChoiceMode(i1);
      }
    }
  }
  
  public void apply(AlertController paramAlertController)
  {
    int i = 0;
    Object localObject = this.mCustomTitleView;
    if (localObject != null)
    {
      localObject = this.mCustomTitleView;
      paramAlertController.setCustomTitle((View)localObject);
      localObject = this.mMessage;
      if (localObject != null)
      {
        localObject = this.mMessage;
        paramAlertController.setMessage((CharSequence)localObject);
      }
      localObject = this.mPositiveButtonText;
      int j;
      CharSequence localCharSequence;
      DialogInterface.OnClickListener localOnClickListener;
      Drawable localDrawable;
      if (localObject == null)
      {
        localObject = this.mPositiveButtonIcon;
        if (localObject == null) {}
      }
      else
      {
        j = -1;
        localCharSequence = this.mPositiveButtonText;
        localOnClickListener = this.mPositiveButtonListener;
        localDrawable = this.mPositiveButtonIcon;
        localObject = paramAlertController;
        paramAlertController.setButton(j, localCharSequence, localOnClickListener, null, localDrawable);
      }
      localObject = this.mNegativeButtonText;
      if (localObject == null)
      {
        localObject = this.mNegativeButtonIcon;
        if (localObject == null) {}
      }
      else
      {
        j = -2;
        localCharSequence = this.mNegativeButtonText;
        localOnClickListener = this.mNegativeButtonListener;
        localDrawable = this.mNegativeButtonIcon;
        localObject = paramAlertController;
        paramAlertController.setButton(j, localCharSequence, localOnClickListener, null, localDrawable);
      }
      localObject = this.mNeutralButtonText;
      if (localObject == null)
      {
        localObject = this.mNeutralButtonIcon;
        if (localObject == null) {}
      }
      else
      {
        j = -3;
        localCharSequence = this.mNeutralButtonText;
        localOnClickListener = this.mNeutralButtonListener;
        localDrawable = this.mNeutralButtonIcon;
        localObject = paramAlertController;
        paramAlertController.setButton(j, localCharSequence, localOnClickListener, null, localDrawable);
      }
      localObject = this.mItems;
      if (localObject == null)
      {
        localObject = this.mCursor;
        if (localObject == null)
        {
          localObject = this.mAdapter;
          if (localObject == null) {
            break label236;
          }
        }
      }
      createListView(paramAlertController);
      label236:
      localObject = this.mView;
      if (localObject == null) {
        break label409;
      }
      boolean bool = this.mViewSpacingSpecified;
      if (!bool) {
        break label396;
      }
      View localView = this.mView;
      int m = this.mViewSpacingLeft;
      int n = this.mViewSpacingTop;
      i = this.mViewSpacingRight;
      int i1 = this.mViewSpacingBottom;
      localObject = paramAlertController;
      paramAlertController.setView(localView, m, n, i, i1);
    }
    for (;;)
    {
      return;
      localObject = this.mTitle;
      if (localObject != null)
      {
        localObject = this.mTitle;
        paramAlertController.setTitle((CharSequence)localObject);
      }
      localObject = this.mIcon;
      if (localObject != null)
      {
        localObject = this.mIcon;
        paramAlertController.setIcon((Drawable)localObject);
      }
      int k = this.mIconId;
      if (k != 0)
      {
        k = this.mIconId;
        paramAlertController.setIcon(k);
      }
      k = this.mIconAttrId;
      if (k == 0) {
        break;
      }
      k = this.mIconAttrId;
      k = paramAlertController.getIconAttributeResId(k);
      paramAlertController.setIcon(k);
      break;
      label396:
      localObject = this.mView;
      paramAlertController.setView((View)localObject);
      continue;
      label409:
      k = this.mViewLayoutResId;
      if (k != 0)
      {
        k = this.mViewLayoutResId;
        paramAlertController.setView(k);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AlertController$AlertParams.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */