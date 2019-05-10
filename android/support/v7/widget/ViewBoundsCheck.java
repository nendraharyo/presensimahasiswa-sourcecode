package android.support.v7.widget;

import android.view.View;

class ViewBoundsCheck
{
  static final int CVE_PVE_POS = 12;
  static final int CVE_PVS_POS = 8;
  static final int CVS_PVE_POS = 4;
  static final int CVS_PVS_POS = 0;
  static final int EQ = 2;
  static final int FLAG_CVE_EQ_PVE = 8192;
  static final int FLAG_CVE_EQ_PVS = 512;
  static final int FLAG_CVE_GT_PVE = 4096;
  static final int FLAG_CVE_GT_PVS = 256;
  static final int FLAG_CVE_LT_PVE = 16384;
  static final int FLAG_CVE_LT_PVS = 1024;
  static final int FLAG_CVS_EQ_PVE = 32;
  static final int FLAG_CVS_EQ_PVS = 2;
  static final int FLAG_CVS_GT_PVE = 16;
  static final int FLAG_CVS_GT_PVS = 1;
  static final int FLAG_CVS_LT_PVE = 64;
  static final int FLAG_CVS_LT_PVS = 4;
  static final int GT = 1;
  static final int LT = 4;
  static final int MASK = 7;
  ViewBoundsCheck.BoundFlags mBoundFlags;
  final ViewBoundsCheck.Callback mCallback;
  
  ViewBoundsCheck(ViewBoundsCheck.Callback paramCallback)
  {
    this.mCallback = paramCallback;
    ViewBoundsCheck.BoundFlags localBoundFlags = new android/support/v7/widget/ViewBoundsCheck$BoundFlags;
    localBoundFlags.<init>();
    this.mBoundFlags = localBoundFlags;
  }
  
  View findOneViewWithinBoundFlags(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = this.mCallback.getParentStart();
    ViewBoundsCheck.Callback localCallback1 = this.mCallback;
    int j = localCallback1.getParentEnd();
    if (paramInt2 > paramInt1) {}
    Object localObject1;
    Object localObject2;
    Object localObject3;
    boolean bool;
    for (int k = 1;; k = -1)
    {
      localObject1 = null;
      if (paramInt1 == paramInt2) {
        break label204;
      }
      localObject2 = this.mCallback.getChildAt(paramInt1);
      localObject3 = this.mCallback;
      int m = ((ViewBoundsCheck.Callback)localObject3).getChildStart((View)localObject2);
      ViewBoundsCheck.Callback localCallback2 = this.mCallback;
      int n = localCallback2.getChildEnd((View)localObject2);
      ViewBoundsCheck.BoundFlags localBoundFlags = this.mBoundFlags;
      localBoundFlags.setBounds(i, j, m, n);
      if (paramInt3 == 0) {
        break;
      }
      this.mBoundFlags.resetFlags();
      this.mBoundFlags.addFlags(paramInt3);
      localObject3 = this.mBoundFlags;
      bool = ((ViewBoundsCheck.BoundFlags)localObject3).boundsMatch();
      if (!bool) {
        break;
      }
      label144:
      return (View)localObject2;
    }
    if (paramInt4 != 0)
    {
      this.mBoundFlags.resetFlags();
      this.mBoundFlags.addFlags(paramInt4);
      localObject3 = this.mBoundFlags;
      bool = ((ViewBoundsCheck.BoundFlags)localObject3).boundsMatch();
      if (!bool) {}
    }
    for (;;)
    {
      paramInt1 += k;
      localObject1 = localObject2;
      break;
      label204:
      localObject2 = localObject1;
      break label144;
      localObject2 = localObject1;
    }
  }
  
  boolean isViewWithinBoundFlags(View paramView, int paramInt)
  {
    ViewBoundsCheck.BoundFlags localBoundFlags = this.mBoundFlags;
    ViewBoundsCheck.Callback localCallback1 = this.mCallback;
    int i = localCallback1.getParentStart();
    ViewBoundsCheck.Callback localCallback2 = this.mCallback;
    int j = localCallback2.getParentEnd();
    ViewBoundsCheck.Callback localCallback3 = this.mCallback;
    int k = localCallback3.getChildStart(paramView);
    ViewBoundsCheck.Callback localCallback4 = this.mCallback;
    int m = localCallback4.getChildEnd(paramView);
    localBoundFlags.setBounds(i, j, k, m);
    boolean bool;
    if (paramInt != 0)
    {
      this.mBoundFlags.resetFlags();
      this.mBoundFlags.addFlags(paramInt);
      localBoundFlags = this.mBoundFlags;
      bool = localBoundFlags.boundsMatch();
    }
    for (;;)
    {
      return bool;
      bool = false;
      localBoundFlags = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ViewBoundsCheck.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */