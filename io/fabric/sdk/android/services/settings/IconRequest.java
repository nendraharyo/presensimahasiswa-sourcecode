package io.fabric.sdk.android.services.settings;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;

public class IconRequest
{
  public final String hash;
  public final int height;
  public final int iconResourceId;
  public final int width;
  
  public IconRequest(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    this.hash = paramString;
    this.iconResourceId = paramInt1;
    this.width = paramInt2;
    this.height = paramInt3;
  }
  
  public static IconRequest build(Context paramContext, String paramString)
  {
    if (paramString != null) {}
    for (;;)
    {
      try
      {
        int i = CommonUtils.getAppIconResourceId(paramContext);
        Object localObject1 = Fabric.getLogger();
        localObject3 = "Fabric";
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        String str = "App icon resource ID is ";
        localObject4 = ((StringBuilder)localObject4).append(str);
        localObject4 = ((StringBuilder)localObject4).append(i);
        localObject4 = ((StringBuilder)localObject4).toString();
        ((Logger)localObject1).d((String)localObject3, (String)localObject4);
        localObject3 = new android/graphics/BitmapFactory$Options;
        ((BitmapFactory.Options)localObject3).<init>();
        bool = true;
        ((BitmapFactory.Options)localObject3).inJustDecodeBounds = bool;
        localObject1 = paramContext.getResources();
        BitmapFactory.decodeResource((Resources)localObject1, i, (BitmapFactory.Options)localObject3);
        localObject1 = new io/fabric/sdk/android/services/settings/IconRequest;
        int j = ((BitmapFactory.Options)localObject3).outWidth;
        int k = ((BitmapFactory.Options)localObject3).outHeight;
        ((IconRequest)localObject1).<init>(paramString, i, j, k);
        return (IconRequest)localObject1;
      }
      catch (Exception localException)
      {
        Logger localLogger = Fabric.getLogger();
        Object localObject3 = "Fabric";
        Object localObject4 = "Failed to load icon";
        localLogger.e((String)localObject3, (String)localObject4, localException);
      }
      boolean bool = false;
      Object localObject2 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\settings\IconRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */