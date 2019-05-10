package android.support.v4.app;

import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

class a$d
  extends SharedElementCallback
{
  protected ab a;
  
  a$d(ab paramab)
  {
    this.a = paramab;
  }
  
  public Parcelable onCaptureSharedElementSnapshot(View paramView, Matrix paramMatrix, RectF paramRectF)
  {
    return this.a.a(paramView, paramMatrix, paramRectF);
  }
  
  public View onCreateSnapshotView(Context paramContext, Parcelable paramParcelable)
  {
    return this.a.a(paramContext, paramParcelable);
  }
  
  public void onMapSharedElements(List paramList, Map paramMap)
  {
    this.a.a(paramList, paramMap);
  }
  
  public void onRejectSharedElements(List paramList)
  {
    this.a.a(paramList);
  }
  
  public void onSharedElementEnd(List paramList1, List paramList2, List paramList3)
  {
    this.a.b(paramList1, paramList2, paramList3);
  }
  
  public void onSharedElementStart(List paramList1, List paramList2, List paramList3)
  {
    this.a.a(paramList1, paramList2, paramList3);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\a$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */